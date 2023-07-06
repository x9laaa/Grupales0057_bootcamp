package losmalvekexx.trabajogrupal13;


public class Main {

public static void main(String[]args){

        // Crear instancia de la clase Cliente

        Cliente cliente = new Cliente("73123123-9", "Importadora Pita", "932343456", "Av Los Libertadores #4024 ", "Macul");
        System.out.println(cliente.toString());
    System.out.println("El cliente es: "+cliente.getRazonSocial());


    // Crear instancia de la clase Usuario
    Usuario usuario = new Usuario("Javiera Sanchez", "1996-12-30", "19361678-1");
    System.out.println(usuario.toString());

    // Crear instancia de la clase Capacitacion
    Capacitacion capacitacion = new Capacitacion(1,"11.232323-2",  "6 de julio del 2023", "13:00", "Santiago Chile", "45 horas", 23);
    System.out.println(capacitacion.toString());
        }
}