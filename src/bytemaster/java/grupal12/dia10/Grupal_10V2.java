package bytemaster.java.grupal12.dia10;

import java.util.Scanner;
/**
 * Clase que registra los datos de diferentes tipos de usuarios.
 * @author Bytemaster
 * @version 1.0
 */
public class Grupal_10V2 {
    public static void main(String[] args) {
        /**
         * Variable que almacena la fecha de la capacitación.
         */
        String fecha;

        /**
         * Variable que almacena la hora de inicio del evento.
         */
        String hora;

        /**
         * Variable que almacena el lugar del evento.
         */
        String lugar;

        /**
         * Variable que almacena la duración del evento en minutos.
         */
        int duracion;

        /**
         * Variable que almacena la cantidad de asistentes.
         */
        int asistentes;

        /**
         * Variable que almacena el nombre del asistente.
         */
        String nombre;

        /**
         * Variable que almacena la calificación del asistente.
         */
        double calificacion;

        /**
         * Variable que almacena la suma de todas las calificaciones.
         */
        double sumaCalificaciones = 0;

        /**
         * Variable que almacena la calificación mayor.
         */
        double calificacionMayor = Double.MIN_VALUE;

        /**
         * Variable que almacena la calificación menor.
         */
        double calificacionMenor = Double.MAX_VALUE;

        Scanner procesos = new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*          ¡Bienvenidos al sistema de procesos   *");
        System.out.println("*                    ByteMaster                  *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");

        System.out.print("Ingrese fecha de la capacitacion (dd/mm/aa): ");
        fecha = procesos.next();
        System.out.println("**************************************************");
        System.out.print("Ingrese hora de inicio del evento (formato hh:mm): ");
        hora = procesos.next();
        System.out.println("**************************************************");
        System.out.print("Ingrese lugar del evento (SOLO COMUNA): ");
        lugar = procesos.next();
        System.out.println("**************************************************");
        System.out.print("Ingrese duracion evento en minutos (ej:60): ");
        duracion = procesos.nextInt();
        System.out.println("**************************************************");
        System.out.print("Por ultimo ingrese la cantidad de asistentes (ej:150):");
        asistentes = procesos.nextInt();

        String[][] arreglo = new String[asistentes][2];

        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*        Ahora ingrese datos de los asistentes   *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");

        for (int i = 0; i < asistentes; i++) {
            System.out.print("Ingrese el nombre del asistente " + (i + 1) + ": ");
            arreglo[i][0] = procesos.next();

            System.out.print("Ingrese la calificación del asistente (de 1 a 7, no notas intermedias) " + (i + 1) + ": ");
            arreglo[i][1] = procesos.next();

            calificacion = Double.parseDouble(arreglo[i][1]);
            sumaCalificaciones += calificacion;

            if (calificacion > calificacionMayor) {
                calificacionMayor = calificacion;
            }
            if (calificacion < calificacionMenor) {
                calificacionMenor = calificacion;
            }
        }

        double promedioCalificaciones = sumaCalificaciones / asistentes;

        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*          Resumen de la capacitacion            *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        System.out.println("* La capacitacion fue realizada en la fecha:" + fecha);
        System.out.println("* La capacitacion comenzo a las: " + hora + " horas");
        System.out.println("* Realizada en la comuna de: " + lugar);
        System.out.println("* Duro aproximadamente " + duracion + " minutos");
        System.out.println("* Y hubieron " + asistentes + " asistentes");
        System.out.println("* Respecto a las notas dadas por los asistentes, el resumen es el siguiente: ");
        System.out.println("* NOTA PROMEDIO: " + promedioCalificaciones);
        System.out.println("* NOTA MAYOR: " + calificacionMayor);
        System.out.println("* NOTA MENOR: " + calificacionMenor);

        System.out.println("**************************************************");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("* Muchas gracias por utilizar Software bymaster  *");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("**************************************************");
    }
}

