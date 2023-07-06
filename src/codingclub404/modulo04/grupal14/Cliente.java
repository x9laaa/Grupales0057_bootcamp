package codingclub404.modulo04.grupal14;

public class Cliente {
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaDeSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int sistemaDeSalud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaDeSalud = sistemaDeSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaDeSalud=" + sistemaDeSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int getRut() {
        return rut;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getAfp() {
        return afp;
    }

    public int getSistemaDeSalud() {
        return sistemaDeSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public void setSistemaDeSalud(int sistemaDeSalud) {
        this.sistemaDeSalud = sistemaDeSalud;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerNombre() {
        return this.nombres + " " + this.apellidos;
    }

    public String obtenerSistemaDeSalud() {
        if (this.sistemaDeSalud == 1) {
            return "Fonasa";
        } else {
            return "AFP";
        }
    }
}
