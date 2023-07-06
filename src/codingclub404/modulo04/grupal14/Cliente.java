package codingclub404.modulo04.grupal14;

public class Cliente {
    private int rut;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(int rut, String razonSocial, String telefono, String direccion, String comuna) {
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    public int getRut() {
        return rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String obtenerNombre() {
        return this.razonSocial + " " + this.rut;
    }

}
