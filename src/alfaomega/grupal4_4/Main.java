package alfaomega.grupal4_4;

import alfaomega.grupal4_4.model.Administrativo;
import alfaomega.grupal4_4.model.Cliente;
import alfaomega.grupal4_4.model.Profesional;
import alfaomega.grupal4_4.model.Registro;

import java.util.Scanner;

public class Main {
    private static Registro crearCliente(Registro registro, String nombre, String fechaNacimiento, String run) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        /*
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese su RUN: ");
        String run = sc.nextLine();
         */

        System.out.println("Ingrese su direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese su numero de telefono: ");
        String telefono = sc.nextLine();
        System.out.println("Cuantos empleados a cargo tiene: ");
        int empleados = sc.nextInt();

        cliente.setNombre(nombre);
        cliente.setFechaNacimiento(fechaNacimiento);
        cliente.setRun(run);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setCantidadEmpleados(empleados);
        registro.agregarUsuarios(cliente);

        return registro;
    }
    private static Registro crearProfesional(Registro registro, String nombre, String fechaNacimiento, String run) {
        Scanner sc = new Scanner(System.in);
        Profesional profesional = new Profesional();
        /*
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese su RUN: ");
        String run = sc.nextLine();
         */
        System.out.println("Ingrese sus años de experiencia: ");
        String aniosExperiencia = sc.nextLine();
        System.out.println("Ingrese su departamento/seccion: ");
        String departamento = sc.nextLine();


        profesional.setNombre(nombre);
        profesional.setFechaNacimiento(fechaNacimiento);
        profesional.setRun(run);
        profesional.setAniosExperiencia(aniosExperiencia);
        profesional.setDepartamento(departamento);
        registro.agregarUsuarios(profesional);

        return registro;
    }
    private static Registro crearAdministrativo(Registro registro, String nombre, String fechaNacimiento, String run) {
        Scanner sc = new Scanner(System.in);
        Administrativo administrativo = new Administrativo();

        /*
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese su RUN: ");
        String run = sc.nextLine();
         */
        System.out.println("Ingrese su funcion en la empresa: ");
        String funcion = sc.nextLine();
        System.out.println("Ingrese el nombre de su superior: ");
        String nombreSuperior = sc.nextLine();

        administrativo.setNombre(nombre);
        administrativo.setFechaNacimiento(fechaNacimiento);
        administrativo.setRun(run);
        administrativo.setFuncion(funcion);
        administrativo.setNombreSuperior(nombreSuperior);
        registro.agregarUsuarios(administrativo);

        return registro;
    }
    private static void reIngreso(Registro registro) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                    Seleccione una opcion: 
                    1. Ingresar nuevo usuario.
                    2. Mostrar Usuarios Registrados.
                    3. SALIR.
                            """);
        int desicion = sc.nextInt();
        if (desicion == 2) {
            registro.mostrarObjetos();
            Thread.sleep(5000);
            System.exit(1);
        }
        else if ( desicion == 3) {
            System.out.println("Usted a salido del sistema de ingreso de usuarios.");
            Thread.sleep(5000);
            System.exit(1);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Registro registro = new Registro();
        boolean funcionando = true;

        while(funcionando) {

            System.out.println("Ingrese el nombre del usuario: ");
            String nombre = sc.next();
            System.out.println("Ingrese la fecha de nacimiento: ");
            String fechaNacimiento = sc.next();
            System.out.println("Ingrese el RUN: ");
            String run = sc.next();

            System.out.println("""
        
        Bienvenido al sistema de ingreso de usuarios, que tipo de usuario ingresara:
        1. Listar Cliente.
        2. Listar Profesional.
        3. Listar Administrativo.
        4. Mostrar Usuarios ingresados.
        5. SALIR.
        """);

            int menu = sc.nextInt();
            if (menu < 1 || menu > 5) {
                System.out.println("Seleccione una opcion valida.");
            }
            switch(menu) {
                case 1 :
                    crearCliente(registro, nombre, fechaNacimiento, run);
                    reIngreso(registro);
                    break;
                case 2:
                    crearProfesional(registro, nombre, fechaNacimiento, run);
                    reIngreso(registro);
                    break;
                case 3:
                    crearAdministrativo(registro, nombre, fechaNacimiento, run);
                    reIngreso(registro);
                    break;
                case 4:
                    registro.mostrarObjetos();
                    break;
                case 5:
                    System.out.println("Usted a salido del sistema de registro de usuarios.");
                    funcionando = false;
                    break;
            }
        }
    }
}
