package grupoada.grupal15;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
    private int identificador;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private String duracion;
    private int asistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, LocalDate dia, LocalTime hora, String lugar, String duracion, int asistentes) {
        this.identificador = identificador;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.asistentes = asistentes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", asistentes=" + asistentes +
                '}';
    }

}
