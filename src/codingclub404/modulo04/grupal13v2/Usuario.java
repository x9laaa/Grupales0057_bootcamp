package codingclub404.modulo04.grupal13v2;

public class Usuario {
    private String nombre;
    private String fechaDeNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaDeNacimiento, int run) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }
}
