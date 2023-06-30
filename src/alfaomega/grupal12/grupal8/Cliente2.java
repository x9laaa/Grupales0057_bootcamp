package alfaomega.grupal12.grupal8;

public class Cliente2 {
        private String nombre;
        private String fechaNacimiento;
        private String run;
        private String direccion;
        private String telefono;
        private int cantidadEmpleados;

        // Constructor
        public Cliente2(String nombre, String fechaNacimiento, String run, String direccion, String telefono, int cantidadEmpleados) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.direccion = direccion;
            this.telefono = telefono;
            this.cantidadEmpleados = cantidadEmpleados;
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

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getCantidadEmpleados() {
            return cantidadEmpleados;
        }

        public void setCantidadEmpleados(int cantidadEmpleados) {
            this.cantidadEmpleados = cantidadEmpleados;
        }
    }


