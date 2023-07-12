package alfaomega.grupal16;

public class Profesional extends Usuario{
    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombreUsuario, String titulo, String fechaIngreso) {
        super(nombreUsuario);
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
                ", nombreUsuario='" + nombreUsuario + '\'' +
                "} " + super.toString();
    }


    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }
}
