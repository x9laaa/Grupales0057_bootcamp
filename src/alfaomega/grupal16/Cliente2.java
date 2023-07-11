package alfaomega.grupal16;

/**
 *
 *  Clase que representa a un cliente
 *
 * @author AlfaOmega
 * @version 1.0
 */
public class Cliente2 {
        private String nombre;
        private String fechaNacimiento;
        private String run;
        private String direccion;
        private String telefono;
        private int cantidadEmpleados;

    /**
     *
     * @param nombre el nombre del cliente
     * @param fechaNacimiento la fecha de nacimiento del cliente
     * @param run el RUN del cliente
     * @param direccion La direccion del cliente
     * @param telefono el telefono del cliente
     * @param cantidadEmpleados La cantidad de empleados del Cliente
     */
        // Constructor
        public Cliente2(String nombre, String fechaNacimiento, String run, String direccion, String telefono, int cantidadEmpleados) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.direccion = direccion;
            this.telefono = telefono;
            this.cantidadEmpleados = cantidadEmpleados;
        }
    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
        //  atributos
        public String getNombre() {
            return nombre;
        }
    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    /**
     * Obtiene la fecha de nacimiento del cliente.
     *
     * @return La fecha de nacimiento del cliente.
     */
        public String getFechaNacimiento() {
            return fechaNacimiento;
        }
    /**
     * Establece la fecha de nacimiento del cliente.
     *
     * @param fechaNacimiento La fecha de nacimiento del cliente.
     */
        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
    /**
     * Obtiene el RUN del cliente.
     *
     * @return El RUN del cliente.
     */
        public String getRun() {
            return run;
        }
    /**
     * Establece el RUN del cliente.
     *
     * @param run El RUN del cliente.
     */
        public void setRun(String run) {
            this.run = run;
        }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
        public String getDireccion() {
            return direccion;
        }
    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La dirección del cliente.
     */
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    /**
     * Obtiene el teléfono del cliente.
     *
     * @return El teléfono del cliente.
     */
        public String getTelefono() {
            return telefono;
        }
    /**
     * Establece el teléfono del cliente.
     *
     * @param telefono El teléfono del cliente.
     */
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    /**
     * Obtiene la cantidad de empleados del cliente.
     *
     * @return La cantidad de empleados del cliente.
     */
        public int getCantidadEmpleados() {
            return cantidadEmpleados;
        }
    /**
     * Establece la cantidad de empleados del cliente.
     *
     * @param cantidadEmpleados La cantidad de empleados del cliente.
     */
        public void setCantidadEmpleados(int cantidadEmpleados) {
            this.cantidadEmpleados = cantidadEmpleados;
        }
    }


