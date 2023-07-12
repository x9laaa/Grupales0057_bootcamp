package grupoada.grupal16y17.Modelos;

import grupoada.grupal16y17.Interfaces.IAsesoria;

public class Profesional extends Usuario implements IAsesoria {
    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String titulo, String fechaIngreso) {
        super(nombre);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                "} " + super.toString();
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    // En general esta clase cumple con los principios SOLID (más detalles en archivo de texto dentro del package).
}

