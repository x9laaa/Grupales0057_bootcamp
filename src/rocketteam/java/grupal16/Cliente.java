package rocketteam.java.grupal16;

import java.time.LocalDate;

public class Cliente extends Usuario {


    private int telefono;
    private String direccion;
    private String comuna;


    public Cliente() {
    }

    public Cliente(String nombre, LocalDate fechaNac, int run, int telefono, String direccion, String comuna) {
        super(nombre, fechaNac, run);
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
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
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Teléfono: "+this.getTelefono()+", Dirección: "+this.getDireccion()+", Comuna: "+this.getComuna());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                "} " + super.toString();
    }
}
