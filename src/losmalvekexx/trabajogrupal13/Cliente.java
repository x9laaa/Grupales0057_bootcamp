package losmalvekexx.trabajogrupal13;

/*
Cumple con el principio de Responsabilidad Única al tener la responsabilidad
de representar a un cliente y almacenar sus atributos específicos como teléfono,
dirección y comuna.

Implementa el método analizarUsuario() para mostrar información específica del cliente.


En el código actual, no se viola el principio de Sustitución de Liskov,
ya que las clases derivadas (Profesional, Cliente y Administrativo) no
introducen comportamientos que alteren la semántica de la clase base (Usuario).


 */

public class Cliente extends Usuario{
    // Nueva Estructura de Cliente por Grupal 16
    private int telefono;
    private String direccion;
    private String comuna;


    public Cliente() {
    }

    public Cliente(String nombre, String fechaNacimiento, String run, int telefono, String direccion, String comuna) {
        super(nombre, fechaNacimiento, run);
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("El Telefono es: "+getTelefono());
        System.out.println("La Direccion es: "+getDireccion());
        System.out.println("La Comuna es: "+getComuna());
    }
}
