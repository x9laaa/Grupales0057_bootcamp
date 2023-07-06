package alfaomega.empresaclase14;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("56.090.630-1", "SICE", "+56979220923", "Dardinag 360", "Recoleta");
        Cliente cliente2 = new Cliente();
        cliente2.setRut("59.684.321-4");
        cliente2.setRazonSocial("OFC");
        cliente2.setTelefono("+5622728143");
        cliente2.setDireccion("Azteca 6198");
        cliente2.setComuna("Peñalolen");

        Usuario usuario1 = new Usuario("Alberto Sepúlveda", LocalDate.of(2000,05,07), "18.242.624-5");
        Usuario usuario2 = new Usuario();
        usuario2.setNombreUsuario("Cristopher Escobar");
        usuario2.setFechaNacimientoUsuario(LocalDate.of(1995,11,14));
        usuario2.setRunUsuario("19.276.274-k");

        Capacitacion capacitacion1 = new Capacitacion(1, "18.242.624-5", "06-07-2023", "10:00 AM", "Sala de Conferencias", 60, 10 );
        Capacitacion capacitacion2 = new Capacitacion();
        capacitacion2.setIdCliente(2);
        capacitacion2.setRutCliente("19.280.245-8");
        capacitacion2.setDiaCapacitacion("05-07-2023");
        capacitacion2.setHora("12:15");
        capacitacion2.setLugarCapacitacion("Sala de Conferencias");
        capacitacion2.setDuracion(45);
        capacitacion2.setAsistentes(3);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(capacitacion1.toString());
        System.out.println(capacitacion2.toString());

        System.out.println(" ");

        cliente1.setTelefono("+56953614638");
        usuario1.setNombreUsuario("Ramón González");
        capacitacion1.setDuracion(120);

        System.out.println("Cliente 1 - Rut y Razón Social: " + cliente1.obtenerNombre());
        System.out.println("Número de Teléfono es: " + cliente1.getTelefono());
        System.out.println("La dirección es: " + cliente1.getDireccion());
        System.out.println("Perteneciente a la comuna: " + cliente1.getComuna());

        System.out.println(" ");

        System.out.println("Datos del usuario: ");
        System.out.println("Nombre del usuario: " + usuario1.getNombreUsuario());
        System.out.println("Fecha de Nacimiento: " + usuario1.getFechaNacimientoUsuario());
        System.out.println("RUN usuario: " + usuario2.getRunUsuario());
        usuario1.mostrarEdad();

        System.out.println(" ");

        System.out.println("Datos de Capacitación:");
        System.out.println("ID Cliente: "+ capacitacion1.getIdCliente());
        System.out.println("Rut Cliente: " + capacitacion1.getRutCliente());
        System.out.println("Asistirán " + capacitacion1.getAsistentes() + " personas");
        capacitacion1.mostrarDetalle();
    }


}

