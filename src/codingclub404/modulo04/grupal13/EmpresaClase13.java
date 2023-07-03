package codingclub404.modulo04.grupal13;

public class EmpresaClase13 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(12345678, "Juan", "Pérez", "123456789", "AFP1", 1, "Calle 123", "Santiago", 30);
        Usuario usuario = new Usuario("John Doe", "2000-01-01", "123456789");
        Capacitacion capacitacion = new Capacitacion(1, 12345678, "2023-07-03", "10:00", "Sala A", 60, 20);

        System.out.println(cliente.toString());
        System.out.println(usuario.toString());
        System.out.println(capacitacion.toString());
    }
}