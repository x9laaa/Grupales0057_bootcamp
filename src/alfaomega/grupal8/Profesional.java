package alfaomega.grupal8;

public class Profesional {
        private String nombre;
        private String fechaNacimiento;
        private String run;
        private int aniosExperiencia;
        private String departamento;

        // Constructor
        public Profesional(String nombre, String fechaNacimiento, String run, int aniosExperiencia, String departamento) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.aniosExperiencia = aniosExperiencia;
            this.departamento = departamento;
        }

        // atributos
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

        public int getAniosExperiencia() {
            return aniosExperiencia;
        }

        public void setAniosExperiencia(int aniosExperiencia) {
            this.aniosExperiencia = aniosExperiencia;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }
    }
