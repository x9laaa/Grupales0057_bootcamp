package rocketteam.java.grupal_8;

public class Cliente extends Usuario{

    private String direccion;
    private int telefono;
    private int cantEmpleados;


    public Cliente(String nombre, String run, String fechaNac,String direccion,int telefono, int cantEmpleados) {
        super(nombre, run, fechaNac);
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantEmpleados = cantEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }
}
