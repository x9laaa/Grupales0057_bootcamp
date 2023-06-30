

package alfaomega.grupal12.grupal8;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

            public class Registrousuario2 {
                public static void main(String... args) {
                    Scanner scanner = new Scanner(in);

                    // Solicitar datos básicos del usuario
                    out.println("Ingrese el nombre del usuario:");
                    String nombre = scanner.nextLine();

                    out.println("Ingrese la fecha de nacimiento del usuario:");
                    String fechaNacimiento = scanner.nextLine();

                    out.println("Ingrese el RUN del usuario:");
                    String run = scanner.nextLine();

                    // Solicitar el tipo de usuario
                    out.println("Ingrese el tipo de usuario (cliente / profesional / administrativo):");
                    String tipoUsuario = scanner.nextLine();

                    // Crear objeto de acuerdo al tipo de usuario ingresado
                    if (tipoUsuario.equalsIgnoreCase("cliente")) {
                        out.println("Ingrese la dirección del cliente:");
                        String direccion = scanner.nextLine();

                        out.println("Ingrese el teléfono del cliente:");
                        String telefono = scanner.nextLine();

                        out.println("Ingrese la cantidad de empleados del cliente:");
                        int cantidadEmpleados = scanner.nextInt();

                        Cliente2 cliente2;
                        cliente2 = new Cliente2(nombre, fechaNacimiento, run, direccion, telefono, cantidadEmpleados);

                        // Mostrar los datos del cliente registrado
                        out.println("\nCliente registrado:");
                        out.println("Nombre: " + cliente2.getNombre());
                        out.println("Fecha de nacimiento: " + cliente2.getFechaNacimiento());
                        out.println("RUN: " + cliente2.getRun());
                        out.println("Dirección: " + cliente2.getDireccion());
                        out.println("Teléfono: " + cliente2.getTelefono());
                        out.println("Cantidad de empleados: " + cliente2.getCantidadEmpleados());
                    } else if (tipoUsuario.equalsIgnoreCase("profesional")) {
                        out.println("Ingrese los años de experiencia del profesional:");
                        int aniosExperiencia = scanner.nextInt();

                        scanner.nextLine(); // Consumir el salto de línea

                        out.println("Ingrese el departamento del profesional:");
                        String departamento = scanner.nextLine();

                        Profesional2 profesional2 = new Profesional2(nombre, fechaNacimiento, run, aniosExperiencia, departamento);

                        // Mostrar los datos del profesional registrado
                        out.println("\nProfesional registrado:");
                        out.println("Nombre: " + profesional2.getNombre());
                        out.println("Fecha de nacimiento: " + profesional2.getFechaNacimiento());
                        out.println("RUN: " + profesional2.getRun());
                        out.println("Años de experiencia: " + profesional2.getAniosExperiencia());
                        out.println("Departamento: " + profesional2.getDepartamento());
                    } else if (tipoUsuario.equalsIgnoreCase("administrativo")) {
                        System.out.println("Ingrese la función del administrativo:");
                        String funcion = scanner.nextLine();

                        out.println("Ingrese el nombre del superior del administrativo:");
                        String nombreSuperior = scanner.nextLine();

                        Administrativo2 administrativo2 = new Administrativo2(nombre, fechaNacimiento, run, funcion, nombreSuperior);

                        // Mostrar los datos del administrativo registrado
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
