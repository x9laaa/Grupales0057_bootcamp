package codingclub404.ejgrupal12;

import java.util.Scanner;
/**
 *
 * @author Coding Club 404
 */
public class Grupal8 {

    /**
     * Este es un programa para ingresar datos e usuario cliente,profesional o administrativo
     * e imprimirlos por consola
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ingresar datos básicos del usuario
        System.out.println("Ingrese los datos básicos del usuario:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        System.out.print("RUN: ");
        String run = sc.nextLine();

        // Obtener el tipo de usuario
        System.out.print("Ingrese el tipo de usuario (cliente, profesional, administrativo): ");
        String tipoUsuario = sc.nextLine();

        // Registrar datos específicos según el tipo de usuario según tipo de usuario
        if (tipoUsuario.equalsIgnoreCase("cliente")) {
            System.out.print("Dirección: ");
            String direccion = sc.nextLine();
            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();
            System.out.print("Cantidad de empleados: ");
            int cantidadEmpleados = sc.nextInt();

            // Mostrar los datos ingresados
            System.out.println("\nDatos ingresados:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
            System.out.println("RUN: " + run);
            System.out.println("Tipo de usuario: Cliente");
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Cantidad de empleados: " + cantidadEmpleados);
        } else if (tipoUsuario.equalsIgnoreCase("profesional")) {
            System.out.print("Años de experiencia: ");
            int aniosExperiencia = sc.nextInt();
            sc.nextLine();

            System.out.print("Departamento: ");
            String departamento = sc.nextLine();

            // Mostrar los datos ingresados
            System.out.println("\nDatos ingresados:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
            System.out.println("RUN: " + run);
            System.out.println("Tipo de usuario: Profesional");
            System.out.println("Años de experiencia: " + aniosExperiencia);
            System.out.println("Departamento: " + departamento);
        } else if (tipoUsuario.equalsIgnoreCase("administrativo")) {
            System.out.print("Función: ");
            String funcion = sc.nextLine();
            System.out.print("Nombre superior: ");
            String nombreSuperior = sc.nextLine();

            // Mostrar los datos ingresados
            System.out.println("\nDatos ingresados:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
            System.out.println("RUN: " + run);
            System.out.println("Tipo de usuario: Administrativo");
            System.out.println("Función: " + funcion);
            System.out.println("Nombre superior: " + nombreSuperior);
        } else {
            System.out.println("Tipo de usuario no válido");
        }
    }
}
