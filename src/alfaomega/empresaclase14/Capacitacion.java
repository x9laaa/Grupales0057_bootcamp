package alfaomega.empresaclase14;

public class Capacitacion {
    private int idCliente;
    private String rutCliente;
    private String diaCapacitacion;
    private String hora;
    private String lugarCapacitacion;
    private int duracion;
    private int asistentes;

    public Capacitacion() {
    }

    public Capacitacion(int idCliente, String rutCliente, String diaCapacitacion, String hora, String lugarCapacitacion, int duracion, int asistentes) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
        this.diaCapacitacion = diaCapacitacion;
        this.hora = hora;
        this.lugarCapacitacion = lugarCapacitacion;
        this.duracion = duracion;
        this.asistentes = asistentes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaCapacitacion() {
        return diaCapacitacion;
    }

    public void setDiaCapacitacion(String diaCapacitacion) {
        this.diaCapacitacion = diaCapacitacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugarCapacitacion() {
        return lugarCapacitacion;
    }

    public void setLugarCapacitacion(String lugarCapacitacion) {
        this.lugarCapacitacion = lugarCapacitacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {this.duracion = duracion;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCliente=" + idCliente +
                ", rutCliente='" + rutCliente + '\'' +
                ", diaCapacitacion='" + diaCapacitacion + '\'' +
                ", hora='" + hora + '\'' +
                ", lugarCapacitacion='" + lugarCapacitacion + '\'' +
                ", duracion='" + duracion + '\'' +
                ", asistentes=" + asistentes +
                '}';
    }

    public void mostrarDetalle(){
        System.out.println("La capacitación será en " + lugarCapacitacion + " a las " + hora + " del día " + diaCapacitacion +
                ", y durará " + duracion + " minutos");
    }
}