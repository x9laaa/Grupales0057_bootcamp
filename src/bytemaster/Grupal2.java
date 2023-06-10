package bytemaster;
import java.util.Scanner;

public class Grupal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y validar RUT
        System.out.print("Ingrese el RUT (sin DV): ");
        int rut = scanner.nextInt();
        if (rut >= 99999999) {
            System.out.println("Error: RUT inválido");
            return;
        }

        // Solicitar y validar nombres
        System.out.print("Ingrese los nombres: ");
        scanner.nextLine(); // Consumir el salto de línea anterior
        String nombres = scanner.nextLine();
        if (nombres.isEmpty()) {
            System.out.println("Error: Nombres requeridos");
            return;
        }

}
