package codingclub404.modulo04.grupal13;

public class Cliente {
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud,
                   String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public String toString() {
        return "Cliente [RUT=" + rut + ", Nombres=" + nombres + ", Apellidos=" + apellidos + ", Teléfono=" + telefono
                + ", AFP=" + afp + ", Sistema de salud=" + sistemaSalud + ", Dirección=" + direccion + ", Comuna="
                + comuna + ", Edad=" + edad + "]";
    }
}