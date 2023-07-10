package losmalvekexx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TrabajoGrupal9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos de la empresa
        System.out.println("Ingrese los datos de la empresa:");
        System.out.print("RUT: ");
        String rut = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Comuna: ");
        String comuna = scanner.nextLine();
        System.out.print("Número de teléfono: ");
        String telefono = scanner.nextLine();

        // Datos de la capacitación
        System.out.println("\nIngrese los datos de la capacitación:");
        System.out.print("Día: ");
        String dia = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Duración: ");
        String duracion = scanner.nextLine();

        int cantidadAsistentes;
        do {
            System.out.print("Cantidad de asistentes: ");
            cantidadAsistentes = scanner.nextInt();
        } while (cantidadAsistentes <= 0);

        // Registro de asistentes
        List<Asistente> asistentes = new ArrayList<>();
        scanner.nextLine(); // Limpiar el buffer de entrada

        System.out.println("\nIngrese los datos de los asistentes:");
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("Asistente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreAsistente = scanner.nextLine();
            System.out.print("Edad: ");
            int edadAsistente = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            Asistente asistente = new Asistente(nombreAsistente, edadAsistente);
            asistentes.add(asistente);
        }

        // Mostrar los resultados
        System.out.println("\nDatos de la empresa:");
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombreEmpresa);
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Número de teléfono: " + telefono);

        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion);

        int countMenores25 = 0;
        int count26a35 = 0;
        int countMayores35 = 0;

        for (Asistente asistente : asistentes) {
            if (asistente.getEdad() < 25) {
                countMenores25++;
            } else if (asistente.getEdad() >= 26 && asistente.getEdad() <= 35) {
                count26a35++;
            } else {
                countMayores35++;
            }
        }

        System.out.println("\nCantidad de personas:");
        System.out.println("Menores de 25 años: " + countMenores25);
        System.out.println("Entre 26 y 35 años: " + count26a35);
        System.out.println("Mayores de 35 años: " + countMayores35);
    }
}

class Asistente {
    private String nombre;
    private int edad;

    public Asistente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
