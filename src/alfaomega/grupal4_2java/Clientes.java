package alfaomega.grupal4_2java;

import java.util.Scanner;

public class Clientes {
    private int RUT;
    private String nombre;
    private String apellido;
    private String telefono;
    private String AFP;
    private String salud;
    private String direccion;
    private String comuna;
    private int edad;

    public Clientes(int RUT, String nombre, String apellido, String telefono, String AFP, String salud, String direccion, String comuna, int edad) {
        this.RUT = RUT;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.AFP = AFP;
        this.salud = salud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public Clientes() {
    }

    /* Se pide que el algoritmo solicite al usuario cada uno de los valores antes mencionados, los almacene
    en una variable y los despliegue por pantalla. Además, debe realizar la validación que se indica en
    cada campo y, en caso de que alguna de las validaciones no se haya cumplido, debe retornar un
    mensaje de error.*/


    public void AlmacenarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rut del cliente: ");
        int rut = scanner.nextInt();
        while(rut > 30000000 || rut < 1) {
            System.out.println("Ingrese un valor permitido.");
            rut = scanner.nextInt();
        }

        System.out.println("Nombre del cliente: ");
        String nombreCliente = scanner.next();
        while(nombreCliente.isEmpty()) {
            System.out.println("Ingrese un nombre permitido.");
            nombre = scanner.next();
        }

        System.out.println("Apellido del cliente: ");
        String apellidoCliente = scanner.next();
        while(apellidoCliente.isEmpty()) {
            System.out.println("Ingrese un apellido permitido.");
            apellidoCliente = scanner.next();
        }

        System.out.println("Telefono del cliente: ");
        String telefonoCliente = scanner.next();
        while(telefonoCliente.length() > 15 || telefonoCliente.isEmpty()) {
            System.out.println("Ingrese un telefono permitido.");
            telefonoCliente = scanner.next();
        }

        System.out.println("AFP a la que pertenece el usuario: ");
        String AFPCliente = scanner.next();
        while(AFPCliente.isEmpty()) {
            System.out.println("Ingrese una AFP permitida.");
            AFPCliente = scanner.next();
        }

        System.out.println("""
            Sistema de salud del cliente:
            1. Fonasa.
            2. Isapre.
                    """);
        int saludCliente = scanner.nextInt();
        while(saludCliente < 1 && saludCliente > 2) {
            System.out.println("Ingrese un sistema de salud permitido.");
            saludCliente = scanner.nextInt();
        }

        String saludUsuario = "";
        if (saludCliente == 1) {
            saludUsuario = "Fonasa";
        }
        else if (saludCliente == 2) {
            saludUsuario = "Isapre";
        }

        System.out.println("Direccion del cliente: ");
        String direccionCliente = scanner.next();
        while(direccionCliente.isEmpty()) {
            System.out.println("Ingrese una direccion permitida.");
            direccionCliente = scanner.next();
        }

        System.out.println("Comuna del cliente: ");
        String comunaCliente = scanner.next();
        while(comunaCliente.isEmpty()) {
            System.out.println("Ingrese una comuna permitida.");
            comunaCliente = scanner.next();
        }

        System.out.println("Edad del cliente: ");
        int edadCliente = scanner.nextInt();
        while(edadCliente < 1 || edadCliente > 120) {
            System.out.println("Ingrese una edad permitida.");
            edadCliente = scanner.nextInt();
        }

        Clientes cliente = new Clientes(rut, nombreCliente, apellidoCliente, telefonoCliente, AFPCliente, saludUsuario, direccionCliente, comunaCliente, edadCliente);
        System.out.println(cliente);
        scanner.close();
    }

    @Override
    public String toString() {
        return "Clientes{ " +
                "RUT=" + RUT +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", AFP='" + AFP + '\'' +
                ", salud='" + salud + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad + "" +
                '}';
    }
}