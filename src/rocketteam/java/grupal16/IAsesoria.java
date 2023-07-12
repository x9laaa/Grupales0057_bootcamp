package rocketteam.java.grupal16;

public interface IAsesoria {

    /** Interface segregation principle (ISP)
     *Dado que IAsesoria tiene un único método llamado "analizarUsuario",
     * ya este proporciona un método en la interfaz, no pareciera haber
     * violaciones directas del principio de segregación de interfaces
     *
     */
    void analizarUsuario();
}
