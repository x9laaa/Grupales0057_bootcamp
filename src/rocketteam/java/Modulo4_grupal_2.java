package rocketteam.java;


import java.util.Scanner;

public class Modulo4_grupal_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombres, apellidos, telefono, afp, direccion, comuna;
        int sistemaSalud, edad, rut;

        System.out.println("Ingrese RUT");

        do {
            rut = scanner.nextInt();
            if (rut > 99999998) {
                System.out.println("Rut debe ser menor a 99.999.999");
            }
        } while (rut >= 99999999);

        System.out.println("Ingrese nombres");

        do {
            nombres = scanner.next();
            if (nombres.isEmpty()) {
                System.out.println("Debe ingresar nombre");
            }
        } while (nombres.isEmpty());

        System.out.println("Ingrese apellidos");

        do {
            apellidos = scanner.next();
            if (apellidos.isEmpty()) {
                System.out.println("Debe ingresar apellidos");
            }
        } while (apellidos.isEmpty());

        System.out.println("Ingrese teléfono");

        do {
            telefono = scanner.next();
            if (telefono.length() > 15) {
                System.out.println("Teléfono no debe tener más de 15 caracteres");
            }
        } while (telefono.length() > 15);

        System.out.println("Ingrese AFP");

        do {
            afp = scanner.next();
            if (afp.isEmpty()) {
                System.out.println("Debe ingresar AFP");
            }
        } while (afp.isEmpty());

        System.out.println("Ingrese sistema de salud 1(Fonasa) 2(Isapre)");

        do {
            sistemaSalud = scanner.nextInt();
            if (sistemaSalud != 1 && sistemaSalud != 2) {
                System.out.println("Debe ingresar 1(Fonasa) o 2(Isapre)");
            }
        } while (sistemaSalud != 1 && sistemaSalud != 2);

        System.out.println("Ingrese dirección");

        do {
            direccion = scanner.next();
            if (direccion.length() > 50) {
                System.out.println("Dirección no debe tener más de 50 caracteres");
            }
        } while (direccion.length() > 50);

        System.out.println("Ingrese comuna");

        do {
            comuna = scanner.next();
            if (comuna.isEmpty()) {
                System.out.println("Debe ingresar comuna");
            }
        } while (comuna.isEmpty());

        System.out.println("Ingrese edad");

        do {
            edad = scanner.nextInt();
            if (edad > 119) {
                System.out.println("Edad debe ser menor a 120 años");
            }
        } while (edad >= 120);

        System.out.println("");
        System.out.println("Informe");
        System.out.println("Rut: " + rut);
        System.out.println("Nombre completo: " + nombres + " " + apellidos);
        System.out.println("Teléfono: " + telefono);
        System.out.println("AFP: " + afp);
        System.out.println("Sistema de salud: " + sistemaSalud);
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Edad: " + edad);

        scanner.close();
    }

}
