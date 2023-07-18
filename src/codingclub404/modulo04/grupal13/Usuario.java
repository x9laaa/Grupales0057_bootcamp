package codingclub404.modulo04.grupal13;

public class Usuario {
    private String nombre;
    private String fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String toString() {
        return "Usuario [Nombre=" + nombre + ", Fecha de nacimiento=" + fechaNacimiento + ", RUN=" + run + "]";
    }
}
