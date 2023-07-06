package rocketteam.java.empresaclase13;

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

        Capacitacion cap1 = new Capacitacion(111,c2.getRut(),LocalDate.of(2023,Month.AUGUST, 10), LocalTime.of(19,30),"Providencia",60,50);
        Capacitacion cap2 = new Capacitacion();
        cap2.setIdentificador(222);
        cap2.setRutClinte(c1.getRut());
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

        System.out.println("\n---- Cliente ----" +
                "\nRut: " + c1.getRut() +
                "\nRazón Social: " + c1.getRazonSocial() +
                "\nTeléfono: " + c1.getTelefono() +
                "\nDirección:" + c1.getDireccion() +
                "\nComuna:" + c1.getComuna());

        System.out.println("\nRut y nombre: "+c1.obtenerNombre());

        System.out.println("\n---- Cliente ----" +
                "\nRut: " + c2.getRut() +
                "\nRazón Social: " + c2.getRazonSocial() +
                "\nTeléfono: " + c2.getTelefono() +
                "\nDirección:" + c2.getDireccion() +
                "\nComuna:" + c2.getComuna());

        System.out.println("\nRut y nombre: "+c2.obtenerNombre());

        System.out.println("\n---- Usuario ----"+
                "\nNombre: "+ user1.getNombre()+
                "\nFecha de nacimiento: "+ user1.getFechaNac()+
                "\nRun: "+user1.getRun());

        System.out.println("\nEdad: "+user1.mostrarEdad());

        System.out.println("\n---- Usuario ----"+
                "\nNombre: "+ user2.getNombre()+
                "\nFecha de nacimiento: "+ user2.getFechaNac()+
                "\nRun: "+user2.getRun());

        System.out.println("\nEdad: "+user2.mostrarEdad());

        System.out.println("\n---- Capacitación ----" +
                "\nIdentificador: " + cap1.getIdentificador() +
                "\nRut cliente: " + cap1.getRutClinte() +
                "\nDía: " + cap1.getDia() +
                "\nHora:" + cap1.getHora() +
                "\nLugar:" + cap1.getLugar()+
                "\nDuración:" + cap1.getDuracion()+
                "\nCantidad de asistentes:" + cap1.getCantidadAsistentes());

        System.out.println("\nDetalle: "+cap1.mostrarDetalle());

        System.out.println("\n---- Capacitación ----" +
                "\nIdentificador: " + cap2.getIdentificador() +
                "\nRut cliente: " + cap2.getRutClinte() +
                "\nDía: " + cap2.getDia() +
                "\nHora:" + cap2.getHora() +
                "\nLugar:" + cap2.getLugar()+
                "\nDuración:" + cap2.getDuracion()+
                "\nCantidad de asistentes:" + cap2.getCantidadAsistentes());

        System.out.println("\nDetalle: "+cap2.mostrarDetalle());




    }
}
