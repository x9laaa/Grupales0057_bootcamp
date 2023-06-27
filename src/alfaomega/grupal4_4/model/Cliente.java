package alfaomega.grupal4_4.model;

public class Cliente extends Usuarios{
    private String direccion;
    private String telefono;
    private int cantidadEmpleados;

    public Cliente(){}

    public Cliente(String nombre, String fechaNacimiento, String run, String direccion, String telefono, int cantidadEmpleados) {
        super(nombre, fechaNacimiento, run);
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public String toString() {
        return super.toString() +
                "direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cantidad de empleados'" + cantidadEmpleados +
                '}';
    }
}
