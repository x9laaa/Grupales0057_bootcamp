package codingclub404.modulo04.grupal14;

import java.time.LocalDate;

public class Accidente {

    int idAccidente;
    LocalDate dia;
    String hora;
    String lugar;
    String origen;
    String consecuencias;

    public Accidente() {
    }

    public Accidente(int idAccidente, LocalDate dia, String hora, String lugar, String origen, String consecuencias) {
        this.idAccidente = idAccidente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "idAccidente=" + idAccidente +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }

    public int getIdAccidente() {
        return idAccidente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }
}
