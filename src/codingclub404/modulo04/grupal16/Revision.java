package codingclub404.modulo04.grupal16;

public class Revision {
    private int idRevision;
    private String nombreRevision;
    private String detalleParaReviar;
    private int estado;

    public Revision() {
    }

    public Revision(int idRevision, String nombreRevision, String detalleParaReviar, int estado) {
        this.idRevision = idRevision;
        this.nombreRevision = nombreRevision;
        this.detalleParaReviar = detalleParaReviar;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalleParaReviar='" + detalleParaReviar + '\'' +
                ", estado=" + estado +
                '}';
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalleParaReviar() {
        return detalleParaReviar;
    }

    public void setDetalleParaReviar(String detalleParaReviar) {
        this.detalleParaReviar = detalleParaReviar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
