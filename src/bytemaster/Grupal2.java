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
        // Solicitar y validar apellidos
        System.out.print("Ingrese los apellidos: ");
        String apellidos = scanner.nextLine();
        if (apellidos.isEmpty()) {
            System.out.println("Error: Apellidos requeridos");
            return;
        }

        // Solicitar y validar telefono
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        if (telefono.length() > 15) {
            System.out.println("Error: Teléfono inválido");
            return;
        }

        // Solicitar y validar AFP
        System.out.print("Ingrese la AFP: ");
        String afp = scanner.nextLine();
        if (afp.isEmpty()) {
            System.out.println("Error: AFP requerida");
            return;
        }
        // Solicitar y validar Sistema de salud
        System.out.print("Ingrese el sistema de salud (1: Fonasa, 2: Isapre): ");
        int sistemaSalud = scanner.nextInt();
        if (sistemaSalud != 1 && sistemaSalud != 2) {
            System.out.println("Error: Sistema de salud inválido");
            return;
        }

        // Solicitar y validar Dirección
        System.out.print("Ingrese la dirección: ");
        scanner.nextLine(); // Consumir el salto de línea anterior
        String direccion = scanner.nextLine();
        if (direccion.length() > 50) {
            System.out.println("Error: Dirección inválida");
            return;
        }
        // Solicitar y validar Comuna
        System.out.print("Ingrese la comuna: ");
        String comuna = scanner.nextLine();
        if (comuna.isEmpty()) {
            System.out.println("Error: Comuna requerida");
            return;
        }
<<<<<<< HEAD
        // Solicitar y validar Edad
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        if (edad >= 120) {
            System.out.println("Error: Edad inválida");
            return;
        }
// Mostrar los datos del cliente
        System.out.println(" ");
        System.out.println("=== Datos del Cliente ===");
        System.out.println(" ");
        System.out.println("RUT: " + rut);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Teléfono: " + telefono);
        System.out.println("AFP: " + afp);
        System.out.println("Sistema de Salud: " + (sistemaSalud == 1 ? "Fonasa" : "Isapre"));
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Edad: " + edad);
    }
=======

>>>>>>> parent of e017939 (primer cummit alex)
}


