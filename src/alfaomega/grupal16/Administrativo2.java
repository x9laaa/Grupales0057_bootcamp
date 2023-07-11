package alfaomega.grupal16;

/**
 * @author AlfaOmega
 * @version 1.0
 * Esta clase representa una persona de tipo Administrativo
 */
public class Administrativo2 {

        private String nombre;
        private String fechaNacimiento;
        private String run;
        private String funcion;
        private String nombreSuperior;

        // Constructor

    /**
     * Constructor para el Administrativo
     * @param nombre nombre del administrativo
     * @param fechaNacimiento fecha de nacimiento del administrativo
     * @param run run del administrativo
     * @param funcion rol del administrativo
     * @param nombreSuperior nombre del superior del administrativo
     */
        public Administrativo2(String nombre, String fechaNacimiento, String run, String funcion, String nombreSuperior) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.funcion = funcion;
            this.nombreSuperior = nombreSuperior;
        }

        //  atributos

    /**
     * Método para obtener el nombre del Administrativo
     * @return devuelve el String del nombre del Administrativo
     */
        public String getNombre() {
            return nombre;
        }

    /**
     * Método para establecer el nombre del Administrativo
     * @param nombre nombre que se asignará al Administrativo
     */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    /**
     * Método que retorna la fecha de nacimiento del Administrativo
     * @return el String de la fecha de nacimiento
     */
        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

    /**
     * Método para establecer la fecha de nacimiento del Administrativo
     * @param fechaNacimiento String con la fecha de nacimiento del Administrativo
     */
        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

    /**
     * Método para obtener el Run del Administrativo
     * @return devuelve el String con el Run del Administrativo
     */
        public String getRun() {
            return run;
        }

    /**
     * Método para establecer el Run del Administrativo
     * @param run String con el Run del Administrativo
     */
        public void setRun(String run) {
            this.run = run;
        }

    /**
     * Método para obtener la Función que cumple el Administrativo
     * @return devuelve un String con la función del Administrativo
     */
        public String getFuncion() {
            return funcion;
        }

    /**
     * Método que establece la función del Administrativo
     * @param funcion String con la función que cumple el Administrativo
     */
        public void setFuncion(String funcion) {
            this.funcion = funcion;
        }

    /**
     * Método para obtener el nombre del superior del Administrativo
     * @return devuelve un String con el nombre del superior
     */
        public String getNombreSuperior() {
            return nombreSuperior;
        }

    /**
     * Método para establecer el nombre del superior del Administrativo
     * @param nombreSuperior String con el nombre del superior
     */
        public void setNombreSuperior(String nombreSuperior) {
            this.nombreSuperior = nombreSuperior;
        }
    }
