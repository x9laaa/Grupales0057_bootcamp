package alfaomega.grupal12.grupal8;

/**
 * Esta clase define objetos del profesional
 * @author: AlfaOmega
 * @version: 1.0
 */
public class Profesional2 {
        //Campos de la clase
        private String nombre;
        private String fechaNacimiento;
        private String run;
        private int aniosExperiencia;
        private String departamento;

    /**
     * Constructor para los atributos del profesional
     * @param nombre El parámetro "nombre" define el nombre del profesional
     * @param fechaNacimiento El parámetro "fechaNacimiento" define la fecha de nacimiento del profesional
     * @param run El parámetro "run" define el número de identificación nacional del profesional
     * @param aniosExperiencia El parámetro "aniosExperiencia" define los años de experiencia del profesional
     * @param departamento El parámetro "departamento" define el departamento al que pertenece el profesional
     */
        public Profesional2(String nombre, String fechaNacimiento, String run, int aniosExperiencia, String departamento) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.aniosExperiencia = aniosExperiencia;
            this.departamento = departamento;
        } //Cierre del constructor

    /**
     *Método que devuelve el nombre del profesional
     * @return Nombre del profesional
     */
        public String getNombre() {
            return nombre;
        }

    /**
     *Método que establece el nombre del profesional
     * @param nombre Este parámetro define el nombre del profesional
     */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    /**
     *Método que devuelve la fecha de nacimiento del profesional
     * @return Fecha de nacimiento del profesional
     */
        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

    /**
     *Método que establece el nombre del profesional
     * @param fechaNacimiento Este parámetro define la fecha de nacimiento del profesional
     */
        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

    /**
     *Método que devuelve  el número de run del profesional
     * @return Número de run del profesional
     */
        public String getRun() {
            return run;
        }

    /**
     *Método que establece el número de run del profesional
     * @param run Este parámetro define el número de run del profesional
     */
        public void setRun(String run) {
            this.run = run;
        }

    /**
     *Método que devuelve la fecha de nacimiento del profesional
     * @return Años de experiencia del profesional
     */
        public int getAniosExperiencia() {
            return aniosExperiencia;
        }

    /**
     *Método que establece los años de experiencia del profesional
     * @param aniosExperiencia Este parámetro define los años de experiencia del profesional
     */
        public void setAniosExperiencia(int aniosExperiencia) {
            this.aniosExperiencia = aniosExperiencia;
        }

    /**
     *Método que devuelve la fecha de nacimiento del profesional
     * @return Departamento al cual pertenece el profesional
     */
        public String getDepartamento() {
            return departamento;
        }

    /**
     *Método que establece el departamento del profesional
     * @param departamento Este parámetro define el departamento al cual pertenece el profesional
     */
        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }
    }
