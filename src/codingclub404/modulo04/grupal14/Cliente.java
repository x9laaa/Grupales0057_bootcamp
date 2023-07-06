package codingclub404.modulo04.grupal14;

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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
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

    public String obtenerNombre(){
        return this.razonSocial + " "+ this.rut;
    }


}
