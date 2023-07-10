package grupoada.grupal9;

public class Cliente {
    private int rut;
    private String nombre;
    private String empresa;
    private String direccion;
    private String comuna;
    private int telefono;
    private int numeroCapacitacion;

    public Cliente(int rut, String nombre, String empresa, String direccion, String comuna, int telefono,
                   int numeroCapacitacion) {
        this.rut = rut;
        this.nombre = nombre;
        this.empresa = empresa;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.numeroCapacitacion = numeroCapacitacion;
    }

    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getNumeroCapacitacion() {
        return numeroCapacitacion;
    }
}
