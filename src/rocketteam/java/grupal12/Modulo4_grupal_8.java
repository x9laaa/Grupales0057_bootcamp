/**
 * Clase que permite el ingreso de datos de usuarios de una empresa, o cliente de la empresa, de acuerdo a su perfil y los muestra por pantalla.
 * @author: Rocket Team
 * @version: 1.0
 *
 */

package rocketteam.java.grupal12;

import rocketteam.java.grupal_8.Administrativo;
import rocketteam.java.grupal_8.Cliente;
import rocketteam.java.grupal_8.Profesional;

import java.util.ArrayList;
import java.util.Scanner;

public class Modulo4_grupal_8 {

    public static void main(String[] args) {

        String nombre,run,fechaNac,direccion,depto,funcion,nombreSup;
        /**
         * Variables
         * nombre: nombre del usuario a ingresar.
         * run: run del usuario a ingresar.
         * fechaNac: fecha de nacimiento del usuario a ingresar.
         * dirección: dirección del usuario tipo cliente a ingresar.
         * depto: departamento en el que se desempeña el usuario a ingresar.
         * nombreSup: nombre del superior del usuario a ingresar.
         */
        int fono,cantEmpleados,aniosXp;
        /**
         * fono: teléfono del usuario tipo cliente a ingresar.
         * cantEmpleados: cantidad de empleados del usuario tipo cliente.
         * aniosXp: años de experiencia del usuario tipo profesional.
         */
        int opcionUsuario;
        /**
         * opcionUsuario: opción que define que tipo de usuario se ingresará.
         */
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Profesional> profesionales = new ArrayList<>();
        ArrayList<Administrativo> admins = new ArrayList<>();
        /**
         * clientes: Lista de usuarios tipo cliente (clase Cliente)
         * profesionales: Lista de usuarios tipo profesional (clase Profesional)
         * admins: Lista de usuarios tipo administraticos (clase Administrativo)
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese run");
        run = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento");
        fechaNac = sc.nextLine();
        System.out.println("Seleccione el tipo de usuario (1)Cliente (2)Profesional (3)Administrativo");
        opcionUsuario = Integer.valueOf(sc.nextLine());

        switch(opcionUsuario){

            case 1:
                System.out.println("Ingrese dirección");
                direccion = sc.nextLine();
                System.out.println("Ingrese teléfono (solo números)");
                fono = Integer.valueOf(sc.nextLine());
                System.out.println("Ingrese cantidad de empleados (solo números)");
                cantEmpleados = Integer.valueOf(sc.nextLine());
                Cliente c = new Cliente(nombre,run,fechaNac,direccion,fono,cantEmpleados);
                clientes.add(c);
                //Impresión datos
                System.out.println("======== Datos usuario ingresado ========");
                System.out.println("");
                System.out.println("Tipo de usuario: Cliente");
                System.out.println("Nombre: "+clientes.get(0).getNombre());
                System.out.println("Run: "+clientes.get(0).getRun());
                System.out.println("Fecha de nacimiento: "+clientes.get(0).getFechaNac());
                System.out.println("Dirección: "+clientes.get(0).getDireccion());
                System.out.println("Teléfono: "+clientes.get(0).getTelefono());
                System.out.println("Cantidad de empleados: "+clientes.get(0).getCantEmpleados());
                break;
            case 2:
                System.out.println("Ingrese años de experiencia (solo números)");
                aniosXp = Integer.valueOf(sc.nextLine());
                System.out.println("Ingrese departamento");
                depto = sc.nextLine();
                Profesional p = new Profesional(nombre,run,fechaNac,aniosXp,depto);
                profesionales.add(p);
                //Impresión datos
                System.out.println("======== Datos usuario ingresado ========");
                System.out.println("");
                System.out.println("Tipo de usuario: Profesional");
                System.out.println("Nombre: "+profesionales.get(0).getNombre());
                System.out.println("Run: "+profesionales.get(0).getRun());
                System.out.println("Fecha de nacimiento: "+profesionales.get(0).getFechaNac());
                System.out.println("Años de experiecia: "+profesionales.get(0).getAniosXp());
                System.out.println("Departamento: "+profesionales.get(0).getDepto());
                break;
            case 3:
                System.out.println("Ingrese función");
                funcion = sc.nextLine();
                System.out.println("Ingrese nombre del superior");
                nombreSup = sc.nextLine();
                Administrativo a = new Administrativo(nombre,run,fechaNac,funcion,nombreSup);
                admins.add(a);
                //Impresión datos
                System.out.println("======== Datos usuario ingresado ========");
                System.out.println("");
                System.out.println("Tipo de usuario: Administrativo");
                System.out.println("Nombre: "+admins.get(0).getNombre());
                System.out.println("Run: "+admins.get(0).getRun());
                System.out.println("Fecha de nacimiento: "+admins.get(0).getFechaNac());
                System.out.println("Función: "+admins.get(0).getFuncion());
                System.out.println("Nombre del superior: "+admins.get(0).getNombreSup());
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }



        sc.close();

    }
}
