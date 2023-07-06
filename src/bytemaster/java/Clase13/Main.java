package bytemaster.java.Clase13;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12345678-2", "sport sa", "4567389", "los libertadores 345", "San miguel");
        Usuario usuario1 = new Usuario("Leo", LocalDate.of(2001, 10, 12),"13456765-0");
        Capacitacion cap1 = new Capacitacion(1, "13249345-5", LocalDate.of(2001, 9, 21), LocalTime.of(10, 30), "Coltauco", 60, 12);

        System.out.println(cliente1.toString());
        System.out.println(usuario1.toString());
        System.out.println(cap1.toString());

    }

}
