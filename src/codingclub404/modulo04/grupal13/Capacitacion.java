package codingclub404.modulo04.grupal13;

public class Capacitacion {
    Integer id, cantAsistentes;
    String rutCliente, dia, hora, lugar, duracion;

    public Capacitacion() {
    }

    public Capacitacion(Integer id, Integer cantAsistentes, String rutCliente, String dia, String hora, String lugar, String duracion) {
        this.id = id;
        this.cantAsistentes = cantAsistentes;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantAsistentes() {
        return cantAsistentes;
    }

    public void setCantAsistentes(Integer cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", cantAsistentes=" + cantAsistentes +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }
}
