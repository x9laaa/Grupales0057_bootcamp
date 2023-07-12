package losmalvekexx.trabajogrupal13;


/*
Cumple con el principio de Responsabilidad Única al tener la responsabilidad de representar
 a un administrativo y almacenar sus atributos específicos como área y experiencia previa.

Implementa el método analizarUsuario() para mostrar información específica del administrativo.


En el código actual, no se viola el principio de Sustitución de Liskov,
ya que las clases derivadas (Profesional, Cliente y Administrativo) no
introducen comportamientos que alteren la semántica de la clase base (Usuario).



 */

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
