package codingclub404.ejgrupal12;

public class Grupal11 {

    public static void main(String[] args) {

        final boolean valorConstante = false;
        String mensaje = "Lorem ipsum dolor sit amet, \n" +
                "consectetur adipiscing elit. Donec facilisis est ac ante viverra,\n" +
                "vel efficitur leo consequat. Maecenas quis lorem sit amet diam\n" +
                "consequat lacinia non nec lacus. Phasellus egestas quam non dui\n" +
                "dictum, sed fermentum dolor efficitur. Aliquam volutpat ex\n" +
                "sodales pulvinar scelerisque. Donec sodales cursus tortor eu\n" +
                "aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in\n" +
                "faucibus orci luctus et ultrices posuere cubilia curae;\n" +
                "Suspendisse pretium, quam non consectetur scelerisque, diam\n" +
                "tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at\n" +
                "consequat enim. Orci varius natoque penatibus et magnis dis\n" +
                "parturient montes, nascetur ridiculus mus. Donec sit amet\n" +
                "ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

        int ola = 10;

        for (int i=0; i<ola;i++) {
            System.out.println("Valor: " + (i*i));
        }

        System.out.println("El mensaje es: " + mensaje);
        System.out.println("El valor de la constante es: " + valorConstante);
    }
}
