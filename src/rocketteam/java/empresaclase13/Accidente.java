package rocketteam.java.empresaclase13;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
    private int identificador;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int identificador, LocalDate dia, LocalTime hora, String lugar, String origen, String consecuencias) {
        this.identificador = identificador;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public LocalDate getDia() {return dia;}

    public void setDia(LocalDate dia) {this.dia = dia;}

    public LocalTime getHora() {return hora;}

    public void setHora(LocalTime hora) {this.hora = hora;}

    public String getLugar() {return lugar;}

    public void setLugar(String lugar) {this.lugar = lugar;}

    public String getOrigen() {return origen;}

    public void setOrigen(String origen) {this.origen = origen;}

    public String getConsecuencias() {return consecuencias;}

    public void setConsecuencias(String consecuencias) {this.consecuencias = consecuencias;}

    public String registroAccidentes(){

    }

    @Override
    public String toString() {
        return "Accidente{" +
                "identificador=" + identificador +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
