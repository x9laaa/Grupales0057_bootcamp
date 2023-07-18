package grupoada.grupal16y17.Modelos;

import grupoada.grupal16y17.Interfaces.IAsesoria;

public class Administrativo extends Usuario implements IAsesoria {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String nombre, String area, String experienciaPrevia) {
        super(nombre);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
    }

    // En general esta clase cumple con los principios SOLID (más detalles en archivo de texto dentro del package).
}

