package losmalvekexx.trabajogrupal13;
public class Cliente {
    private String rut;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String rut, String razonSocial, String telefono, String direccion, String comuna) {
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String xxx) {
        this.razonSocial = xxx;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
