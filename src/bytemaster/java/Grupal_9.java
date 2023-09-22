package bytemaster.java;

/*Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de información
que le permita administrar los principales procesos que se llevan a cabo en ella día a día.
Dentro de las actividades que realiza, están las capacitaciones. Estas son instancias que se
desarrollan para todos los clientes que posee (que corresponden generalmente a otras empresas).
Por cada capacitación se desea tener registro del RUT del cliente, su nombre, dirección, comuna y
número de teléfono. En cuanto a la capacitación misma, se necesita saber el día, hora, lugar,
duración y cantidad de asistentes.
De acuerdo con la cantidad de asistentes anteriormente ingresada, se debe solicitar y el nombre y
edad de los asistentes. Finalizado este proceso, debe mostrar por pantalla los datos de la empresa
que pidió la capacitación, los datos de la capacitación misma, y la cantidad de personas menores a
25 años, entre 26 y 35 años y mayores a 35 años.
Nota: Todos los datos son obligatorios. Por tanto, debe validar que el ingreso haya sido correcto en
todos los casos. Además, debe validar que la cantidad de asistentes registrada sea mayor que cero*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grupal_9 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Registrar datos de la empresa cliente
    System.out.println("Registro de datos de la empresa cliente");
    System.out.print("Ingrese el RUT del cliente: ");
    String rutCliente = scanner.nextLine();
    System.out.print("Ingrese el nombre del cliente: ");
    String nombreCliente = scanner.nextLine();
    System.out.print("Ingrese la dirección del cliente: ");
    String direccionCliente = scanner.nextLine();
    System.out.print("Ingrese la comuna del cliente: ");
    String comunaCliente = scanner.nextLine();
    System.out.print("Ingrese el número de teléfono del cliente: ");
    String telefonoCliente = scanner.nextLine();

    // Registrar datos de la capacitación
    System.out.println("\nRegistro de datos de la capacitación");
    System.out.print("Ingrese el día de la capacitación: ");
    String diaCapacitacion = scanner.nextLine();
    System.out.print("Ingrese la hora de la capacitación: ");
    String horaCapacitacion = scanner.nextLine();
    System.out.print("Ingrese el lugar de la capacitación: ");
    String lugarCapacitacion = scanner.nextLine();
    System.out.print("Ingrese la duración de la capacitación (en horas): ");
    int duracionCapacitacion = scanner.nextInt();
    System.out.print("Ingrese la cantidad de asistentes: ");
    int cantidadAsistentes = scanner.nextInt();

    // Validar que la cantidad de asistentes sea mayor que cero
    if (cantidadAsistentes <= 0) {
        System.out.println("Error: La cantidad de asistentes debe ser mayor que cero.");
        return;
    }

    // Registrar datos de los asistentes
    List<String> nombresAsistentes = new ArrayList<>();
    List<Integer> edadesAsistentes = new ArrayList<>();

    scanner.nextLine(); // Consumir el salto de línea pendiente

    for (int i = 0; i < cantidadAsistentes; i++) {
        System.out.println("\nRegistro de datos del asistente " + (i + 1));
        System.out.print("Ingrese el nombre del asistente: ");
        String nombreAsistente = scanner.nextLine();
        System.out.print("Ingrese la edad del asistente: ");
        int edadAsistente = scanner.nextInt();

        nombresAsistentes.add(nombreAsistente);
        edadesAsistentes.add(edadAsistente);

        scanner.nextLine(); // Consumir el salto de línea pendiente
    }

    // Mostrar los datos ingresados
    System.out.println("\n--- Datos de la empresa cliente ---");
    System.out.println("RUT del cliente: " + rutCliente);
    System.out.println("Nombre del cliente: " + nombreCliente);
    System.out.println("Dirección del cliente: " + direccionCliente);
    System.out.println("Comuna del cliente: " + comunaCliente);
    System.out.println("Número de teléfono del cliente: " + telefonoCliente);

    System.out.println("\n--- Datos de la capacitación ---");
    System.out.println("Día de la capacitación: " + diaCapacitacion);
    System.out.println("Hora de la capacitación: " + horaCapacitacion);
    System.out.println("Lugar de la capacitación: " + lugarCapacitacion);
    System.out.println("Duración de la capacitación: " + duracionCapacitacion + " horas");

    // Contar las edades de los asistentes en diferentes rangos
    int menores25 = 0;
    int entre26y35 = 0;
    int mayores35 = 0;

    for (int edad : edadesAsistentes) {
        if (edad < 25) {
            menores25++;
        } else if (edad >= 26 && edad <= 35) {
            entre26y35++;
        } else {
            mayores35++;
        }
    }

    System.out.println("\n--- Cantidad de asistentes por rango de edad ---");
    System.out.println("Menores a 25 años: " + menores25);
    System.out.println("Entre 26 y 35 años: " + entre26y35);
    System.out.println("Mayores a 35 años: " + mayores35);
}
}