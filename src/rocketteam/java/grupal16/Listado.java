package rocketteam.java.grupal16;

import java.util.List;
import java.util.ArrayList;

public class Listado implements IAsesoria {

    private List<IAsesoria> listaUsuarios;

    public Listado() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(IAsesoria usuario) {
        listaUsuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (IAsesoria usuario : listaUsuarios) {
            usuario.analizarUsuario();
        }
    }
    @Override
    public void analizarUsuario() {

    }
}