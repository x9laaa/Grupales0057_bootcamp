package codingclub404.modulo04.grupal14;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("77.891.234-5", "Consultora Java Studios", "Alameda 123", "Santiago", 912345678);
        Cliente cliente2 = new Cliente();
        Usuario usuario1 = new Usuario("Armando", "12.345.678-9", LocalDate.of(1989, 6, 12));
        Usuario usuario2 = new Usuario();
        Capacitacion cap1 = new Capacitacion(1, 15, "77.891.234-5", "Lunes 15", "19:00", "JJVV Brasil", "45");
        Capacitacion cap2 = new Capacitacion();

        cliente2.setRut("9.876.543-2");
        cliente2.setRazonSocial("Empresa Java Learning");
        cliente2.setDireccion("Providencia 1230");
        cliente2.setComuna("Providencia");
        cliente2.setTelefono(988881111);

        usuario2.setNombre("Paloma");
        usuario2.setRut("16.543.218-k");
        usuario2.setFechaNacimiento(LocalDate.of(1991, 6, 25));

        cap2.setId(2);
        cap2.setRutCliente("9.876.543-2");
        cap2.setCantAsistentes(10);
        cap2.setLugar("GAM");
        cap2.setDia("Martes 27");
        cap2.setHora("11:30");
        cap2.setDuracion("45");

        cliente1.toString();
        usuario1.toString();
        cap1.toString();
        cliente2.toString();
        usuario2.toString();
        cap2.toString();

        cliente1.setDireccion("Brasil 123");
        cliente2.setTelefono(944443333);
        usuario1.setNombre("Carlitos");
        usuario2.setNombre("Camila");
        cap1.setDia("Viernes 14");
        cap2.setHora("21:00");

        System.out.println("Cliente1 {" +
                "rut= " + cliente1.getRut() +  '\'' +
                "razonSocial= " + cliente1.getRazonSocial() +  '\'' +
                "direccion= " +  cliente1.getDireccion() +  '\'' +
                "comuna= " + cliente1.getComuna() +  '\'' +
                "teléfono= " + cliente1.getTelefono()+
                "}");

        System.out.println("Cliente2 {" +
                "rut= " + cliente2.getRut() +  '\'' +
                "razonSocial= " + cliente2.getRazonSocial() +  '\'' +
                "direccion= " +  cliente2.getDireccion() +  '\'' +
                "comuna= " + cliente2.getComuna() +  '\'' +
                "teléfono= " + cliente2.getTelefono()+
                "}");

        System.out.println("Usuario1 {" +
                "nombre= " + usuario1.getNombre()+  '\'' +
                "rut= " + usuario1.getRut() +  '\'' +
                "fechaNacimiento= " +  usuario1.getFechaNacimiento() +
                "}");

        System.out.println("Usuario2 {" +
                "nombre= " + usuario2.getNombre()+  '\'' +
                "rut= " + usuario2.getRut() +  '\'' +
                "fechaNacimiento= " +  usuario2.getFechaNacimiento() +
                "}");

        System.out.println("Capacitacion1 {" +
                "id= " + cap1.getId() +  '\'' +
                "rutCliente= " + cap1.getRutCliente() +  '\'' +
                "dia= " +  cap1.getDia()+  '\'' +
                "hora= " + cap1.getHora() +  '\'' +
                "lugar= " + cap1.getLugar() +  '\'' +
                "duracion= " + cap1.getDuracion() +  '\'' +
                "cantAsistentes= " + cap1.getCantAsistentes() +
                "}");

        System.out.println("Capacitacion2 {" +
                "id= " + cap2.getId() +  '\'' +
                "rutCliente= " + cap2.getRutCliente() +  '\'' +
                "dia= " +  cap2.getDia()+  '\'' +
                "hora= " + cap2.getHora() +  '\'' +
                "lugar= " + cap2.getLugar() +  '\'' +
                "duracion= " + cap2.getDuracion() +  '\'' +
                "cantAsistentes= " + cap2.getCantAsistentes() +
                "}");

        System.out.println(cliente1.obtenerNombre());
        System.out.println(cliente2.obtenerNombre());
        System.out.println(usuario1.mostrarEdad());
        System.out.println(usuario2.mostrarEdad());
        System.out.println(cap1.mostrarDetalle());
        System.out.println(cap2.mostrarDetalle());


    }
}
