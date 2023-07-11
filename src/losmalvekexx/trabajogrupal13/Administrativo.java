package losmalvekexx.trabajogrupal13;

public class Administrativo extends Usuario{

    private String area;
    private int expPrevia;

    public Administrativo() {
    }

    public Administrativo(String nombre, String fechaNacimiento, String run, String area, int expPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.expPrevia = expPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExpPrevia() {
        return expPrevia;
    }

    public void setExpPrevia(int expPrevia) {
        this.expPrevia = expPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", expPrevia=" + expPrevia +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("La Area es: "+getArea());
        System.out.println("La Experiencia Previa es: "+getExpPrevia());
    }
}
