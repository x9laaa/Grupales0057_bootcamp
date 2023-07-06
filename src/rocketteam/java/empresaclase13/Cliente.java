package rocketteam.java.empresaclase13;

public class Cliente {

    private int rut;
    private String razonSocial;
    private int telefono;
    private String direccion;
    private String comuna;


    public Cliente() {
    }

    public Cliente(int rut, String razonSocial, int telefono, String direccion, String comuna) {

        if (rut > 99999999) {
            throw new IllegalArgumentException("El valor debe ser menor a 99999999");
        }
        else this.rut =rut;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        if (rut > 99999999) {
            throw new IllegalArgumentException("El valor debe ser menor a 99999999");
        }
        else this.rut =rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefono=" + telefono +
                ", dirección='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    public String obtenerNombre() {
        return getRazonSocial() + " " + getRut();
    }
}
