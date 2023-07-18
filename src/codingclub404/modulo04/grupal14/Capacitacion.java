package codingclub404.modulo04.grupal14;

public class Capacitacion {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadDeAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, int duracion, int cantidadDeAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public String mostrarDetalle() {
        return String.format("La capacitación será en %s a las %s del día %s, y durará %d minutos", lugar, hora, dia, duracion);
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                '}';
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }
}
