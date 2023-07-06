package alfaomega.empresaclase13;

public class Usuario {

    private String nombreUsuario;
    private String fechaNacimientoUsuario;
    private String runUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String fechaNacimientoUsuario, String runUsuario) {
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

    public String getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
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
                ", fechaNacimientoUsuario='" + fechaNacimientoUsuario + '\'' +
                ", runUsuario='" + runUsuario + '\'' +
                '}';
    }
}
