package bytemaster.java;

import java.util.Scanner;

public class Grupal4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de usuarios a ingresar: ");
    int cantidadUsuarios = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidadUsuarios; i++) {
        System.out.println("Usuario #" + i);
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        System.out.print("Ingrese el RUN: ");
        String run = sc.nextLine();
        System.out.print("Ingrese el tipo de perfil (cliente, profesional, administrativo): ");
        String tipoPerfil = sc.nextLine();

        switch (tipoPerfil.toLowerCase()) {
            case "cliente":
                System.out.print("Ingrese la dirección: ");
                String direccion = sc.nextLine();
                System.out.print("Ingrese el teléfono: ");
                String telefono = sc.nextLine();
                System.out.print("Ingrese la cantidad de empleados: ");
                int cantidadEmpleados = sc.nextInt();
                sc.nextLine();

                System.out.println("\nDatos del Cliente #" + i);
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Dirección: " + direccion);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Cantidad de Empleados: " + cantidadEmpleados);
                break;

            case "profesional":
                System.out.print("Ingrese los años de experiencia: ");
                int aniosExperiencia = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el departamento: ");
                String departamento = sc.nextLine();

                System.out.println("\nDatos del Profesional #" + i);
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Años de Experiencia: " + aniosExperiencia);
                System.out.println("Departamento: " + departamento);
                break;

            case "administrativo":
                System.out.print("Ingrese la función: ");
                String funcion = sc.nextLine();
                System.out.print("Ingrese el nombre del superior: ");
                String nombreSuperior = sc.nextLine();

                System.out.println("\nDatos del Administrativo #" + i);
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Función: " + funcion);
                System.out.println("Nombre del Superior: " + nombreSuperior);
                break;

            default:
                System.out.println("Tipo de perfil inválido.");
                break;
        }

        System.out.println();
    }

        sc.close();
}
}
