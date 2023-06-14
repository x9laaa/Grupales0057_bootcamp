package grupoada;
import java.util.Scanner;

public class grupal5Grupoada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, j;
        int tasa, tasaTemp;
        String[] nombres;

        System.out.println("Ingresar la cantidad de clientes:");
        n = scanner.nextInt();

        nombres = new String[n];
        int[] tasas = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona:");
            nombres[i] = scanner.next();

            System.out.println("Ingrese tasa accidentabilidad:");
            tasas[i] = scanner.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (tasas[j] < tasas[j + 1]) {
                    tasaTemp = tasas[j + 1];
                    tasas[j + 1] = tasas[j];
                    tasas[j] = tasaTemp;
                }
            }
        }

        System.out.println("Datos:");
        for (i = 0; i < n; i++) {
            System.out.println("Nombre: " + nombres[i] + " Tasa accidentabilidad: " + tasas[i]);
        }
    }
}