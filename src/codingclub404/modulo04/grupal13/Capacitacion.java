package codingclub404.modulo04.grupal13;

public class Capacitacion {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, int duracion,
                        int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public String toString() {
        return "Capacitacion [Identificador=" + identificador + ", RUT cliente=" + rutCliente + ", Día=" + dia
                + ", Hora=" + hora + ", Lugar=" + lugar + ", Duración=" + duracion + ", Cantidad de asistentes="
                + cantidadAsistentes + "]";
    }
}