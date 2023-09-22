package bytemaster.java.Grupal16;

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements IAsesoria{
    private String nombre;
    private LocalDate fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
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
    public String mostrarEdad(){
        Period periodo = Period.between(getFechaNacimiento(), LocalDate.now());
        String edad= "El usuario "+ getNombre()+" tiene "+ periodo.getYears()+" años";
        return edad;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("DATOS DE USUARIO\nEl nombre de usuario es: "+getNombre()+", Run: "+getRun()+" y su fecha nacimiento es: "+getFechaNacimiento());
    }
}
