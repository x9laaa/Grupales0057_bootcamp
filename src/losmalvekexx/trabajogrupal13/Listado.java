package losmalvekexx.trabajogrupal13;

import losmalvekexx.trabajogrupal13.Interfaces.IUsuario;

import java.util.ArrayList;
import java.util.List;


/*
Cumple con el principio de Responsabilidad Única al tener la responsabilidad de administrar
 una lista de usuarios y permitir agregar y validar usuarios en la lista.

Utiliza la interfaz IAsesoria para definir la lista como una colección de objetos que
implementan dicha interfaz.

Implementa el método validarUsuario() para recorrer la lista y mostrar información específica
 de cada usuario mediante el método analizarUsuario().

 Se está utilizando la inyección de dependencias en la clase Listado a través del método agregarUsuario(),
  lo cual es un buen enfoque para cumplir con el principio de Inversión de Dependencias
 */

public class Listado {

    private List<IUsuario> listaUsuarios = new ArrayList<>();

    public Listado() {
    }

    public void agregarUsuario(IUsuario usuarioRecibido){
        listaUsuarios.add(usuarioRecibido);
    }

    public void validarUsuario(){
        for (IUsuario recorridoDeUsuarios:listaUsuarios
        ) {
            recorridoDeUsuarios.analizarUsuario();
        }
    }
}
