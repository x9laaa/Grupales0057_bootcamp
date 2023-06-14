package losmalvekexx;

import java.util.Scanner;
public class TrabajoGrupal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clientes: ");
        int C = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[C];
        double[] tasas = new double[C];

        for (int i = 0; i < C; i++) {
            System.out.print("Ingrese el nombre del cliente " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Ingrese la tasa de accidentabilidad para el cliente " + (i + 1) + ": ");
            tasas[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < C- 1; i++) {
            for (int j = 0; j < C - i - 1; j++) {
                if (tasas[j] < tasas[j + 1]) {
                    // Intercambiar tasas
                    double tempTasa = tasas[j];
                    tasas[j] = tasas[j + 1];
                    tasas[j + 1] = tempTasa;

                    // Intercambiar nombres
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }

        System.out.println("Los clientes y sus tasas ordenados de mayor a menor son:");
        for (int i = 0; i < C; i++) {
            System.out.println(nombres[i] + " - " + tasas[i]);
        }
    }


}
