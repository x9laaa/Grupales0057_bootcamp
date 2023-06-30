package alfaomega.grupal12.grupal10;

import java.util.Scanner;
/**
 * Esta clase representa un programa para calcular el promedio de calificaciones de una capacitación y encontrar
 * la calificación mayor y menor.
 *
 * @author AlfaOmega
 * @version 1.0
 */
public class grupal10_2 {
    /**
     * El punto de entrada principal del programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los datos de la capacitación:");
            System.out.print("Día: ");
            String dia = scanner.nextLine();
            System.out.print("Hora: ");
            String hora = scanner.nextLine();
            System.out.print("Lugar: ");
            String lugar = scanner.nextLine();
            System.out.print("Duración: ");
            int duracion = scanner.nextInt();
            System.out.print("Cantidad de asistentes: ");
            int cantidadAsistentes = scanner.nextInt();
            scanner.nextLine(); // Limpiar
            String nombre;
            String calificacion;
            String[][] matrizAsistentes = new String[cantidadAsistentes][2];

            for (int i = 0; i < cantidadAsistentes; i++) {

                System.out.print("Nombre del asistente " + (i + 1) + ": ");
                nombre = scanner.nextLine();

                do {
                    System.out.print("Calificación del asistente " + (i + 1) + " (entre 1 y 7): ");
                    calificacion = scanner.nextLine();
                } while (!validarCalificacion(calificacion));

                matrizAsistentes[i][0] = nombre;
                matrizAsistentes[i][1] = calificacion;
            }

            // Calcular el promedio de las calificaciones
            double promedio = calcularPromedio(matrizAsistentes);

            // Encontrar la calificación mayor y menor
            String calificacionMayor = encontrarCalificacionMayor(matrizAsistentes);
            String calificacionMenor = encontrarCalificacionMenor(matrizAsistentes);

            // Mostrar los datos de la capacitación y los resultados
            System.out.println("\nDatos de la capacitación:");
            System.out.println("Día: " + dia);
            System.out.println("Hora: " + hora);
            System.out.println("Lugar: " + lugar);
            System.out.println("Duración: " + duracion + " horas");
            System.out.println("Cantidad de asistentes: " + cantidadAsistentes);
            System.out.println("Promedio de notas: " + promedio);
            System.out.println("Calificación mayor: " + calificacionMayor);
            System.out.println("Calificación menor: " + calificacionMenor);
        }
    /**
     * Valida si una calificación es válida (entre 1 y 7).
     *
     * @param calificacion La calificación a validar.
     * @return true si la calificación es válida, false de lo contrario.
     */
        private static boolean validarCalificacion(String calificacion) {
            try {
                int nota = Integer.parseInt(calificacion);
                return nota >= 1 && nota <= 7;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private static double calcularPromedio(String[][] matrizAsistentes) {
            int sum = 0;
            for (String[] asistente : matrizAsistentes) {
                int calificacion = Integer.parseInt(asistente[1]);
                sum += calificacion;
            }
            return (double) sum / matrizAsistentes.length;
        }
    /**
     * Encuentra la calificación mayor en la matriz de asistentes.
     *
     * @param matrizAsistentes La matriz que contiene los nombres y calificaciones de los asistentes.
     * @return La calificación mayor.
     */
        private static String encontrarCalificacionMayor(String[][] matrizAsistentes) {
            String max = matrizAsistentes[0][1];
            for (int i = 1; i < matrizAsistentes.length; i++) {
                if (matrizAsistentes[i][1].compareTo(max) > 0) {
                    max = matrizAsistentes[i][1];
                }
            }
            return max;
        }
    /**
     * Encuentra la calificación menor en la matriz de asistentes.
     *
     * @param matrizAsistentes La matriz que contiene los nombres y calificaciones de los asistentes.
     * @return La calificación menor.
     */
        private static String encontrarCalificacionMenor(String[][] matrizAsistentes) {
            String min = matrizAsistentes[0][1];
            for (int i = 1; i < matrizAsistentes.length; i++) {
                if (matrizAsistentes[i][1].compareTo(min) < 0) {
                    min = matrizAsistentes[i][1];
                }
            }
            return min;
        }
    }

