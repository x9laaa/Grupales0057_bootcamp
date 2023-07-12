package rocketteam.java.grupal16;

import java.time.LocalDate;

public class Grupal16Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Empresas Juanito",LocalDate.of(2000,10,20),77123456,93322554,"Las perdices 123","Providencia");
        Cliente c2 = new Cliente("Capsule Corp",LocalDate.of(1989,10,20),66123951,93325644,"Pajaritos 456","Maipú");

        Profesional p1 = new Profesional("Javier Perez",LocalDate.of(1980,02,25),12456789,"Contador",LocalDate.of(2015,12,10));
        Profesional p2 = new Profesional("Pablo Ramirez",LocalDate.of(2020,07,25),10654782,"Prevencionista de riesgos",LocalDate.of(1975,06,15));

        Administrativo a1 = new Administrativo("Carla Cáceres",LocalDate.of(1990,05,17),17987654,"Recursos Humanos","1 año experiencia en rrhh");



        Listado listado = new Listado();
        listado.agregarUsuario(c1);
        listado.agregarUsuario(c2);
        listado.agregarUsuario(p1);
        listado.agregarUsuario(p2);
        listado.agregarUsuario(a1);

        System.out.println();
        System.out.println("=================== Listado de usuarios =====================");
        listado.mostrarUsuarios();




    }
}
