package bytemaster.java.grupal14;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12345678-2", "sport sa", "4567389", "los libertadores 345", "San miguel");
        Cliente cli2 = new Cliente();
        cli2.setRut("78.123.131-3");
        cli2.setRazonSocial("bytemaster");
        cli2.setTelefono("832432413");
        cli2.setDireccion("mi casa s/n");
        cli2.setComuna("cotauco");
        Usuario usuario1 = new Usuario("Leo", LocalDate.of(2001, 10, 12),"13456765-0");
        Usuario usu2= new Usuario();
        usu2.setNombre("alex");
        usu2.setFechaNacimiento(LocalDate.of(1995,8,16));
        usu2.setRun("18.313.324-8");
        Capacitacion cap1 = new Capacitacion(1, "13249345-5", LocalDate.of(2001, 9, 21), LocalTime.of(10, 30), "Coltauco", 60, 12);
        Capacitacion cap2 = new Capacitacion();
        cap2.setId(2);
        cap2.setRut("13.312.313-5");
        cap2.setDia(LocalDate.of(2023,7,5));
        cap2.setHora(LocalTime.of(12,0));
        cap2.setLugar("Rancagua");
        cap2.setDuracion(120);
        cap2.setCantidadAsistentes(25);

        System.out.println("----- Métodos to String -----");
        System.out.println(cliente1.toString());
        System.out.println(cli2.toString());
        System.out.println(usuario1.toString());
        System.out.println(usu2.toString());
        System.out.println(cap1.toString());
        System.out.println(cap2.toString());
        System.out.println("----- Métodos de clases -----");
        System.out.println(cliente1.obtenerNombre());
        System.out.println(usuario1.mostrarEdad());
        System.out.println(usu2.mostrarEdad());
        System.out.println(cap1.mostrarDetalle());

        System.out.println("----- Mostrar con Get -----");
        System.out.println(cliente1.getRazonSocial());
        System.out.println(cliente1.getRut());
        System.out.println(cliente1.getDireccion()+", "+cliente1.getComuna());


    }

}
