package grupoada.grupal16y17;

import grupoada.grupal16y17.Interfaces.IAsesoria;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<IAsesoria> usuarios;

    public Listado() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(IAsesoria usuario) {
        usuarios.add(usuario);
    }

    public List<IAsesoria> getUsuarios() {
        return usuarios;
    }

    // En general esta clase cumple con los principios SOLID (más detalles en archivo de texto dentro del package).
}


