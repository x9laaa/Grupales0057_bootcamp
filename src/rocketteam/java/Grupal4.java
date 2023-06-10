package rocketteam.java;
import java.util.Scanner;
public class Grupal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de usuarios a registrar: ");
        int cantidadUsuarios = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= cantidadUsuarios; i++) {
            System.out.println("\nRegistro de Usuario " + i);
            System.out.println("--------------------");
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la fecha de nacimiento: ");
            String fechaNacimiento = scanner.nextLine();
            System.out.print("Ingrese el RUN: ");
            String run = scanner.nextLine();
            System.out.println("-----------------");
            System.out.print("1. Cliente\n");
            System.out.print("2. Profesional\n");
            System.out.print("3. Administrativo\n");
            System.out.print("Ingrese el número del perfil que desea ingresar: ");
            String tipoPerfil = scanner.nextLine();
            System.out.println("\nDatos del Usuario");
            System.out.println("-----------------");
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
            System.out.println("RUN: " + run);
            switch (tipoPerfil) {
                case "1":
                    System.out.print("Ingrese la dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    int telefono = Integer.parseInt(scanner.next());
                    System.out.print("Ingrese la cantidad de empleados: ");
                    int cantidadEmpleados = scanner.nextInt();
                    System.out.println("Dirección: " + direccion);
                    System.out.println("Teléfono: " + telefono);
                    System.out.println("Cantidad de empleados: " + cantidadEmpleados);
                    break;
                case "2":
                    System.out.print("Ingrese los años de experiencia: ");
                    int experiencia = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el departamento: ");
                    String departamento = scanner.nextLine();
                    System.out.println("Años de experiencia: " + experiencia);
                    System.out.println("Departamento: " + departamento);
                    break;
                case "3":
                    System.out.print("Ingrese la función: ");
                    String funcion = scanner.nextLine();
                    System.out.print("Ingrese el nombre del superior: ");
                    String nombreSuperior = scanner.nextLine();
                    System.out.println("Función: " + funcion);
                    System.out.println("Nombre del superior: " + nombreSuperior);
                    break;
                default:
                    System.out.println("Tipo de perfil no válido.");
                    break;
            }
        }
    }
}