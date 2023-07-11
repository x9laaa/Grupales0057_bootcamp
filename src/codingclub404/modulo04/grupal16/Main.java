package codingclub404.modulo04.grupal16;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Listado listado = new Listado();

        Profesional usuario1 = new Profesional("Alan", "Asada", LocalDate.parse("2020-01-08"));
        listado.addUsuario(usuario1);

        Usuario usuario2 = new Usuario("Boy");
        listado.addUsuario(usuario2);

        Administrativo usuario3 = new Administrativo("Cain", "Con-con", "0 años");
        listado.addUsuario(usuario3);

        Cliente usuario4 = new Cliente("Dan", 10233244, "Dan Pan", "222111222", "Calle 1, 1234", "Las Condes");
        listado.addUsuario(usuario4);

        Usuario usuario5 = new Usuario("Ethan");
        listado.addUsuario(usuario5);

        listado.analizarUsuarios();
    }
}
