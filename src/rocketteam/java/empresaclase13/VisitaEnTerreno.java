package rocketteam.java.empresaclase13;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaEnTerreno {
    private int identificador;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private String comentarios;

    public VisitaEnTerreno() {
    }

    public VisitaEnTerreno(int identificador, LocalDate dia, LocalTime hora, String lugar, String comentarios) {
        this.identificador = identificador;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getIdentificador() { return identificador; }

    public void setIdentificador(int identificador) { this.identificador = identificador; }

    public LocalDate getDia() { return dia; }

    public void setDia(LocalDate dia) { this.dia = dia; }

    public LocalTime getHora() { return hora; }

    public void setHora(LocalTime hora) { this.hora = hora; }

    public String getLugar() { return lugar; }

    public void setLugar(String lugar) { this.lugar = lugar; }

    public String getComentarios() { return comentarios; }

    public void setComentarios(String comentarios) { this.comentarios = comentarios; }


    @Override
    public String toString() {
        return "VisitaEnTerreno{" +
                "identificador=" + identificador +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
