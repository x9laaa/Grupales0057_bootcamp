package codingclub404.modulo04.grupal16;

public class Cliente extends Usuario{
    private int rut;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String comuna;

    public Cliente(String nombre, int rut, String razonSocial, String telefono, String direccion, String comuna) {
        super(nombre);
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(rut);
        System.out.println(razonSocial);
        System.out.println(telefono);
        System.out.println(direccion);
        System.out.println(comuna);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getRut() {
        return rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String obtenerNombre() {
        return this.razonSocial + " " + this.rut;
    }

}
