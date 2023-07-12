package alfaomega.grupal16;

public class Main {
    public static void main(String[] args) {
        Listado listado = new Listado();

        Cliente cliente = new Cliente("cliente1", "123456789", "Mi Empresa S.A.", "1234567890", "Calle Principal 123", "Santiago");
        Profesional profesional = new Profesional("profesional1", "Licenciado en Prevención de Riesgos", "01/01/2020");
        Administrativo administrativo = new Administrativo("administrativo1", "Recursos Humanos", "3 años de experiencia");
        Profesional otroProfesional = new Profesional("profesional2", "Ingeniero en Prevención de Riesgos", "01/07/2018");
        Administrativo otroAdministrativo = new Administrativo("administrativo2", "Finanzas", "5 años de experiencia");

        listado.agregarUsuario(cliente);
        listado.agregarUsuario(profesional);
        listado.agregarUsuario(administrativo);
        listado.agregarUsuario(otroProfesional);
        listado.agregarUsuario(otroAdministrativo);

        listado.llamarAnalizarUsuario();
    }
}
