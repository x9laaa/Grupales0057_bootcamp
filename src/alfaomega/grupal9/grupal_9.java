package alfaomega.grupal9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class grupal_9 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, Capacitacion> capacitaciones = new HashMap<>();

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

        private static void ingresarCapacitacion(Scanner scanner, Map<String, Capacitacion> capacitaciones) {
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

            Capacitacion nuevaCapacitacion = new Capacitacion(rut, nombreCliente, direccion, comuna, telefono,
                    dia, hora, lugar, duracion, nombresAsistentes, edadesAsistentes);

            capacitaciones.put(rut, nuevaCapacitacion);
            System.out.println("Capacitación ingresada exitosamente.");
        }

        private static void consultarCapacitacion(Scanner scanner, Map<String, Capacitacion> capacitaciones) {
            System.out.println("Ingrese el RUT del cliente:");
            String rut = scanner.nextLine();

            if (capacitaciones.containsKey(rut)) {
                Capacitacion capacitacion = capacitaciones.get(rut);

                System.out.println("\nDatos del cliente:");
                System.out.println("RUT: " + capacitacion.getRut());
                System.out.println("Nombre: " + capacitacion.getNombreCliente());
                System.out.println("Dirección: " + capacitacion.getDireccion());
                System.out.println("Comuna: " + capacitacion.getComuna());
                System.out.println("Teléfono: " + capacitacion.getTelefono());

                System.out.println("\nDatos de la capacitación:");
                System.out.println("Día: " + capacitacion.getDia());
                System.out.println("Hora: " + capacitacion.getHora());
                System.out.println("Lugar: " + capacitacion.getLugar());
                System.out.println("Duración: " + capacitacion.getDuracion() + " horas");

                int menores25 = 0;
                int entre26y35 = 0;
                int mayores35 = 0;

                List<Integer> edadesAsistentes = capacitacion.getEdadesAsistentes();
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

    class Capacitacion {
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

        public Capacitacion(String rut, String nombreCliente, String direccion, String comuna, String telefono,
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

        public String getRut() {
            return rut;
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public String getDireccion() {
            return direccion;
        }

        public String getComuna() {
            return comuna;
        }

        public String getTelefono() {
            return telefono;
        }

        public String getDia() {
            return dia;
        }

        public String getHora() {
            return hora;
        }

        public String getLugar() {
            return lugar;
        }

        public int getDuracion() {
            return duracion;
        }

        public List<String> getNombresAsistentes() {
            return nombresAsistentes;
        }

        public List<Integer> getEdadesAsistentes() {
            return edadesAsistentes;
        }
    }
