package alfaomega.grupal16;

public class Cliente extends Usuario {

    private String rut;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String nombreUsuario, String rut, String razonSocial, String telefono, String direccion, String comuna) {
        super(nombreUsuario);
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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
                "rut='" + rut + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                "} " + super.toString();
    }

    @Override
    public void setNombreUsuario(String nombreUsuario) {
        super.setNombreUsuario(nombreUsuario);
        System.out.println(this.getRut());

    }
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Rut usuario: "+this.getRut());
        System.out.println("Razon Social usuario: "+this.getRazonSocial());
        System.out.println("Telefono usuario: "+this.getTelefono());
        System.out.println("Direccion usuario: "+this.getDireccion());
        System.out.println("Comuna usuario: "+this.getComuna());
    }

    //public String obtenerNombre(){
        //return this.rut + " " + this.razonSocial;
   // }

}