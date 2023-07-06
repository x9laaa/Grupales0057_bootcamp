package rocketteam.java.empresaclase13;

public class Cliente {

    private int rut;
    private String razonSocial;
    private int telefono;
    private String dirección;
    private String comuna;


    public Cliente() {
    }

    public Cliente(int rut, String razonSocial, int telefono, String dirección, String comuna) {
        if(rut < 99999999) this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.dirección = dirección;
        this.comuna = comuna;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
     if(rut < 99999999) this.rut = rut;

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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
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
                ", dirección='" + dirección + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
