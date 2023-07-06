package rocketteam.java.empresaclase13;

import java.time.LocalDate;
import java.util.Date;

public class Usuario {

    private String nombre;
    private LocalDate fechaNac;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNac, int run) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac=" + fechaNac +
                ", run=" + run +
                '}';
    }
}
