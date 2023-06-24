package rocketteam.java.grupal_8;

public class Usuario {

    private String nombre;
    private String run;
    private String fechaNac;

    public Usuario(String nombre, String run, String fechaNac) {
        this.nombre = nombre;
        this.run = run;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
