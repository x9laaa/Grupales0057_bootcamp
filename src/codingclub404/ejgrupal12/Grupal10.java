package codingclub404.ejgrupal12;
import java.util.Scanner;
/**
 *
 * @author Coding Club 404
 */
public class Grupal10 {

    /**
     * Este es un programa para ingresar datos de capacitaciones, los datos de sus asistentes
     * e imprimirlos por consola
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos de la capacitación
        System.out.println("Ingrese los datos de la capacitación:");
        System.out.print("Día: ");
        String dia = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Duración: ");
        String duracion = scanner.nextLine();

        int cantidadAsistentes;
        //Ciclo para captura número de asistentes que se interrumple cuando es mayor o igual 10
        do {
            System.out.print("Cantidad de asistentes: ");
            cantidadAsistentes = scanner.nextInt();
            scanner.nextLine();
        } while (cantidadAsistentes <= 0);

        String[] nombresAsistentes = new String[cantidadAsistentes];
        int[] calificaciones = new int[cantidadAsistentes];

        // Registrar nombres y calificaciones
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("\nIngrese los datos del asistente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombresAsistentes[i] = scanner.nextLine();
            System.out.print("Calificación (entre 1 y 7): ");
            calificaciones[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
        }

        // Calcular promedio, calificación mayor y calificación menor
        int sumaCalificaciones = 0;
        int calificacionMayor = Integer.MIN_VALUE;
        int calificacionMenor = Integer.MAX_VALUE;

        for (int calificacion : calificaciones) {
            sumaCalificaciones += calificacion;

            if (calificacion > calificacionMayor) {
                calificacionMayor = calificacion;
            }

            if (calificacion < calificacionMenor) {
                calificacionMenor = calificacion;
            }
        }

        double promedio = (double) sumaCalificaciones / cantidadAsistentes;

        // Mostrar la información de la capacitacion
        System.out.println("\n--- Información de la capacitación ---");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion);

        System.out.println("\n--- Resumen de calificaciones ---");
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Calificación mayor: " + calificacionMayor);
        System.out.println("Calificación menor: " + calificacionMenor);
    }
}
