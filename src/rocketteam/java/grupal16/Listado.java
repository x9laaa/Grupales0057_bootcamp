package rocketteam.java.grupal16;

import java.util.List;
import java.util.ArrayList;

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