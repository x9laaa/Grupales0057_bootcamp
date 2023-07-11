package codingclub404.modulo04.grupal16;

public class Usuario implements Asesoria {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void analizarUsuario() {
        System.out.println(nombre);
    }
}
