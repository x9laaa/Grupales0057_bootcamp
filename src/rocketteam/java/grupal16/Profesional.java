package rocketteam.java.grupal16;

import java.time.LocalDate;

/**
 Open/Closed Principle, OCP
 Este principio hace que clases y objetos no modifiquen su código base ni implementación original
 pero a la vez estén abiertos a modificaciones a través de instancias en otros objetos, la idea es mantener cerrada
 su implementación original pero a la vez esté abierto pequeñas modificaciones a través de herencia cuando se necesite.
 */

public class Profesional extends Usuario {
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
        System.out.println("Fecha de ingreso: "+getFechaIngreso() + ", Título: " + getTitulo());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
