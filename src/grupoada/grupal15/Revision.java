package grupoada.grupal15;

public class Revision {
    private int identificador;
    private String nombreIdentificador;
    private String detalle;
    private int estado;

    public Revision() {
    }

    public Revision(int identificador, String nombreIdentificador, String detalle, int estado) {
        this.identificador = identificador;
        this.nombreIdentificador = nombreIdentificador;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreIdentificador() {
        return nombreIdentificador;
    }

    public void setNombreIdentificador(String nombreIdentificador) {
        this.nombreIdentificador = nombreIdentificador;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "identificador=" + identificador +
                ", nombreIdentificador='" + nombreIdentificador + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
