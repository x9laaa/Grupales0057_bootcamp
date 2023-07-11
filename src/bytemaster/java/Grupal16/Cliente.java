package bytemaster.java.Grupal16;

import java.time.LocalDate;

public class Cliente extends Usuario {
    private String rut;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String nombre, LocalDate fechaNacimiento, String run, String rut, String razonSocial, String telefono, String direccion, String comuna) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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
        return "\n Cliente{" +
                "rut='" + rut + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                "} " + super.toString();
    }

    public String obtenerNombre(){
        String nombreC = "--------------------------\n"+"Mombre de empresa: "+getRazonSocial() + "\nRUT Empresa: " + getRut() + "\nDirecion: "+ getDireccion()+", "+getComuna()+"\n--------------------------";
        return nombreC;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("el Rut es: "+getRut()+" razon social: "+getRazonSocial()+" La direccion es: "+getDireccion());

    }
}

