package losmalvekexx.trabajogrupal13;

import losmalvekexx.trabajogrupal13.Interfaces.IAsesoria;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario implements IAsesoria {
    private String nombre;
    private String fechaNacimiento; //1996-12-30
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }

    public String mostrarEdad(String nacimiento){
        Date nuevodate = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaTexto = formato.format(nuevodate);

        String anio = fechaTexto.substring(0, 4);
        String mes = fechaTexto.substring(5,7);
        String dia = fechaTexto.substring(8,10);

        int anioHoy = Integer.parseInt(anio);
        int mesHoy = Integer.parseInt(mes);
        int diaHoy = Integer.parseInt(dia);

        String anio_usuario = nacimiento.substring(0, 4);
        String mes_usuario = nacimiento.substring(5,7);
        String dia_usuario = nacimiento.substring(8,10);

        int anioCumple = Integer.parseInt(anio_usuario); // Año de cumpleaños
        int mesCumple = Integer.parseInt(mes_usuario);     // Mes de cumpleaños
        int diaCumple = Integer.parseInt(dia_usuario);    // Día de cumpleaños

        int edad;

        if (mesHoy > mesCumple || (mesHoy == mesCumple && diaHoy >= diaCumple)) {
            edad = anioHoy - anioCumple;            // Ya ha pasado el cumpleaños de este año
        } else {
            edad = anioHoy - anioCumple - 1;            // Aún no ha pasado el cumpleaños de este año
        }

    return "El usuario tiene: " + edad + " años";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del Usuario es: "+getNombre());
    }
}
