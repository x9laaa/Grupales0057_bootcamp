package bytemaster.java.Grupal16;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Listado registro = new Listado();
        Usuario usuario1 = new Cliente("alex", LocalDate.of(1995,8,16),"18952130-8",
                "7943343-4","bytemaster","943494343","coltuauco","coltauco");
        Usuario usuario2 = new Administrativo("karina",LocalDate.of(1999,2,27),
                "1913213-3","educacion","muchos años de trabajo");
        Usuario usuario3 = new Profesional("osvaldo",LocalDate.of(1981,11,14),
                "17.131.313-6","Medico",LocalDate.of(2020,2,14));
        Usuario usuario4 = new Administrativo("leonardo",LocalDate.of(1999,11,25),
                "19.233.233-5","JR Mecanico", "sin experiencia");
        Usuario usuario5 = new Profesional("Francisco",LocalDate.of(1989,9,15),
                "18.123.123-6","topografo",LocalDate.of(2014,3,1));

        registro.agregarLista(usuario1);
        registro.agregarLista(usuario2);
        registro.agregarLista(usuario3);
        registro.agregarLista(usuario4);
        registro.agregarLista(usuario5);
        registro.verlistado();

    }
}