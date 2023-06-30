package alfaomega.grupal12.grupal9;

import java.util.*;
/**
 * Esta clase representa un programa para gestionar capacitaciones y consultas de capacitaciones.
 * @author AlfaOmega
 * @version 1.0
 */
public class grupal_9_2 {
    /**
     * El punto de entrada del programa.
     * @param args Los argumentos de línea de comandos.
     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, Capacitacion2> capacitaciones = new HashMap<>();

            boolean continuar = true;
            while (continuar) {
                System.out.println("----- Menú -----");
                System.out.println("1. Ingresar nueva capacitación");
                System.out.println("2. Consultar capacitación por RUT del cliente");
                System.out.println("3. Salir");
                System.out.println("----------------");

                System.out.println("Ingrese el número de la opción deseada:");
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        ingresarCapacitacion(scanner, capacitaciones);
                        break;
                    case 2:
                        consultarCapacitacion(scanner, capacitaciones);
                        break;
                    case 3:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                }
            }

            scanner.close();
            System.out.println("¡Hasta luego!");
        }
    /**
     * Permite ingresar una nueva capacitación y almacenarla en el mapa de capacitaciones.
     * @param scanner El objeto Scanner utilizado para recibir la entrada del usuario.
     * @param capacitaciones El mapa de capacitaciones donde se almacenará la nueva capacitación.
     */
        private static void ingresarCapacitacion(Scanner scanner, Map<String, Capacitacion2> capacitaciones) {
            System.out.println("Ingrese el RUT del cliente:");
            String rut = scanner.nextLine();

            System.out.println("Ingrese el nombre del cliente:");
            String nombreCliente = scanner.nextLine();

            System.out.println("Ingrese la dirección del cliente:");
            String direccion = scanner.nextLine();

            System.out.println("Ingrese la comuna del cliente:");
            String comuna = scanner.nextLine();

            System.out.println("Ingrese el número de teléfono del cliente:");
            String telefono = scanner.nextLine();

            System.out.println("Ingrese el día de la capacitación:");
            String dia = scanner.nextLine();

            System.out.println("Ingrese la hora de la capacitación:");
            String hora = scanner.nextLine();

            System.out.println("Ingrese el lugar de la capacitación:");
            String lugar = scanner.nextLine();

            System.out.println("Ingrese la duración de la capacitación:");
            int duracion = Integer.parseInt(scanner.nextLine());

            int cantidadAsistentes;
            do {
                System.out.println("Ingrese la cantidad de asistentes (mayor que cero):");
                cantidadAsistentes = Integer.parseInt(scanner.nextLine());
            } while (cantidadAsistentes <= 0);

            List<String> nombresAsistentes = new ArrayList<>();
            List<Integer> edadesAsistentes = new ArrayList<>();

            for (int i = 0; i < cantidadAsistentes; i++) {
                System.out.println("Ingrese el nombre del asistente " + (i + 1) + ":");
                String nombreAsistente = scanner.nextLine();
                nombresAsistentes.add(nombreAsistente);

                System.out.println("Ingrese la edad del asistente " + (i + 1) + ":");
                int edadAsistente = Integer.parseInt(scanner.nextLine());
                edadesAsistentes.add(edadAsistente);
            }

            Capacitacion2 nuevaCapacitacion2 = new Capacitacion2(rut, nombreCliente, direccion, comuna, telefono,
                    dia, hora, lugar, duracion, nombresAsistentes, edadesAsistentes);

            capacitaciones.put(rut, nuevaCapacitacion2);
            System.out.println("Capacitación ingresada exitosamente.");
        }

    /**
     * Permite consultar una capacitación por el RUT del cliente y muestra los datos de la capacitación.
     * @param scanner El objeto Scanner utilizado para recibir la entrada del usuario.
     * @param capacitaciones El mapa de capacitaciones donde se buscará la capacitación.
     */
        private static void consultarCapacitacion(Scanner scanner, Map<String, Capacitacion2> capacitaciones) {
            System.out.println("Ingrese el RUT del cliente:");
            String rut = scanner.nextLine();

            if (capacitaciones.containsKey(rut)) {
                Capacitacion2 capacitacion2 = capacitaciones.get(rut);

                System.out.println("\nDatos del cliente:");
                System.out.println("RUT: " + capacitacion2.getRut());
                System.out.println("Nombre: " + capacitacion2.getNombreCliente());
                System.out.println("Dirección: " + capacitacion2.getDireccion());
                System.out.println("Comuna: " + capacitacion2.getComuna());
                System.out.println("Teléfono: " + capacitacion2.getTelefono());

                System.out.println("\nDatos de la capacitación:");
                System.out.println("Día: " + capacitacion2.getDia());
                System.out.println("Hora: " + capacitacion2.getHora());
                System.out.println("Lugar: " + capacitacion2.getLugar());
                System.out.println("Duración: " + capacitacion2.getDuracion() + " horas");

                int menores25 = 0;
                int entre26y35 = 0;
                int mayores35 = 0;

                List<Integer> edadesAsistentes = capacitacion2.getEdadesAsistentes();
                for (int edad : edadesAsistentes) {
                    if (edad < 25) {
                        menores25++;
                    } else if (edad >= 26 && edad <= 35) {
                        entre26y35++;
                    } else {
                        mayores35++;
                    }
                }

                System.out.println("\nCantidad de asistentes por rango de edad:");
                System.out.println("Menores de 25 años: " + menores25);
                System.out.println("Entre 26 y 35 años: " + entre26y35);
                System.out.println("Mayores de 35 años: " + mayores35);
            } else {
                System.out.println("No se encontró ninguna capacitación asociada al RUT ingresado.");
            }
        }

    }

    /**
    * Esta clase representa una capacitación.
    */
    class Capacitacion2 {
        private String rut;
        private String nombreCliente;
        private String direccion;
        private String comuna;
        private String telefono;
        private String dia;
        private String hora;
        private String lugar;
        private int duracion;
        private List<String> nombresAsistentes;
        private List<Integer> edadesAsistentes;

        /**
         * Crea una nueva instancia de la clase Capacitacion2.
         * @param rut El RUT del cliente.
         * @param nombreCliente El nombre del cliente.
         * @param direccion La dirección del cliente.
         * @param comuna La comuna del cliente.
         * @param telefono El número de teléfono del cliente.
         * @param dia El día de la capacitación.
         * @param hora La hora de la capacitación.
         * @param lugar El lugar de la capacitación.
         * @param duracion La duración de la capacitación en horas.
         * @param nombresAsistentes Los nombres de los asistentes.
         * @param edadesAsistentes Las edades de los asistentes.
         */
        public Capacitacion2(String rut, String nombreCliente, String direccion, String comuna, String telefono,
                             String dia, String hora, String lugar, int duracion, List<String> nombresAsistentes,
                             List<Integer> edadesAsistentes) {
            this.rut = rut;
            this.nombreCliente = nombreCliente;
            this.direccion = direccion;
            this.comuna = comuna;
            this.telefono = telefono;
            this.dia = dia;
            this.hora = hora;
            this.lugar = lugar;
            this.duracion = duracion;
            this.nombresAsistentes = nombresAsistentes;
            this.edadesAsistentes = edadesAsistentes;
        }
        /**
         * Devuelve el RUT del cliente.
         * @return El RUT del cliente.
         */
        public String getRut() {
            return rut;
        }
        /**
         * Devuelve el nombre del cliente.
         * @return El nombre del cliente.
         */
        public String getNombreCliente() {
            return nombreCliente;
        }
        /**
         * Devuelve la dirección del cliente.
         * @return La dirección del cliente.
         */
        public String getDireccion() {
            return direccion;
        }
        /**
         * Devuelve la comuna del cliente.
         * @return La comuna del cliente.
         */
        public String getComuna() {
            return comuna;
        }
        /**
         * Devuelve el número de teléfono del cliente.
         * @return El número de teléfono del cliente.
         */
        public String getTelefono() {
            return telefono;
        }
        /**
         * Devuelve el día de la capacitación.
         * @return El día de la capacitación.
         */
        public String getDia() {
            return dia;
        }
        /**
         * Devuelve la hora de la capacitación.
         * @return La hora de la capacitación.
         */
        public String getHora() {
            return hora;
        }
        /**
         * Devuelve el lugar de la capacitación.
         * @return El lugar de la capacitación.
         */
        public String getLugar() {
            return lugar;
        }
        /**
         * Devuelve la duración de la capacitación en horas.
         * @return La duración de la capacitación en horas.
         */
        public int getDuracion() {
            return duracion;
        }
        /**
         * Devuelve los nombres de los asistentes.
         * @return Los nombres de los asistentes.
         */
        public List<String> getNombresAsistentes() {
            return nombresAsistentes;
        }
        /**
         * Devuelve las edades de los asistentes.
         * @return Las edades de los asistentes.
         */
        public List<Integer> getEdadesAsistentes() {
            return edadesAsistentes;
        }
    }
