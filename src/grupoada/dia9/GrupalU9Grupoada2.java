package grupoada.dia9;

import grupoada.grupal9.Capacitacion;
import grupoada.grupal9.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase representa el programa principal para gestionar clientes y capacitaciones.
 * Permite ingresar datos de los clientes y capacitaciones, mostrar los datos de las empresas que solicitaron capacitación,
 * y calcular la cantidad de personas según su rango de edad.
 *
 * @author Grupo Ada
 * @version 1.0
 * @since 2023-05-10
 */
public class GrupalU9Grupoada2 {

    /**
     * Punto de entrada principal del programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Capacitacion> capacitaciones = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int cantidadClientes;

        System.out.print("Ingrese la cantidad de trabajadores: ");
        cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("Ingrese los datos del cliente " + (i + 1) + ":");
            System.out.print("RUT: ");
            int rut = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Empresa: ");
            String empresa = scanner.nextLine();

            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            System.out.print("Comuna: ");
            String comuna = scanner.nextLine();

            System.out.print("Número de teléfono: ");
            int telefono = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Número de la capacitación: ");
            int numeroCapacitacion = scanner.nextInt();
            scanner.nextLine();

            Cliente cliente = new Cliente(rut, nombre, empresa, direccion, comuna, telefono, numeroCapacitacion);
            clientes.add(cliente);
            System.out.println();
        }

        int cantidadCapacitaciones;

        System.out.print("Ingrese la cantidad de capacitaciones: ");
        cantidadCapacitaciones = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        for (int i = 0; i < cantidadCapacitaciones; i++) {
            System.out.println("Ingrese los datos de la capacitación " + (i + 1) + ":");
            System.out.print("Número de la capacitación: ");
            int numeroCapacitacion = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Empresa: ");
            String empresa = scanner.nextLine();

            System.out.print("Fecha de capacitación: ");
            String fechaCapacitacion = scanner.nextLine();

            System.out.print("Hora: ");
            String hora = scanner.nextLine();

            System.out.print("Lugar: ");
            String lugar = scanner.nextLine();

            System.out.print("Duración en minutos: ");
            int duracion = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Cantidad de asistentes: ");
            int cantidadAsistentes = scanner.nextInt();
            scanner.nextLine();

            Capacitacion capacitacion = new Capacitacion(numeroCapacitacion, empresa, fechaCapacitacion, hora, lugar, duracion, cantidadAsistentes);
            capacitaciones.add(capacitacion);
            System.out.println();
        }

        System.out.println("Datos de las empresas que solicitaron capacitación:");
        for (Cliente cliente : clientes) {
            for (Capacitacion capacitacion : capacitaciones) {
                if (cliente.getNumeroCapacitacion() == capacitacion.getNumeroCapacitacion()) {
                    System.out.println("Empresa: " + cliente.getEmpresa());
                    System.out.println("Datos de la capacitación:");
                    System.out.println(capacitacion.toString());
                    break;
                }
            }
        }

        int menores25 = 0;
        int entre26y35 = 0;
        int mayores35 = 0;

        for (Cliente cliente : clientes) {
            // Obtener la capacitación asociada al cliente
            Capacitacion capacitacion = null;
            for (Capacitacion cap : capacitaciones) {
                if (cap.getNumeroCapacitacion() == cliente.getNumeroCapacitacion()) {
                    capacitacion = cap;
                    break;
                }
            }

            if (capacitacion != null) {
                if (capacitacion.calcularEdadPromedio() < 25) {
                    menores25++;
                } else if (capacitacion.calcularEdadPromedio() >= 26 && capacitacion.calcularEdadPromedio() <= 35) {
                    entre26y35++;
                } else {
                    mayores35++;
                }
            }
        }

        System.out.println("\nCantidad de personas según rango de edad:");
        System.out.println("Menores a 25 años: " + menores25);
        System.out.println("Entre 26 y 35 años: " + entre26y35);
        System.out.println("Mayores a 35 años: " + mayores35);
    }

}

/**
 * Esta clase representa un cliente.
 *
 * @author [Nombre del autor]
 * @version 1.0
 * @since 2023-05-10
 */
class Cliente2 {
    private int rut;
    private String nombre;
    private String empresa;
    private String direccion;
    private String comuna;
    private int telefono;
    private int numeroCapacitacion;

    /**
     * Constructor de la clase Cliente2.
     *
     * @param rut                El RUT del cliente.
     * @param nombre             El nombre del cliente.
     * @param empresa            El nombre de la empresa del cliente.
     * @param direccion          La dirección del cliente.
     * @param comuna             La comuna del cliente.
     * @param telefono           El número de teléfono del cliente.
     * @param numeroCapacitacion El número de la capacitación asociada al cliente.
     */
    public Cliente2(int rut, String nombre, String empresa, String direccion, String comuna, int telefono,
                    int numeroCapacitacion) {
        this.rut = rut;
        this.nombre = nombre;
        this.empresa = empresa;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.numeroCapacitacion = numeroCapacitacion;
    }

    // Getters de las propiedades

    // ...

}

/**
 * Esta clase representa una capacitación.
 *
 * @author [Nombre del autor]
 * @version 1.0
 * @since 2023-05-10
 */
class Capacitacion2 {
    private int numeroCapacitacion;
    private String empresa;
    private String fechaCapacitacion;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    /**
     * Constructor de la clase Capacitacion2.
     *
     * @param numeroCapacitacion El número de la capacitación.
     * @param empresa            El nombre de la empresa de la capacitación.
     * @param fechaCapacitacion  La fecha de la capacitación.
     * @param hora               La hora de la capacitación.
     * @param lugar              El lugar de la capacitación.
     * @param duracion           La duración en minutos de la capacitación.
     * @param cantidadAsistentes La cantidad de asistentes a la capacitación.
     */
    public Capacitacion2(int numeroCapacitacion, String empresa, String fechaCapacitacion, String hora, String lugar,
                         int duracion, int cantidadAsistentes) {
        this.numeroCapacitacion = numeroCapacitacion;
        this.empresa = empresa;
        this.fechaCapacitacion = fechaCapacitacion;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    // Getters de las propiedades

    // ...

    /**
     * Calcula la edad promedio de los asistentes a la capacitación.
     *
     * @return La edad promedio de los asistentes.
     */
    public int calcularEdadPromedio() {
        // Lógica para calcular la edad promedio
        return 0; // Reemplazar con la lógica real
    }

    /**
     * Devuelve una representación en forma de cadena de la capacitación.
     *
     * @return Una cadena que contiene los datos de la capacitación.
     */
    @Override
    public String toString() {
        // ...
        return null; // Reemplazar con la implementación real
    }
}
