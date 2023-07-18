package codingclub404.modulo04.grupal16;

import java.time.LocalDate;

public class VisitaEnTerreno {
    private int idVisitaEnTerreno;
    private LocalDate dia;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaEnTerreno() {
    }

    public VisitaEnTerreno(int idVisitaEnTerreno, LocalDate dia, String hora, String lugar, String comentarios) {
        this.idVisitaEnTerreno = idVisitaEnTerreno;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaEnTerreno{" +
                "idVisitaEnTerreno=" + idVisitaEnTerreno +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }

    public int getIdVisitaEnTerreno() {
        return idVisitaEnTerreno;
    }

    public void setIdVisitaEnTerreno(int idVisitaEnTerreno) {
        this.idVisitaEnTerreno = idVisitaEnTerreno;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
