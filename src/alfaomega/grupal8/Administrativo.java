package alfaomega.grupal8;

public class Administrativo {

        private String nombre;
        private String fechaNacimiento;
        private String run;
        private String funcion;
        private String nombreSuperior;

        // Constructor
        public Administrativo(String nombre, String fechaNacimiento, String run, String funcion, String nombreSuperior) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.funcion = funcion;
            this.nombreSuperior = nombreSuperior;
        }

        //  atributos
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

        public String getFuncion() {
            return funcion;
        }

        public void setFuncion(String funcion) {
            this.funcion = funcion;
        }

        public String getNombreSuperior() {
            return nombreSuperior;
        }

        public void setNombreSuperior(String nombreSuperior) {
            this.nombreSuperior = nombreSuperior;
        }
    }
