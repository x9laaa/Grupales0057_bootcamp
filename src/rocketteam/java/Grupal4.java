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
            System.out.print("Ingrese el tipo de perfil (cliente, profesional, administrativo): ");
            String tipoPerfil = scanner.nextLine();
            System.out.println("\nDatos del Usuario");
            System.out.println("-----------------");
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
            System.out.println("RUN: " + run);
            switch (tipoPerfil) {
                case "cliente":
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
                case "profesional":
                    System.out.print("Ingrese los años de experiencia: ");
                    int experiencia = scanner.nextInt();
                    System.out.print("Ingrese el departamento: ");
                    String departamento = scanner.nextLine();
                    System.out.println("Años de experiencia: " + experiencia);
                    System.out.println("Departamento: " + departamento);
                    break;
            }
        }
    }
}