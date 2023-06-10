package alfaomega.grupal4_4.model;

public class Profesional extends Usuarios{
    private String aniosExperiencia;
    private String departamento;

    public Profesional() {}
    public Profesional(String nombre, String fechaNacimiento, String run, String aniosExperiencia, String departamento) {
        super(nombre, fechaNacimiento, run);
        this.aniosExperiencia = aniosExperiencia;
        this.departamento = departamento;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "años de experiencia='" + aniosExperiencia + '\'' +
                ", departamento='" + departamento +
                '}';
    }
}
