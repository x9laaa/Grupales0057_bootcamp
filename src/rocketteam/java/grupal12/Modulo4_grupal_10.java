package rocketteam.java.grupal12;

import java.util.Scanner;

/**
 @author rocketteam
 @version 1.0
 */


public class Modulo4_grupal_10 {
    /**
     pide al usuario por ingreso de datos para la ejecución del codigo
     */

    public static void main(String[] args) {

        String dia,hora,lugar,nombre,nota;
        int duracion,asistencia,suma,notaAlta,notaBaja;
        float promedio;
        suma = 0;
        notaAlta = 0;
        notaBaja = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese día de la capacitación");
        dia = sc.nextLine();
        System.out.println("Ingrese hora de la capacitación");
        hora = sc.nextLine();
        System.out.println("Ingrese lugar de la capacitación");
        lugar = sc.nextLine();
        System.out.println("Ingrese duración de la capacitación en minutos");
        duracion = Integer.valueOf(sc.nextLine());
        System.out.println("Ingrese cantidad de asistentes");
        asistencia = Integer.valueOf(sc.nextLine());

        String[][] asistentes = new String[asistencia][2];


/**
 @see acumula una cantidad de datos tanto string como integer en arreglos para poder acumularlos en arreglos
 */
        for(int i=0; i<asistentes.length; i++){
            System.out.println("Ingrese nombre del asistente "+(i+1));
            nombre = sc.nextLine();
            System.out.println("Ingrese calificación del asistente (de 1 a 7 solo números enteros)"+(i+1));
            nota = sc.nextLine();

            asistentes[i][0] = nombre;
            asistentes[i][1] = nota;

            if(Integer.valueOf(asistentes[i][1])>=notaAlta){
                notaAlta = Integer.valueOf(asistentes[i][1]);
            }else{
                notaAlta = notaAlta;
            }

            if(Integer.valueOf(asistentes[i][1])<=notaBaja){
                notaBaja = Integer.valueOf(asistentes[i][1]);
            }else{
                notaBaja = notaBaja;
            }

            suma = suma + Integer.valueOf(asistentes[i][1]);
        }

/**
 @see promedio y promedioTruncado realisa la funcion de sacar la merdia de las notas ingresadas
 */
        promedio = (float) suma / asistentes.length;
        String promedioTruncado = String.format("%.1f", promedio);
/**
 @see se imprimen por pantalla los datos ingresados
 */
        System.out.println("======== Datos capacitación ========");
        System.out.println("");
        System.out.println("Día: "+dia);
        System.out.println("hora: "+hora);
        System.out.println("lugar: "+lugar);
        System.out.println("duración: "+Integer.valueOf(duracion));
        System.out.println("Cantidad de asistentes: "+Integer.valueOf(asistencia));
        System.out.println("");
        System.out.println("======== Promedio calificaciones ========");
        System.out.println(promedioTruncado);
        System.out.println("");
        System.out.println("======== Calificación más alta ========");
        System.out.println(notaAlta);
        System.out.println("");
        System.out.println("======== Calificación más baja ========");
        System.out.println(notaBaja);


    }
}
