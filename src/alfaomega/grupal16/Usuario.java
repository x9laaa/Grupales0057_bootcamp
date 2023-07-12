package alfaomega.grupal16;

public abstract class Usuario implements IAsesoria {
    protected String nombreUsuario;

    public Usuario(){

    }

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
    }

}
