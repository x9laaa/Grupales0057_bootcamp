package codingclub404.modulo04.grupal13;

public class Cliente {
    String rut, razonSocial, direccion, comuna;
    Integer telefono;

    public Cliente() {
    }

    public Cliente(String rut, String razonSocial, String direccion, String comuna, Integer telefono) {
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
