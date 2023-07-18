package grupoada.grupal15;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaenTerreno {
    private int visita;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private String comentarios;

    public VisitaenTerreno() {
    }

    public VisitaenTerreno(int visita, LocalDate dia, LocalTime hora, String lugar, String comentarios) {
        this.visita = visita;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getVisita() {
        return visita;
    }

    public void setVisita(int visita) {
        this.visita = visita;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaenTerreno{" +
                "visita=" + visita +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
