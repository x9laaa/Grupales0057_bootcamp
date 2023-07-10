package losmalvekexx.trabajo12.grupal8;

import java.util.Scanner;


/**
 * La clase TrabajoGrupal8 permite ingresar y mostrar información de diferentes tipos de usuarios.
 */
public class TrabajoGrupal8 {
    /**
     * * El método principal que solicita información al usuario y la muestra según el tipo de usuario seleccionado.
     *
     * @param args Los argumentos de la línea de comandos.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresa datos básicos del usario
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento del usuario: ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Ingrese el RUN del usuario: ");
        String run = scanner.nextLine();


        System.out.println("Seleccione el tipo de usuario: ");
        System.out.println("1. Cliente");
        System.out.println("2. Profesional");
        System.out.println("3. Administrativo");
        System.out.print("Ingrese el número correspondiente al tipo de usuario: ");
        int tipoUsuario = scanner.nextInt();


        switch (tipoUsuario) {
            case 1 -> {
                scanner.nextLine();
                System.out.print("Ingrese la dirección del cliente: ");
                String direccionCliente = scanner.nextLine();
                System.out.print("Ingrese el teléfono del cliente: ");
                String telefonoCliente = scanner.nextLine();
                System.out.print("Ingrese la cantidad de empleados de la empresa: ");
                int cantidadEmpleados = scanner.nextInt();
                System.out.println("--- Datos ingresados ---");
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Dirección: " + direccionCliente);
                System.out.println("Teléfono: " + telefonoCliente);
                System.out.println("Cantidad de empleados: " + cantidadEmpleados);
            }
            case 2 -> {
                scanner.nextLine();
                System.out.print("Ingrese los años de experiencia del profesional: ");
                int anosExperiencia = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el departamento del profesional: ");
                String departamento = scanner.nextLine();
                System.out.println("--- Datos ingresados ---");
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Años de experiencia: " + anosExperiencia);
                System.out.println("Departamento: " + departamento);
            }
            case 3 -> {
                scanner.nextLine();
                System.out.print("Ingrese la función del administrativo: ");
                String funcion = scanner.nextLine();
                System.out.print("Ingrese el nombre del superior del administrativo: ");
                String nombreSuperior = scanner.nextLine();
                System.out.println("--- Datos ingresados ---");
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Función: " + funcion);
                System.out.println("Nombre del superior: " + nombreSuperior);
            }
            default -> System.out.println("Tipo de usuario inválido");
        }
    }
}