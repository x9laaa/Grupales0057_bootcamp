package alfaomega.grupal11;

public class Ejemplo2 { 	// El nombre de la clase debe comenzar con mayuscula y seguir la notación CamelCase por cada palabra extra y no debe contener Simbolos
    public static void main(String[] args) {
        final boolean valorconstante = false;
        String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec facilisis est ac ante viverra, vel efficitur leo consequat. Maecenas quis lorem sit amet diam consequat lacinia non nec lacus. Phasellus gestas quam non dui dictum, sed fermentum dolor efficitur. Aliquam volutpat ex sodales pulvinar scelerisque. Donec sodales cursus tortor eu aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse pretium, quam non consectetur scelerisque, diam tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at consequat enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec sit amet ultricies dui. Donec aliquet rhoncus velit et ollicitudin.";
        int ola; 	// la variable debe comenzar con minúscula y debe seguir la nomenclatura CamelCase para las siguientes palabras
        ola = 10; // la variable debe comenzar con minúscula y debe seguir la nomenclatura CamelCase para las siguientes palabras
        for (int i=0;
             i<ola;i++) {

            System.out.println("Valor: " + (i*i));
        }
/*Esto es un comentario
demasiado grande
para que esté en una
sola línea*/
        System.out.println( "El mensaje " + " es" + mensaje);
        System.out.println(" El valor de la constante es: " +
                valorconstante);
    }
}
