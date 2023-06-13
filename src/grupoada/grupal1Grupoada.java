import java.util.Scanner;

public class grupal1Grupoada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombres, apellidos, cargo;
        int tipoAccidente, tiempoDenuncia1;

        System.out.println("Nombres del Trabajador");
        nombres = scanner.nextLine();

        System.out.println("Apellidos del Trabajador");
        apellidos = scanner.nextLine();

        System.out.println("Cargo del trabajador");
        cargo = scanner.nextLine();

        System.out.println("¿Donde ha ocurrido el accidente del trabajo? Responde con: 1 si ocurrió trabajo o cualquier otro numero si ocurrió en el trayecto");
        tipoAccidente = scanner.nextInt();

        System.out.println("¿Cuanto tiempo paso del accidente? Responde con: 1 para menos de 24 horas, o cualquier otro numero para más de 24 horas.");
        tiempoDenuncia1 = scanner.nextInt();

        System.out.println("*********** I N S T R U C C I O N  E S    A    S E G U I R ***********");

        if (tipoAccidente == 1) {
            System.out.println("Avisar a su jefe o supervisor directo. El empleador prestara auxilios y dara aviso al IST");
            if (tiempoDenuncia1 == 1) {
                System.out.println("El empleador dará aviso al IST, a través del formulario de Denuncia Individual de Accidente de Trabaj (DIAT), Guardar copia de la DIAT recepcionada y entregar una copia al trabajador");
            } else {
                System.out.println("La denuncia debe ser presentada inmediatamente por el trabajador o por sus familiares o por el Comité Paritario de Higiene y Seguridad (CPHS) de la empresa o el médico que lo atendió o cualquier persona que haya tenido conocimiento de los hechos. En este caso o si las circunstancias en que ocurro el accidente impiden que tome conocimiento del mismo, el trabajador debe concurrir por sus propios medios, debiendo ser atendido de inmediato");
            }
        } else {
            System.out.println("Acudir al centro de atención del IST (en el caso de no requerir ambulancia), donde debe explicar que se trata de un accidente de trayecto e informar al empleador/a apenas sea posible");
            if (tiempoDenuncia1 == 1) {
                System.out.println("El empleador dará aviso al IST, a través del formulario de Denuncia Individual de Accidente de Trabaj (DIAT), Guardar copia de la DIAT recepcionada y entregar una copia al trabajador");
            } else {
                System.out.println("Si el empleador no presenta la DIAT o las circunstancias en que ocurrió el accidente impiden que tome conocimiento de este, el trabajador debe concurrir por sus propios medios, debiendo ser atendido de inmediato");
            }
        }
    }
}