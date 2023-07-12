package rocketteam.java.grupal16;

import java.time.LocalDate;

public class Grupal16Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Empresas Juanito",LocalDate.of(2000,10,20),77123456,93322554,"Las perdices 123","Providencia");

        Profesional p1 = new Profesional("Javier Perez",LocalDate.of(1980,02,25),12456789,"Contador",LocalDate.of(2015,12,10));

        Administrativo a1 = new Administrativo("Carla Cáceres",LocalDate.of(1990,05,17),17987654,"Recursos Humanos","1 año experiencia en rrhh");

        c1.analizarUsuario();
        p1.analizarUsuario();
        a1.analizarUsuario();






    }
}
