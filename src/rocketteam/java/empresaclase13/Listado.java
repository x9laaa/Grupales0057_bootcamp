package rocketteam.java.empresaclase13;

import java.util.List;
import java.util.ArrayList;

public class Listado implements Asesoria {

    private List<Asesoria> listaUsuarios;

    public Listado() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Asesoria usuario) {
        listaUsuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (Asesoria usuario : listaUsuarios) {
            usuario.analizarUsuario();
        }
    }
    @Override
    public void analizarUsuario() {

    }
}