package bytemaster.java.grupal14;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
    private Integer id;
    private String rut;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private Integer duracion;
    private Integer cantidadAsistentes;

    public Capacitacion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(Integer cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public Capacitacion(Integer id, String rut, LocalDate dia, LocalTime hora, String lugar, Integer duracion, Integer cantidadAsistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rut='" + rut + '\'' +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
    public String mostrarDetalle(){
      String texto="La Capacitacion sera en "+getLugar()+ " a las "+ getHora()+" del dia "+getDia()+" y durara "+getDuracion()+" minutos.";
      return texto;
    };
}

