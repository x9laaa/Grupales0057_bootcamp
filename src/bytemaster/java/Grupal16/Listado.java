package bytemaster.java.Grupal16;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<IAsesoria> lista = new ArrayList<IAsesoria>();

    public Listado() {
    }

    public void agregarLista(IAsesoria listado){
        lista.add(listado);
    }

    public void verlistado(){
        for (IAsesoria x:lista){
            x.analizarUsuario();
        }
    }

}
