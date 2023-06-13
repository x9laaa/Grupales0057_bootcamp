package grupoada;

import java.util.Scanner;

public class Grupal3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int procedimiento, manual;

    System.out.println("Sigue los procedimientos: 1 Si, 2 NO");
    procedimiento = scanner.nextInt();
    System.out.println("Se ha leído el manual: 1 Si, 2 NO");
    manual = scanner.nextInt();

    if (procedimiento == 1 && manual == 1) {
        System.out.println("NO HA OCURRIDO UN ACCIDENTE");
    } else {
        if (manual == 1) {
            System.out.println("NO OCURRIRÁ UN ACCIDENTE");
        } else {
            if (procedimiento == 1) {
                System.out.println("NO OCURRIRÁ UN ACCIDENTE");
            } else {
                System.out.println("SI OCURRIRÁ UN ACCIDENTE");
            }
        }
    }
}
}




