package alfaomega.grupal4_4.model;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Usuarios> objetos;

    public Registro() {
        objetos = new ArrayList<>();
    }

    public void agregarUsuarios(Usuarios objeto) {
        objetos.add(objeto);
    }

    public void mostrarObjetos() {
        for (Usuarios objeto : objetos) {
            System.out.println(objeto.toString());
        }
    }
}
