package alfaomega.grupal16;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String nombreUsuario, String area, String experienciaPrevia) {
        super(nombreUsuario);
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
                ", nombreUsuario='" + nombreUsuario + '\'' +
                "} " + super.toString();
    }

    @Override
    public void setNombreUsuario(String nombreUsuario) {
        super.setNombreUsuario(nombreUsuario);
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }
}
