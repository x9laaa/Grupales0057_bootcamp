package rocketteam.java.grupal16;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Usuario implements IAsesoria{

    private String nombre;
    private LocalDate fechaNac;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNac, int run) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.run = run;
        if (run > 99999998) {
            throw new IllegalArgumentException("El valor debe ser menor a 99999999");
        }
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

    public void analizarUsuario () {
        System.out.println(getNombre());
    }

    public String mostrarEdad(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(getFechaNac(), fechaActual);
        return "El usuario tiene " + periodo.getYears() + " años";
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
