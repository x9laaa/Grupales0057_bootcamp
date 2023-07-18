package grupoada.dia8;
import java.util.Scanner;

/**
 * Clase que representa un programa para el registro de usuarios.
 * Permite ingresar datos básicos del usuario y datos adicionales según el tipo de usuario seleccionado.
 * Al final, muestra los datos ingresados por el usuario.
 *
 * @version 1.0
 * @since 2023-05-10
 * @author Grupo Ada
 */

public class grupal8Grupoada2 {
    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Usuario");
        System.out.println("-------------------");

        // Pedir datos básicos del usuario
        System.out.print("Nombre Completo: ");
        String nombre = scanner.nextLine();

        System.out.print("RUN: ");
        String run = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del teclado

        // Pedir tipo de usuario
        System.out.println("Tipo de Usuario");
        System.out.println("1. Cliente");
        System.out.println("2. Profesional");
        System.out.println("3. Administrativo");
        System.out.print("Seleccione el tipo de usuario: ");
        int tipoUsuario = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del teclado

        // Pedir datos correspondientes al tipo de usuario seleccionado
        String tipoUsuarioStr = "";
        String codigo = "";

        String direccion = null;
        String telefono = null;
        String empleados = null;
        String experiencia = null;
        String departamento = null;
        String funcion = null;
        String superior = null;

        if (tipoUsuario == 1) {
            tipoUsuarioStr = "Cliente";

            System.out.print("Dirección: ");
            direccion = scanner.nextLine();

            System.out.print("Teléfono: ");
            telefono = scanner.nextLine();

            System.out.print("Cantidad de empleados: ");
            empleados = scanner.nextLine();

            codigo = scanner.nextLine();
        } else if (tipoUsuario == 2) {
            tipoUsuarioStr = "Profesional";

            System.out.print("Años experiencia: ");
            experiencia = scanner.nextLine();

            System.out.print("Departamento: ");
            departamento = scanner.nextLine();

            codigo = scanner.nextLine();
        } else if (tipoUsuario == 3) {
            tipoUsuarioStr = "Administrativo";

            System.out.print("Función: ");
            funcion = scanner.nextLine();

            System.out.print("Nombre Superior: ");
            superior = scanner.nextLine();

            System.out.print("Código de Administrativo: ");
            codigo = scanner.nextLine();
        } else {
            System.out.println("Tipo de usuario inválido");
            return;
        }

        // Mostrar los datos ingresados
        System.out.println();
        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN: " + run);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo de usuario: " + tipoUsuarioStr);
        System.out.println("Código: " + codigo);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Cantidad de empleados: " + empleados);
        System.out.println("Años experiencia: " + experiencia);
        System.out.println("Departamento: " + departamento);
        System.out.println("Función: " + funcion);
        System.out.println("Nombre Superior: " + superior);
    }
}

