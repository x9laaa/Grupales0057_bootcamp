import java.util.Scanner;

public class RegistroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadUsuarios;
        String nombre, fechaNacimiento, run;

        System.out.println("Registro de Usuarios");
        System.out.print("Ingrese la cantidad de usuarios a registrar: ");
        cantidadUsuarios = scanner.nextInt();

        for (int i = 1; i <= cantidadUsuarios; i++) {
            System.out.println("Usuario " + i);
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Ingrese la fecha de nacimiento: ");
            fechaNacimiento = scanner.nextLine();

            System.out.print("Ingrese el RUN: ");
            run = scanner.nextLine();

            System.out.println("Seleccione el tipo de perfil:");
            System.out.println("1. Cliente");
            System.out.println("2. Profesional");
            System.out.println("3. Administrativo");
            System.out.print("Ingrese su opción: ");
            int opcionPerfil = scanner.nextInt();

            switch (opcionPerfil) {
                case 1:
                    String direccion, telefono, cantEmpleados;

                    System.out.print("Ingrese la dirección: ");
                    scanner.nextLine();
                    direccion = scanner.nextLine();

                    System.out.print("Ingrese el teléfono: ");
                    telefono = scanner.nextLine();

                    System.out.print("Ingrese la cantidad de empleados: ");
                    cantEmpleados = scanner.nextLine();

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                    System.out.println("RUN: " + run);
                    System.out.println("Dirección: " + direccion);
                    System.out.println("Teléfono: " + telefono);
                    System.out.println("Cantidad de empleados: " + cantEmpleados);
                    break;

                case 2:
                    String aniosExperiencia, departamento;

                    System.out.print("Ingrese los años de experiencia: ");
                    scanner.nextLine();
                    aniosExperiencia = scanner.nextLine();

                    System.out.print("Ingrese el departamento: ");
                    departamento = scanner.nextLine();

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                    System.out.println("RUN: " + run);
                    System.out.println("Años de experiencia: " + aniosExperiencia);
                    System.out.println("Departamento: " + departamento);
                    break;

                case 3:
                    String nombreSuperior, funcionAdm;

                    System.out.print("Ingrese la función: ");
                    scanner.nextLine();
                    funcionAdm = scanner.nextLine();

                    System.out.print("Ingrese el nombre del superior: ");
                    nombreSuperior = scanner.nextLine();

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                    System.out.println("RUN: " + run);
                    System.out.println("Función: " + funcionAdm);
                    System.out.println("Nombre del superior: " + nombreSuperior);
                    break;
            }

            System.out.println("----------------------------------------");
        }
    }
}