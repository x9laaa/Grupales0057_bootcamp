package rocketteam.java.grupal16;

import java.time.LocalDate;

public class Administrativo extends Usuario {

    private String area;
    private String experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String nombre, LocalDate fechaNac, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNac, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
      Liskov Substitution Principle, LSP
      En términos más simples, si una clase A es una clase base y una clase B hereda de A,
      entonces B debe ser utilizable en cualquier lugar donde se espere una instancia de A,
      sin causar efectos adversos en el programa.
      aquí podemos ver como este método hereda este del padre pero a la vez complemente con información nueva
      sin causar problemas en el padre ni en los otros heredados.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: "+getArea() +", Experiencia previa: "+ getExperienciaPrevia());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}
