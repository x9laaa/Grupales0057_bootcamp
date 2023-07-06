package rocketteam.java.empresaclase13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main13 {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(9999999,"Empresas Juanito",771222333,"Calle Falsa 123","Santiago");
        Cliente c2 = new Cliente();
        c2.setRut(78848508);
        c2.setRazonSocial("Calzados Beba");
        c2.setTelefono(934527844);
        c2.setDireccion("Los Gladiolos");
        c2.setComuna("Paico");

        Usuario user1 = new Usuario("Pedro Perez", LocalDate.of(1980, Month.APRIL,26),17342564);
        Usuario user2 = new Usuario();
        user2.setNombre("Guillermo Caceres");
        user2.setFechaNac(LocalDate.of(1991, Month.MAY,16));
        user2.setRun(27451985);

        Capacitacion cap1 = new Capacitacion(111,22345678,LocalDate.of(2023,Month.AUGUST, 10), LocalTime.of(19,30),"Providencia",60,50);
        Capacitacion cap2 = new Capacitacion();
        cap2.setIdentificador(222);
        cap2.setRut(c1.getRut());
        cap2.setDia(LocalDate.of(2023,Month.SEPTEMBER, 23));
        cap2.setHora(LocalTime.of(18,30));
        cap2.setLugar("Renca");
        cap2.setDuracion(90);
        cap2.setCantidadAsistentes(80);


        //Se llama implícitamente al método toString
        System.out.println(c1);
        System.out.println(user1);
        System.out.println(cap1);
        System.out.println(c2);
        System.out.println(user2);
        System.out.println(cap2);

        c1.setDireccion("Calle Real 123");
        user2.setNombre("Daniela Caceres");
        cap1.setLugar("Punta Arenas");

        System.out.println(" Rut: " + c1.getRut() +
                " Razón Social: " + c1.getRazonSocial() +
                " Teléfono: " + c1.getTelefono() +
                "Dirección:" + c1.getDireccion() +
                "Comuna:" + c1.getComuna());


    }
}
