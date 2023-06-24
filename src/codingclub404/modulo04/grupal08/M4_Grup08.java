package codingclub404.modulo04.grupal08;
import java.util.Scanner;

public class M4_Grup08 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, fechaNacimiento, run, tipoUsuario, direccion, telefono, departamento, funcion, nombreSuperior;

        int cantidadEmpleados = 0, aniosExperiencia = 0;


        // Ingresar datos básicos del usuario
        System.out.println("Ingrese los datos básicos del usuario:");

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Fecha de nacimiento: ");
        fechaNacimiento = sc.nextLine();

        System.out.print("RUN: ");
        run = sc.nextLine();

        // Obtener el tipo de usuario
        do {
            System.out.print("Ingrese el tipo de usuario (cliente, profesional, administrativo): ");
            tipoUsuario = sc.nextLine();
        } while ((!tipoUsuario.equals("cliente")) && (!tipoUsuario.equals("profesional")) && (!tipoUsuario.equals("administrativo")));


        direccion = "";
        telefono = "";
        departamento = "";
        funcion = "";
        nombreSuperior = "";
        // Registrar datos específicos según el tipo de usuario
        if (tipoUsuario.equals("cliente")) {
            System.out.print("Dirección: ");
            direccion = sc.nextLine();
            System.out.print("Teléfono: ");
            telefono = sc.nextLine();
            System.out.print("Cantidad de empleados: ");
            cantidadEmpleados = sc.nextInt();
        } else if (tipoUsuario.equals("profesional")) {
            System.out.print("Años de experiencia: ");
            aniosExperiencia = sc.nextInt();
            sc.nextLine(); //Necesario por algún motivo
            System.out.print("Departamento: ");
            departamento = sc.nextLine();
        } else if (tipoUsuario.equals("administrativo")) {
            System.out.print("Función: ");
            funcion = sc.nextLine();
            System.out.print("Nombre superior: ");
            nombreSuperior = sc.nextLine();

        }

        // Mostrar los datos ingresados
        System.out.println("-----");
        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("RUN: " + run);

        if (tipoUsuario.equals("cliente")) {
            System.out.println("Tipo de usuario: Cliente");
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Cantidad de empleados: " + cantidadEmpleados);
        } else if (tipoUsuario.equals("profesional")) {
            System.out.println("Tipo de usuario: Profesional");
            System.out.println("Años de experiencia: " + aniosExperiencia);
            System.out.println("Departamento: " + departamento);
        } else if (tipoUsuario.equals("administrativo")) {
            System.out.println("Tipo de usuario: Administrativo");
            System.out.println("Función: " + funcion);
            System.out.println("Nombre superior: " + nombreSuperior);
        }
    }
}
