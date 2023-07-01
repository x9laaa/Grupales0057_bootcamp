package grupoada.grupal9;

public class Capacitacion {
    private int numeroCapacitacion;
    private String empresa;
    private String fechaCapacitacion;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion(int numeroCapacitacion, String empresa, String fechaCapacitacion, String hora, String lugar,
                        int duracion, int cantidadAsistentes) {
        this.numeroCapacitacion = numeroCapacitacion;
        this.empresa = empresa;
        this.fechaCapacitacion = fechaCapacitacion;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getNumeroCapacitacion() {
        return numeroCapacitacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getFechaCapacitacion() {
        return fechaCapacitacion;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public int calcularEdadPromedio() {
        // Lógica para calcular la edad promedio de los asistentes
        // Aquí puedes implementar tu propia lógica para calcular la edad promedio
        // Puedes usar la fecha de nacimiento de los asistentes para calcular la edad
        // o cualquier otro método que consideres apropiado.
        // Por simplicidad, asumamos que ya tenemos un método que retorna la edad promedio.
        return 30; // Valor de ejemplo, reemplaza con tu lógica real.
    }

    @Override
    public String toString() {
        return "Capacitación:\n" +
                "Número de la capacitación: " + numeroCapacitacion + "\n" +
                "Empresa: " + empresa + "\n" +
                "Fecha de capacitación: " + fechaCapacitacion + "\n" +
                "Hora: " + hora + "\n" +
                "Lugar: " + lugar + "\n" +
                "Duración (en minutos): " + duracion + "\n" +
                "Cantidad de asistentes: " + cantidadAsistentes + "\n";
    }
}
