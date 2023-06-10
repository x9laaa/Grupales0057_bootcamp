package rocketteam;
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
        }
    }
}