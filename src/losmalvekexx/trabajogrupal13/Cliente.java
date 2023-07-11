package losmalvekexx.trabajogrupal13;
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
