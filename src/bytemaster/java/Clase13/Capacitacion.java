package bytemaster.java.Clase13;

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
}

