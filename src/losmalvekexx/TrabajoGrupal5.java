package losmalvekexx;

import java.util.Scanner;
public class TrabajoGrupal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();

        System.out.println("Los divisores del número " + numero + " son:");
            for (int i = 1; i <= numero; i++) {

                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }


}
