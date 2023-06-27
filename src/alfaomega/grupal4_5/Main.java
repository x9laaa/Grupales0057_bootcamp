package alfaomega.grupal4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personas;
        int accidentalidad;
        String nombre;

        List<String> nombres = new ArrayList<>();
        List<Integer> porcentajes = new ArrayList<>();

        System.out.println("Cuantas personas desea evaluar: ");
        personas = sc.nextInt();

        for (int i = 0; i < personas; i++) {
            System.out.println("Cual es el nombre de la persona: ");
            nombre = sc.next();
            nombres.add(nombre);

            System.out.println("Cual es su porcentaje de peligrosidad. ");
            accidentalidad = sc.nextInt();
            porcentajes.add(accidentalidad);
        }
        for (int i = 0; i < personas; i++) {
            System.out.println("La persona " + nombres.get(i) + " tiene " + porcentajes.get(i) + "% de accidentabilidad.");
        }
    }
}
