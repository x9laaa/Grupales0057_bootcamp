package bytemaster.java.Clase13;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                '}';
    }
}
