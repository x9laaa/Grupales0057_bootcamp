package codingclub404.modulo04.grupal16;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    List<Asesoria> usuarios;

    public Listado() {
        this.usuarios = new ArrayList<Asesoria>();
    }

    public void addUsuario(Asesoria usuario) {
        usuarios.add(usuario);
    }

    public void analizarUsuarios() {
        for (Asesoria usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }
}
