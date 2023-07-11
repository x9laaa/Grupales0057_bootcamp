package grupoada.grupal16.grupal15.Modelos;

import grupoada.grupal16.grupal15.Interfaces.IAsesoria;

public class Usuario implements IAsesoria {
    private String nombre;
    private String fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public Usuario(String nombre) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombre);
    }
}
