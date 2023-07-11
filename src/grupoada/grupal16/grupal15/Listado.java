package grupoada.grupal16.grupal15;

import grupoada.grupal16.grupal15.Interfaces.IAsesoria;
import grupoada.grupal16.grupal15.Modelos.Administrativo;
import grupoada.grupal16.grupal15.Modelos.Profesional;
import grupoada.grupal16.grupal15.Modelos.Usuario;

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
}


