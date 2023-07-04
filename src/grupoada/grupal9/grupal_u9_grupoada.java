package grupoada.grupal9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class grupal_u9_grupoada {
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

