package grupoada;
import java.util.Scanner;

public class grupal2Grupoada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de clientes a validar: ");
        int cantidadClientes = scanner.nextInt();
        
        for (int i = 1; i <= cantidadClientes; i++) {
            System.out.println("Cliente " + i + ":");
            
            // Validar RUT
            System.out.print("Ingrese el RUT (menor a 99.999.999): ");
            int rut = scanner.nextInt();
            while (rut >= 99999999) {
                System.out.print("RUT inválido. Ingrese nuevamente: ");
                rut = scanner.nextInt();
            }
            
            // Validar Nombres
            System.out.print("Ingrese los nombres: ");
            String nombres = scanner.next();
            while (nombres.equals("")) {
                System.out.print("Nombres inválidos. Ingrese nuevamente: ");
                nombres = scanner.next();
            }
            
            // Validar Apellidos
            System.out.print("Ingrese los apellidos: ");
            String apellidos = scanner.next();
            while (apellidos.equals("")) {
                System.out.print("Apellidos inválidos. Ingrese nuevamente: ");
                apellidos = scanner.next();
            }
            
            // Validar Teléfono
            System.out.print("Ingrese el número de teléfono (no más de 15 caracteres): ");
            String telefono = scanner.next();
            while (telefono.length() > 15) {
                System.out.print("Número de teléfono inválido. Ingrese nuevamente: ");
                telefono = scanner.next();
            }
            
            // Validar AFP
            System.out.print("Ingrese la AFP: ");
            String afp = scanner.next();
            while (afp.equals("")) {
                System.out.print("AFP inválida. Ingrese nuevamente: ");
                afp = scanner.next();
            }
            
            // Validar Sistema de Salud
            System.out.print("Ingrese el sistema de salud (1 para Fonasa, 2 para Isapre): ");
            int sistemaSalud = scanner.nextInt();
            while (sistemaSalud != 1 && sistemaSalud != 2) {
                System.out.print("Sistema de salud inválido. Ingrese nuevamente: ");
                sistemaSalud = scanner.nextInt();
            }
            
            // Validar Dirección
            System.out.print("Ingrese la dirección (no más de 50 caracteres): ");
            String direccion = scanner.next();
            while (direccion.length() > 50) {
                System.out.print("Dirección inválida. Ingrese nuevamente: ");
                direccion = scanner.next();
            }
            
            // Validar Comuna
            System.out.print("Ingrese la comuna: ");
            String comuna = scanner.next();
            while (comuna.equals("")) {
                System.out.print("Comuna inválida. Ingrese nuevamente: ");
                comuna = scanner.next();
            }
            
            // Validar Edad
            System.out.print("Ingrese la edad (menor a 120 años): ");
            int edad = scanner.nextInt();
            while (edad >= 120) {
                System.out.print("Edad inválida. Ingrese nuevamente: ");
                edad = scanner.nextInt();
            }
            
            // Mostrar datos del cliente
            System.out.println("----------------------------------------");
            System.out.println("Datos del Cliente " + i + ":");
            System.out.println("RUT: " + rut);
            System.out.println("Nombres: " + nombres);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Teléfono: " + telefono);
            System.out.println("AFP: " + afp);
            System.out.println("Sistema de Salud: " + sistemaSalud);
            System.out.println("Dirección: " + direccion);
            System.out.println("Comuna: " + comuna);
            System.out.println("Edad: " + edad);
        }
        
        scanner.close();
    }
}
