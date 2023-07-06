package alfaomega.empresaclase13;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("56.090.630-1", "SICE", "+56979220923", "Dardinag 360", "Recoleta");
        Cliente cliente2 = new Cliente();
        cliente2.setRut("59.684.321-4");
        cliente2.setRazonSocial("OFC");
        cliente2.setTelefono("+5622728143");
        cliente2.setDireccion("Azteca 6198");
        cliente2.setComuna("Peñalolen");


        Usuario usuario1 = new Usuario("Alberto Sepúlveda", "07-05-1992", "18.242.624-5");
        Capacitacion capacitacion1 = new Capacitacion(1, "18.242.624-5", "06-07-2023", "10:00 AM", "Sala de Conferencias", "6 Horas", 10 );

        System.out.println(cliente2.toString());
        System.out.println(usuario1.toString());
        System.out.println(capacitacion1.toString());
    }


}

