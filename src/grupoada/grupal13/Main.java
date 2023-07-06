package grupoada.grupal13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana", "03/12/1976", "12345678-9");
        grupoada.grupal13.Cliente cliente = new grupoada.grupal13.Cliente("Razon Social", "123456789", "direccion", "comuna");
        grupoada.grupal13.Capacitacion capacitacion = new grupoada.grupal13.Capacitacion(1, 12345678, "Lunes", "10:00", "Sala de conferencias",
                120, 50);
        System.out.println(cliente.toString());
        System.out.println(usuario.toString());
        System.out.println(capacitacion.toString());
    }
}
