package codingclub404.modulo04.grupal13;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Se instancian clases

        Cliente cliente1 = new Cliente("77223445-1", "Consultora Java Studios", "Alameda 123", "Santiago", 988887777);
        Usuario usuario1 = new Usuario();
        Capacitacion capacitacion1 = new Capacitacion();

        usuario1.setNombre("armando33");
        usuario1.setRut("12345678-9");
        usuario1.setFechaNacimiento(LocalDate.of(1989, 6, 12));

        capacitacion1.setId(1);
        capacitacion1.setRutCliente("12345678-9");
        capacitacion1.setDia("Lunes");
        capacitacion1.setHora("19:00");
        capacitacion1.setLugar("JJVV Barrio Brasil");
        capacitacion1.setDuracion("2 horas");
        capacitacion1.setCantAsistentes(15);

        cliente1.toString();
        usuario1.toString();
        capacitacion1.toString();

    }
}
