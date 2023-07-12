package alfaomega.grupal16;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<IAsesoria> usuarios;


    public Listado(List<IAsesoria> usuarios) {
        this.usuarios = usuarios;
    }

    public List<IAsesoria> getUsuarios() {
        return usuarios;
    }



    public void setUsuarios(List<IAsesoria> usuarios) {
        this.usuarios = usuarios;
    }

    public Listado() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(IAsesoria usuario) {
        usuarios.add(usuario);
    }
    @Override
    public String toString() {
        return "Listado{" +
                "usuarios=" + usuarios +
                '}';
    }
    public void llamarAnalizarUsuario() {
        for (IAsesoria usuario : usuarios) {
            usuario.analizarUsuario();
            System.out.println("--------");
        }
    }
}
