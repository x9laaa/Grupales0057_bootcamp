package rocketteam.java.grupal16;

import java.util.List;
import java.util.ArrayList;

/**Single Responsibility Principle, SRP
  *Aquí podemos ver como esta clase tiene solo un objetivo dentro del código, además, está encapsulada, Aplicar
  *Este principio hace que el código se vea más modulado y de fácil lectura para los programadores, ya que un estracto
  *de código no cumple diversas funciones haciendo  mucho más legible al momento de escalar cualquier proyecto.
 */

public class Listado {

   List<IAsesoria> listaUsuarios = new ArrayList<IAsesoria>();

   public void agregarUsuario(IAsesoria usuario){
       listaUsuarios.add(usuario);
   }
   public void mostrarUsuarios(){
       for (IAsesoria user: listaUsuarios) {
           user.analizarUsuario();
       }
   }

}