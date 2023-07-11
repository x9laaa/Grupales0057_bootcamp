

package alfaomega.grupal16;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;


public class Registrousuario2 {
                public static void main(String... args) {
                    /** La clase Scanner sirve para leer datos
                     * @param in muestra desde donde se leerán los datos.
                     * @return una instancia de la clase Scanner para leer datos
                     */
                    Scanner scanner = new Scanner(in);

                    /** Método para solicitar datos básicos del usuario como nombre, fecha de nacimiento y run
                     * y lee la entrada del usuario
                     * @param String representa cadenas de caracteres
                     * @param out corresponde a la salida de la pantalla
                     * @param println permite invocar la cadena de texto
                     * @param nextLine devuelve el resto de la línea actual, excluyendo cualquier separador de línea al final.
                     * @return el nombre ingresado por el usuario, fecha y run
                     */

                    out.println("Ingrese el nombre del usuario:");
                    String nombre = scanner.nextLine();

                    out.println("Ingrese la fecha de nacimiento del usuario:");
                    String fechaNacimiento = scanner.nextLine();

                    out.println("Ingrese el RUN del usuario:");
                    String run = scanner.nextLine();

                    /** Método para solicitar el tipo de usuario y lee la entrada
                     * @param String representa cadenas de caracteres
                     * @param out  corresponde a la salida de la pantalla u otro destino de salida especificado por el usuario
                     * @param println permite invocar la cadena de texto
                     * @param nextLine devuelve el resto de la línea actual, excluyendo cualquier separador de línea al final.
                     * @return el tipo de usuario : cliente, profesional, administrativo
                     */
                    out.println("Ingrese el tipo de usuario (cliente / profesional / administrativo):");
                    String tipoUsuario = scanner.nextLine();

                    /**
                     * Verifica si el tipo de usuario es "cliente" e ingresa la dirección del cliente
                     * @param tipoUsuario el tipo de usuario a comparar con "cliente"
                     * @param nombre el nombre del cliente
                     * 0@param fechaNacimiento la fecha de nacimiento del cliente
                     * @param run el RUN del cliente
                     *@param direccion la dirección del cliente
                     * @param telefono el teléfono del cliente
                     *@param cantidadEmpleados la cantidad de empleados del cliente
                     * @return una instancia de la clase Cliente
                     */

                    if (tipoUsuario.equalsIgnoreCase("cliente")) {
                        out.println("Ingrese la dirección del cliente:");
                        String direccion = scanner.nextLine();

                        out.println("Ingrese el teléfono del cliente:");
                        String telefono = scanner.nextLine();

                        out.println("Ingrese la cantidad de empleados del cliente:");
                        int cantidadEmpleados = scanner.nextInt();

                        Cliente2 cliente2;
                        cliente2 = new Cliente2(nombre, fechaNacimiento, run, direccion, telefono, cantidadEmpleados);

                        out.println("\nCliente registrado:");
                        out.println("Nombre: " + cliente2.getNombre());
                        out.println("Fecha de nacimiento: " + cliente2.getFechaNacimiento());
                        out.println("RUN: " + cliente2.getRun());
                        out.println("Dirección: " + cliente2.getDireccion());
                        out.println("Teléfono: " + cliente2.getTelefono());
                        out.println("Cantidad de empleados: " + cliente2.getCantidadEmpleados());

                        /** Verifica si el tipo de usuario es "profesional" y solicita ingresar los años de experiencia.
                         * @param tipoUsuario el tipo de usuario a comparar con "profesional"
                         * @param equalsIgnoreCasa Compara este String con otro String, ignorando las consideraciones de mayúsculas y minúsculas.
                         * @param out corresponde a la salida de la pantalla u otro destino de salida especificado por el usuario
                         * @param println permite invocar la cadena de texto
                         * @return los años de experiencia del profesional
                         */

                    } else if (tipoUsuario.equalsIgnoreCase("profesional")) {
                        out.println("Ingrese los años de experiencia del profesional:");
                        int aniosExperiencia = scanner.nextInt();

                        scanner.nextLine(); // Consumir el salto de línea

                        /** Imprime el mensaje para ingresar el departamento del profesional.
                         * @param tipoUsuario el tipo de usuario a comparar con "profesional"
                         * @param out.println  Lee el departamento ingresado por el usuario.
                         * @return el departamento del profesional
                         *  @param nombre el nombre del profesional
                         *  @param fechaNacimiento la fecha de nacimiento del profesional
                         *  @param run el RUN del profesional
                         *  @param aniosExperiencia los años de experiencia del profesional
                         *  @param departamento el departamento del profesional
                         *  @return una instancia de la clase Profesional
                         */

                        out.println("Ingrese el departamento del profesional:");
                        String departamento = scanner.nextLine();

                        Profesional2 profesional2 = new Profesional2(nombre, fechaNacimiento, run, aniosExperiencia, departamento);

                        out.println("\nProfesional registrado:");
                        out.println("Nombre: " + profesional2.getNombre());
                        out.println("Fecha de nacimiento: " + profesional2.getFechaNacimiento());
                        out.println("RUN: " + profesional2.getRun());
                        out.println("Años de experiencia: " + profesional2.getAniosExperiencia());
                        out.println("Departamento: " + profesional2.getDepartamento());

                        /**Verifica si el tipo de usuario es "administrativo" y realiza acciones específicas.
                         * @param tipoUsuario el tipo de usuario a verificar
                         * @param println Imprime el mensaje para ingresar la función del administrativo.
                         * @return la función del administrativo
                         * @param nombre el nombre del administrativo
                         * @param fechaNacimiento la fecha de nacimiento del administrativo
                         * @param run el RUN del administrativo
                         * @param funcion la función del administrativo
                         * @param nombreSuperior el nombre del superior del administrativo
                         * @return una instancia de la clase Administrativo
                         */
                    } else if (tipoUsuario.equalsIgnoreCase("administrativo")) {
                        System.out.println("Ingrese la función del administrativo:");
                        String funcion = scanner.nextLine();

                        out.println("Ingrese el nombre del superior del administrativo:");
                        String nombreSuperior = scanner.nextLine();

                        Administrativo2 administrativo2 = new Administrativo2(nombre, fechaNacimiento, run, funcion, nombreSuperior);


                        out.println("\nAdministrativo registrado:");
                        out.println("Nombre: " + administrativo2.getNombre());
                        out.println("Fecha de nacimiento: " + administrativo2.getFechaNacimiento());
                        out.println("RUN: " + administrativo2.getRun());
                        out.println("Función: " + administrativo2.getFuncion());
                        out.println("Nombre superior: " + administrativo2.getNombreSuperior());
                    } else {
                        out.println("Tipo de usuario inválido. El registro ha sido cancelado.");
                    }

                    scanner.close();
                }
            }
