package codingclub404.modulo04.grupal09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M4_Grup09 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos de la empresa
        System.out.println("Ingrese los datos de la empresa:");
        String rut = obtenerObligatorio("RUT del cliente: ", scanner);
        String nombreCliente = obtenerObligatorio("Nombre del cliente: ", scanner);
        String direccion = obtenerObligatorio("Dirección: ", scanner);
        String comuna = obtenerObligatorio("Comuna: ", scanner);
        String telefono = obtenerObligatorio("Número de teléfono: ", scanner);

        // Datos de la capacitación
        System.out.println("Ingrese los datos de la capacitación:");
        String dia = obtenerObligatorio("Día: ", scanner);
        String hora = obtenerObligatorio("Hora: ", scanner);
        String lugar = obtenerObligatorio("Lugar: ", scanner);
        String duracion = obtenerObligatorio("Duración: ", scanner);

        int cantidadAsistentes;
        do {
            System.out.print("Cantidad de asistentes: ");
            cantidadAsistentes = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
        } while (cantidadAsistentes <= 0);

        // Registro de asistentes
        String[] nombresAsistentes = new String[cantidadAsistentes];
        int[] edadesAsistentes = new int[cantidadAsistentes];

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("\nIngrese los datos del asistente " + (i + 1) + ":");

            String nombreAsistente = obtenerObligatorio("Nombre: ", scanner);
            nombresAsistentes[i] = nombreAsistente;

            int edadAsistente;
            do {
                System.out.print("Edad: ");
                edadAsistente = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
            } while (edadAsistente <= 0);

            edadesAsistentes[i] = edadAsistente;
        }

        // Mostrar los resultados
        System.out.println("\n--- Información de la capacitación ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("RUT: " + rut);
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion);

        int menores25 = 0;
        int entre26y35 = 0;
        int mayores35 = 0;

        int edad;
        for (int i = 0; i < edadesAsistentes.length; i++) {
            edad = edadesAsistentes[i];
            if (edad < 25) {
                menores25++;
            } else if (edad >= 25 && edad <= 35) {
                entre26y35++;
            } else {
                mayores35++;
            }
        }

        System.out.println("\n--- Resumen de asistentes ---");
        System.out.println("Menores a 25 años: " + menores25);
        System.out.println("Entre 26 y 35 años: " + entre26y35);
        System.out.println("Mayores a 35 años: " + mayores35);
    }

    private static String obtenerObligatorio(String mensaje, Scanner scanner) {
        String output;
        do {
            System.out.print(mensaje);
            output = scanner.nextLine();
        } while (output.equals(""));
        return output;
    }
}
