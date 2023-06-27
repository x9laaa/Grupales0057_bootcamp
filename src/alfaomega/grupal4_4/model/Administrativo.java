package alfaomega.grupal4_4.model;

public class Administrativo extends Usuarios{
    private String funcion;
    private String nombreSuperior;
    public Administrativo(){}
    public Administrativo(String nombre, String fechaNacimiento, String run, String funcion, String nombreSuperior) {
        super(nombre, fechaNacimiento, run);
        this.funcion = funcion;
        this.nombreSuperior = nombreSuperior;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNombreSuperior() {
        return nombreSuperior;
    }

    public void setNombreSuperior(String nombreSuperior) {
        this.nombreSuperior = nombreSuperior;
    }

    @Override
    public String toString() {
        return super.toString() +
                "funcion='" + funcion + '\'' +
                ", nombre del superior='" + nombreSuperior +
                '}';
    }
}
