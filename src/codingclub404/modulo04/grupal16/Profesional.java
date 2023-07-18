package codingclub404.modulo04.grupal16;

import java.time.LocalDate;

public class Profesional extends Usuario {
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional(String nombre, String titulo, LocalDate fechaIngreso) {
        super(nombre);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(titulo);
        System.out.println(fechaIngreso);
    }
}
