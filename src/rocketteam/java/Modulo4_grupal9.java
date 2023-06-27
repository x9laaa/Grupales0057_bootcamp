package rocketteam.java;

import java.util.Scanner;

public class Modulo4_gruppal9 {

    public static void main(String[] args) {

        String[] datosCliente = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese datos del cliente");
        System.out.print("RUT: ");
        datosCliente[0] = sc.nextLine();

        System.out.print("Nombre: ");
        datosCliente[1] = sc.nextLine();

        System.out.print("Dirección: ");
        datosCliente[2] = sc.nextLine();

        System.out.print("Comuna: ");
        datosCliente[3] = sc.nextLine();

        System.out.print("Número de teléfono: ");
        datosCliente[4] = sc.nextLine();

        String[] datosCapacitacion = new String[5];

        System.out.print("Día: ");
        datosCapacitacion[0] = sc.nextLine();

        System.out.print("Hora: ");
        datosCapacitacion[1] = sc.nextLine();

        System.out.print("Lugar: ");
        datosCapacitacion[2] = sc.nextLine();

        System.out.print("Duración: ");
        datosCapacitacion[3] = sc.nextLine();

        System.out.print("Cantidad de asistentes: ");
        datosCapacitacion[4] = sc.nextLine();

        int cantidadAsistentes = Integer.parseInt(datosCapacitacion[4]);

        String[][] datosAsistentes = new String[cantidadAsistentes][2];
        int cantPersonasU25=0, cantPersonas26a35=0, cantPersonas36Mas=0;

        for(int i=0; i<cantidadAsistentes; i++){
            System.out.print("Nombre asistente " + i + ": ");
            datosAsistentes[i][0] = sc.nextLine();

            System.out.print("Edad asistente " + i + ": ");
            datosAsistentes[i][1] = sc.nextLine();

            int edadAsistente = Integer.parseInt(datosAsistentes[i][1]);

            if(edadAsistente < 26) {
                cantPersonasU25++;
            }else if (edadAsistente < 36) {
                cantPersonas26a35++;
            }else{
                cantPersonas36Mas++;
            }


            System.out.println("RUT: " + datosCliente[0]);
            System.out.println("Nombre: " + datosCliente[1]);
            System.out.println("Dirección: " + datosCliente[2]);
            System.out.println("Comuna: " + datosCliente[3]);
            System.out.println("Teléfono: " + datosCliente[4]);

            System.out.println("Día: " + datosCapacitacion[0]);
            System.out.println("Hora: " + datosCapacitacion[1]);
            System.out.println("Lugar: " + datosCapacitacion[2]);
            System.out.println("Duración: " + datosCapacitacion[3]);
            System.out.println("Cantidad de asistentes: " + datosCapacitacion[4]);

            System.out.println("Asistentes menores de 26: " + cantPersonasU25);
            System.out.println("Asistentes entre 26 y 35: " + cantPersonas26a35);
            System.out.println("Asistentes mayores de 35: " + cantPersonas36Mas);

        }



    }




}
