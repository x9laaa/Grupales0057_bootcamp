package codingclub404.modulo04.grupal14;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear dos instancias
        Cliente cliente01 = new Cliente(16000300, "Los Pollos Hermanos", "99123477", "Foo Bar 404", "Santiago");
        Cliente cliente02 = new Cliente();
        cliente02.setRut(11222333);
        cliente02.setRazonSocial("La Hermandad de la Casa Grande");
        cliente02.setTelefono("12341234");
        cliente02.setDireccion("Salamanca 9000");
        cliente02.setComuna("Chiloé");

        Usuario usuario01 = new Usuario("Bernardo", LocalDate.of(1970, 1, 1), 17200100);

        Usuario usuario02 = new Usuario();
        usuario02.setNombre("Libertad");
        usuario02.setFechaDeNacimiento(LocalDate.of(1980, 8, 8));
        usuario02.setRun(15005005);

        Capacitacion capacitacion01 = new Capacitacion(1, 18100200, "06/07/2023", "10:30", "Municipalidad de Santiago", 180, 12);

        Capacitacion capacitacion02 = new Capacitacion();
        capacitacion02.setIdentificador(2);
        capacitacion02.setRutCliente(12002002);
        capacitacion02.setDia("13/07/2023");
        capacitacion02.setHora("14:30");
        capacitacion02.setLugar("Municipalidad de La Florida");
        capacitacion02.setDuracion(180);
        capacitacion02.setCantidadDeAsistentes(18);

        //Desplegar los datos con toString
        System.out.println(cliente01.toString());
        System.out.println(cliente02.toString());
        System.out.println(usuario01.toString());
        System.out.println(usuario02.toString());
        System.out.println(capacitacion01.toString());
        System.out.println(capacitacion02.toString());

        //modifique un atributo
        cliente02.setComuna("Ñuñoa");
        usuario01.setNombre("Miguel");
        capacitacion01.setDia("13/07/2023");

        //Despliegue usando los accesores
        //Metodos recien creados
        System.out.println(cliente01.getRut());
        System.out.println(cliente01.getRazonSocial());
        System.out.println(cliente01.getTelefono());
        System.out.println(cliente01.getDireccion());
        System.out.println(cliente01.getComuna());
        System.out.println(cliente01.obtenerNombre());

        System.out.println(cliente02.getRut());
        System.out.println(cliente02.getRazonSocial());
        System.out.println(cliente02.getTelefono());
        System.out.println(cliente02.getDireccion());
        System.out.println(cliente02.getComuna());
        System.out.println(cliente02.obtenerNombre());

        System.out.println(usuario01.getNombre());
        System.out.println(usuario01.getFechaDeNacimiento());
        System.out.println(usuario01.getRun());
        System.out.println(usuario01.mostrarEdad());

        System.out.println(usuario02.getNombre());
        System.out.println(usuario02.getFechaDeNacimiento());
        System.out.println(usuario02.getRun());
        System.out.println(usuario02.mostrarEdad());

        System.out.println(capacitacion01.getIdentificador());
        System.out.println(capacitacion01.getRutCliente());
        System.out.println(capacitacion01.getDia());
        System.out.println(capacitacion01.getHora());
        System.out.println(capacitacion01.getLugar());
        System.out.println(capacitacion01.getDuracion());
        System.out.println(capacitacion01.getCantidadDeAsistentes());
        System.out.println(capacitacion01.mostrarDetalle());

        System.out.println(capacitacion02.getIdentificador());
        System.out.println(capacitacion02.getRutCliente());
        System.out.println(capacitacion02.getDia());
        System.out.println(capacitacion02.getHora());
        System.out.println(capacitacion02.getLugar());
        System.out.println(capacitacion02.getDuracion());
        System.out.println(capacitacion02.getCantidadDeAsistentes());
        System.out.println(capacitacion02.mostrarDetalle());
    }
}
