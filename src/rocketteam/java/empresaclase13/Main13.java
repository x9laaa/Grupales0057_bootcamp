package rocketteam.java.empresaclase13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main13 {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(9999999,"Empresas Juanito",771222333,"Calle Falsa 123","Santiago");
        Usuario user1 = new Usuario("Pedro Perez", LocalDate.of(1980, Month.APRIL,26),17342564);
        Capacitacion cap1 = new Capacitacion(111,22345678,LocalDate.of(2023,Month.AUGUST, 10), LocalTime.of(19,30),"Providencia",60,50);
        System.out.println(c1.obtenerNombre());
        System.out.println(user1.mostrarEdad());
        System.out.println(cap1.mostrarDetalle());

        System.out.println(c1);
        System.out.println(user1);
        System.out.println(cap1);
    }
}
