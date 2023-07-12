package losmalvekexx.trabajogrupal13;


/*
Cumple con el principio de Responsabilidad Única al tener la responsabilidad de representar
una capacitación y almacenar sus atributos específicos como identificador, rut del cliente,
día, hora, lugar, duración y cantidad de asistentes.

Implementa el método mostrarDetalle() para mostrar detalles específicos de la capacitación.
 */

public class Capacitacion {
    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public Capacitacion() {
    }

    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
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
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }

    //mostrarDetalle(): retorna un mensaje con el texto “La capacitación será en A a las B del día
    //C, y durará D minutos”, en donde A es el lugar, B es la hora, C es el día y D son los minutos.

    public String mostrarDetalle(){
        return "La capacitación será en "+ lugar + " a las" + hora +" del día"+ dia+", y durará "+duracion+" minutos";
    }

}
