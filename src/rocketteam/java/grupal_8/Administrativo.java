package rocketteam.java.grupal_8;

public class Administrativo  extends Usuario{

    private String funcion;
    private String nombreSup;

    public Administrativo(String nombre, String run, String fechaNac, String funcion, String nombreSup) {
        super(nombre, run, fechaNac);
        this.funcion = funcion;
        this.nombreSup = nombreSup;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNombreSup() {
        return nombreSup;
    }

    public void setNombreSup(String nombreSup) {
        this.nombreSup = nombreSup;
    }
}
