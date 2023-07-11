package grupoada.grupal16.grupal15;
import grupoada.grupal16.grupal15.Interfaces.IAsesoria;
import grupoada.grupal16.grupal15.Modelos.Administrativo;
import grupoada.grupal16.grupal15.Modelos.Profesional;
import grupoada.grupal16.grupal15.Modelos.Usuario;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de usuarios
        Usuario usuario1 = new Usuario("Juan", "1990-01-01", "12345678-9");
        Profesional profesional1 = new Profesional("Pedro", "Licenciado en Informática", "2020-05-01");
        Administrativo administrativo1 = new Administrativo("María", "Recursos Humanos", "2 años");

        // Agregar usuarios al listado
        Listado listado = new Listado();
        listado.agregarUsuario(usuario1);
        listado.agregarUsuario(profesional1);
        listado.agregarUsuario(administrativo1);

        // Mostrar información de los usuarios
        for (IAsesoria usuario : listado.getUsuarios()) {
            usuario.analizarUsuario();
            System.out.println(); // Imprimir una línea en blanco para separar la información de cada usuario
        }
    }
}


