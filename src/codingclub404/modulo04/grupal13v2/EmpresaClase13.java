package codingclub404.modulo04.grupal13v2;

public class EmpresaClase13 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(16000300, "Jose Ignacio", "Loyola Mendez", "99123477", "AFP standard", 1, "Foo Bar 404", "Santiago", 33);
        Usuario usuario = new Usuario("Bernardo", "1970/01/01", 17200100);
        Capacitacion capacitacion = new Capacitacion(1, 18100200, "2023/07/05", "10:30", "Municipalidad de Santiago", "3 horas", 12);

        System.out.println(cliente.toString());
        System.out.println(usuario.toString());
        System.out.println(capacitacion.toString());
    }
}
