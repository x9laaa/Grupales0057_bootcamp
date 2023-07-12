package rocketteam.java.empresaclase13;

import java.time.LocalDate;

public class Profesional extends Usuario implements Asesoria {
    private String titulo;
    private LocalDate fechaIngreso;
    public Profesional() {
    }

    public Profesional(String nombre, LocalDate fechaNac, int run, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNac, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(getFechaIngreso() + " " + " " + getTitulo());
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
