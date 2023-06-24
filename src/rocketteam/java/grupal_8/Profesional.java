package rocketteam.java.grupal_8;

public class Profesional extends Usuario{

    private int aniosXp;
    private String depto;

    public Profesional(String nombre, String run, String fechaNac, int aniosXp, String depto) {
        super(nombre, run, fechaNac);
        this.aniosXp = aniosXp;
        this.depto = depto;
    }

    public int getAniosXp() {
        return aniosXp;
    }

    public void setAniosXp(int aniosXp) {
        this.aniosXp = aniosXp;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
}
