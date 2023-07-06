package bytemaster.java.grupal14;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12345678-2", "sport sa", "4567389", "los libertadores 345", "San miguel");
        Cliente cliente2 = new Cliente("78.123.131-3","bytemaster","832432413","mi casa s/n", "cotauco");
        Usuario usuario1 = new Usuario("Leo", LocalDate.of(2001, 10, 12),"13456765-0");
        Usuario usu2= new Usuario("alex",LocalDate.of(1995,8,16),"18.313.324-8");
        Capacitacion cap1 = new Capacitacion(1, "13249345-5", LocalDate.of(2001, 9, 21), LocalTime.of(10, 30), "Coltauco", 60, 12);
        Capacitacion cap2 = new Capacitacion(2,"13.312.313-5",LocalDate.of(2023,7,5),LocalTime.of(12,0),"Rancagua",120,25);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(usuario1.toString());
        System.out.println(usu2.toString());
        System.out.println(cap1.toString());

        System.out.println(cliente1.obtenerNombre());
        System.out.println(usuario1.mostrarEdad());
        System.out.println(usu2.mostrarEdad());
        System.out.println(cap1.mostrarDetalle());


    }

}
