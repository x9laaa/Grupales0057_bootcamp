package grupoada.dia10;

import java.util.Scanner;

/**
 * Clase que permite realizar el registro de una capacitación y las calificaciones de los asistentes.
 *
 * @version 1.0
 * @autor Grupo Ada
 */
public class Grupal10 {

    /**
     * Método principal que inicia el programa.
     *
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la capacitación: ");
        String dia = scanner.nextLine();

        System.out.print("Ingrese la hora de la capacitación: ");
        String hora = scanner.nextLine();

        System.out.print("Ingrese el lugar de la capacitación: ");
        String lugar = scanner.nextLine();

        System.out.print("Ingrese la duración de la capacitación (en horas): ");
        int duracion = scanner.nextInt();

        System.out.print("Ingrese la cantidad de asistentes: ");
        int cantidadAsistentes = scanner.nextInt();

        String[] nombres = new String[cantidadAsistentes];
        int[] calificaciones = new int[cantidadAsistentes];

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.print("Ingrese el nombre del asistente " + (i + 1) + ": ");
            scanner.nextLine();
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la calificación del asistente " + (i + 1) + " (entre 1 y 7): ");
            calificaciones[i] = scanner.nextInt();
        }

        int sumatoriaCalificaciones = 0;
        int calificacionMayor = Integer.MIN_VALUE;
        int calificacionMenor = Integer.MAX_VALUE;

        for (int calificacion : calificaciones) {
            sumatoriaCalificaciones += calificacion;

            if (calificacion > calificacionMayor) {
                calificacionMayor = calificacion;
            }

            if (calificacion < calificacionMenor) {
                calificacionMenor = calificacion;
            }
        }

        double promedioCalificaciones = (double) sumatoriaCalificaciones / cantidadAsistentes;

        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion + " horas");

        System.out.println("\nCalificaciones de los asistentes:");

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("Asistente " + (i + 1) + ": " + nombres[i] + " - Calificación: " + calificaciones[i]);
        }

        System.out.println("\nPromedio de calificaciones: " + promedioCalificaciones);
        System.out.println("Calificación mayor: " + calificacionMayor);
        System.out.println("Calificación menor: " + calificacionMenor);
    }
}
