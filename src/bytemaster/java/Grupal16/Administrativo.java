package bytemaster.java.Grupal16;

import java.time.LocalDate;

public class Administrativo extends Usuario{
    private String area;
    private String expPrev;

    public Administrativo() {
    }

    public Administrativo(String nombre, LocalDate fechaNacimiento, String run, String area, String expPrev) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.expPrev = expPrev;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExpPrev() {
        return expPrev;
    }

    public void setExpPrev(String expPrev) {
        this.expPrev = expPrev;
    }

    @Override
    public String toString() {
        return "\n Administrativo{" +
                "area='" + area + '\'' +
                ", expPrev='" + expPrev + '\'' +
                "} " + super.toString();
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("El area es: "+getArea()+"y su expreciencia previa es; "+getExpPrev());

    }
}
