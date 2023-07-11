package losmalvekexx.trabajogrupal13;

import losmalvekexx.trabajogrupal13.Interfaces.IAsesoria;

import java.util.ArrayList;
import java.util.List;

public class Listado {

    private List<IAsesoria> listaUsuarios = new ArrayList<>();

    public Listado() {
    }

    public void agregarUsuario(IAsesoria usuarioRecibido){
        listaUsuarios.add(usuarioRecibido);
    }

    public void validarUsuario(){
        for (IAsesoria recorridoDeUsuarios:listaUsuarios
        ) {
            recorridoDeUsuarios.analizarUsuario();
        }
    }
}
