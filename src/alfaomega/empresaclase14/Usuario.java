package alfaomega.empresaclase14;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {

    private String nombreUsuario;
    private LocalDate fechaNacimientoUsuario;
    private String runUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, LocalDate fechaNacimientoUsuario, String runUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.runUsuario = runUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(LocalDate fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getRunUsuario() {
        return runUsuario;
    }

    public void setRunUsuario(String runUsuario) {
        this.runUsuario = runUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaNacimientoUsuario=" + fechaNacimientoUsuario +
                ", runUsuario='" + runUsuario + '\'' +
                '}';
    }

    public void mostrarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimientoUsuario, fechaActual);
        int edadUsuario = periodo.getYears();
        System.out.println("El Usuario tiene " + edadUsuario + " años");

    }
}
