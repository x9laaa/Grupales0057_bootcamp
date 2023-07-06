package grupoada.grupal13;


public class Cliente {

    //atributos
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String comuna;


    //contructor vacio
    public Cliente(){};

    //Contructor por parametros
    public Cliente(String razonSocial, String telefono, String direccion, String comuna) {
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    //Getter and setter
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
    //toString

    @Override
    public String toString() {
        return "Cliente{" +
                "razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
