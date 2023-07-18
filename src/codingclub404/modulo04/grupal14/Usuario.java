package codingclub404.modulo04.grupal14;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaDeNacimiento, int run) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
    }

    public String mostrarEdad() {
        Period periodoEdad = Period.between(fechaDeNacimiento, LocalDate.now());
        return String.format("El usuario tiene %d años", periodoEdad.getYears());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getRun() {
        return run;
    }
}
