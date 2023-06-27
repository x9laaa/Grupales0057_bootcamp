package losmalvekexx;

import java.util.Scanner;

public class TrabajoGrupal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la capacitación: ");
        String dia = scanner.nextLine();
        System.out.print("Ingrese la hora de la capacitación: ");
        String hora = scanner.nextLine();
        System.out.print("Ingrese el lugar de la capacitación: ");
        String lugar = scanner.nextLine();
        System.out.print("Ingrese la duración de la capacitación: ");
        String duracion = scanner.nextLine();

        int cantidadAsistentes;
        do {
            System.out.print("Ingrese la cantidad de asistentes: ");
            cantidadAsistentes = scanner.nextInt();
        } while (cantidadAsistentes <= 0);

        scanner.nextLine(); // Limpiar el buffer de entrada

        String[] nombres = new String[cantidadAsistentes];
        int[] calificaciones = new int[cantidadAsistentes];

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("\nDatos del asistente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Calificación (1-7): ");
            calificaciones[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
        }

        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion);

        double promedio = calcularPromedio(calificaciones);
        int calificacionMayor = obtenerCalificacionMayor(calificaciones);
        int calificacionMenor = obtenerCalificacionMenor(calificaciones);

        System.out.println("\nPromedio de notas: " + promedio);
        System.out.println("Calificación mayor: " + calificacionMayor);
        System.out.println("Calificación menor: " + calificacionMenor);
    }

    public static double calcularPromedio(int[] calificaciones) {
        int sum = 0;
        for (int calificacion : calificaciones) {
            sum += calificacion;
        }
        return (double) sum / calificaciones.length;
    }

    public static int obtenerCalificacionMayor(int[] calificaciones) {
        int max = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }

    public static int obtenerCalificacionMenor(int[] calificaciones) {
        int min = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }
}