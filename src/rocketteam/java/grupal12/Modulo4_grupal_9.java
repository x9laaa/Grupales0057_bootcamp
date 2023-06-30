package rocketteam.java.grupal12;

import java.util.Scanner;

/**
 * Clase Modulo4_grupal9
 @author RocketTeam
 @version 1.0
 */
public class Modulo4_grupal_9 {

    /**
     * Método validarDato
     * valida un dato ingresado por el usuario.
     * El método solicita al usuario que ingrese un dato y lo valida según si es numérico o no.
     * En caso de ser numérico, se verifica que el dato ingresado sea un número válido.
     *
     * @param nombreDato  El nombre del dato a ingresar.
     * @param esNumerico  Indica si el dato debe ser numérico (true) o no (false).
     * @return El dato validado.
     */
    public String validarDato(String nombreDato, boolean esNumerico){
        String dato;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print(nombreDato + ": ");
            dato = sc.nextLine();

            if (dato != null && dato.length() > 0) {
                if (esNumerico) {
                    try{
                        Integer.parseInt(dato);
                        return dato;
                    } catch (Exception e){
                        System.out.println("El dato debe ser numérico");
                    }

                }else
                    return dato;
            }else
                System.out.println("Debe ingresar un dato");

        }
    }

    /**
     * Método main
     * Punto de entrada del programa.
     * Permite ingresar y validar datos del cliente, datos de la capacitación
     * y datos de los asistentes. Luego muestra un resumen de los datos ingresados.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

        Modulo4_grupal_9 obj = new Modulo4_grupal_9();
        String[] datosCliente = new String[5];

        System.out.println("===============================================");
        System.out.println("========== Ingrese datos del cliente ==========");
        System.out.println("===============================================");

        datosCliente[0] = obj.validarDato("RUT", false);
        datosCliente[1] = obj.validarDato("Nombre", false);
        datosCliente[2] = obj.validarDato("Dirección", false);
        datosCliente[3] = obj.validarDato("Comuna", false);
        datosCliente[4] = obj.validarDato("Número de teléfono", false);

        System.out.println("===============================================");
        System.out.println("====== Ingrese datos de la capacitación =======");
        System.out.println("===============================================");

        String[] datosCapacitacion = new String[5];

        datosCapacitacion[0] = obj.validarDato("Día", false);
        datosCapacitacion[1] = obj.validarDato("Hora", false);
        datosCapacitacion[2] = obj.validarDato("Lugar", false);
        datosCapacitacion[3] = obj.validarDato("Duración", false);
        datosCapacitacion[4] = obj.validarDato("Cantidad de asistentes", true);

        System.out.println("===============================================");
        System.out.println("======= Ingrese datos de los asistentes =======");
        System.out.println("===============================================");

        int cantidadAsistentes = Integer.parseInt(datosCapacitacion[4]);

        String[][] datosAsistentes = new String[cantidadAsistentes][2];
        int cantPersonasU25=0, cantPersonas26a35=0, cantPersonas36Mas=0;

        for(int i=0; i<cantidadAsistentes; i++){
            datosAsistentes[i][0] = obj.validarDato("Nombre asistente " + (i+1), false);
            datosAsistentes[i][1] = obj.validarDato("Edad asistente " + (i+1), true);

            int edadAsistente = Integer.parseInt(datosAsistentes[i][1]);

            if(edadAsistente < 26) {
                cantPersonasU25++;
            }else if (edadAsistente < 36) {
                cantPersonas26a35++;
            }else{
                cantPersonas36Mas++;
            }

            System.out.println("\n===============================================\n");
        }

        System.out.println("===============================================");
        System.out.println("============= Resumen de los datos ============");
        System.out.println("===============================================");

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
