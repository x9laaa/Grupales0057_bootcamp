package losmalvekexx.trabajogrupal13;


/*
.Cumple con el principio de Responsabilidad Única al tener la responsabilidad
de representar a un profesional y almacenar sus atributos específicos
como el título y la fecha de ingreso.
Implementa el método analizarUsuario() para mostrar información específica del profesional.

En el código actual, no se viola el principio de Sustitución de Liskov,
ya que las clases derivadas (Profesional, Cliente y Administrativo) no
introducen comportamientos que alteren la semántica de la clase base (Usuario).


 */

public class Profesional extends Usuario{
    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String fechaNacimiento, String run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("El Titulo es: "+getTitulo());
        System.out.println("La Fecha de Ingreso es: "+getFechaIngreso());
    }
}
