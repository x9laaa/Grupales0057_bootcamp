package bytemaster.java.Grupal16;

import java.time.LocalDate;

public class Profesional extends Usuario{
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, LocalDate fechaNacimiento, String run, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNacimiento, run);
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
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                "} " + super.toString();
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("El titulo es: "+getTitulo()+", la fecha de ingreso es: "+getFechaIngreso());

    }
}
