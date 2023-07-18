package codingclub404.modulo04.grupal16;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo(String nombre, String area, String experienciaPrevia) {
        super(nombre);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(area);
        System.out.println(experienciaPrevia);
    }
}
