

package alfaomega.grupal8;
import java.util.Scanner;
public class usuarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usuarios, contador;
        String nombre, fechaNacimiento, run;
        String direccion, telefono, cantEmpleados;
        String añosExperiencia, departamento;
        String funciones, nombreSuperior;

        System.out.print("Ingrese la cantidad de usuarios a registrar: ");
        usuarios = scanner.nextInt();

        for (contador = 1; contador <= usuarios; contador++) {
            System.out.println("Usuario " + contador);

            System.out.print("Ingrese el nombre: ");
            nombre = scanner.next();

            System.out.print("Ingrese la fecha de nacimiento: ");
            fechaNacimiento = scanner.next();

            System.out.print("Ingrese el RUN: ");
            run = scanner.next();

            System.out.println("Seleccione el tipo de perfil:");
            System.out.println("1. Cliente");
            System.out.println("2. Profesional");
            System.out.println("3. Administrativo");
            int tipoPerfil = scanner.nextInt();

            switch (tipoPerfil) {
                case 1 -> {
                    System.out.print("Ingrese la dirección: ");
                    direccion = scanner.next();
                    System.out.print("Ingrese el teléfono: ");
                    telefono = scanner.next();
                    System.out.print("Ingrese la cantidad de empleados: ");
                    cantEmpleados = scanner.next();
                    System.out.println("Perfil: Cliente");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                    System.out.println("RUN: " + run);
                    System.out.println("Dirección: " + direccion);
                    System.out.println("Teléfono: " + telefono);
                    System.out.println("Cantidad de empleados: " + cantEmpleados);
                }
                case 2 -> {
                    System.out.print("Ingrese los años de experiencia: ");
                    añosExperiencia = scanner.next();
                    System.out.print("Ingrese el departamento: ");
                    departamento = scanner.next();
                    System.out.println("Perfil: Profesional");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                    System.out.println("RUN: " + run);
                    System.out.println("Años de experiencia: " + añosExperiencia);
                    System.out.println("Departamento: " + departamento);
                }
                case 3 -> {
                    System.out.print("Ingrese la función: ");
                    funciones = scanner.next();
                    System.out.print("Ingrese el nombre del superior: ");
                    nombreSuperior = scanner.next();
                    System.out.println("Perfil: Administrativo");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                    System.out.println("RUN: " + run);
                    System.out.println("Función: " + funciones);
                    System.out.println("Nombre del superior: " + nombreSuperior);
                }
                default -> System.out.println("Opción inválida");
            }

            System.out.println();
        }
    }
}

