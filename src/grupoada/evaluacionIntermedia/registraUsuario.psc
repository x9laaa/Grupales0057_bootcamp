Algoritmo registraUsuario //Punto de partida programa
	Definir matrizUsuarios Como Caracter
	Dimension matrizUsuarios[100,10];
	Definir i Como Entero;
	i = 0;
	Para i<-1 Hasta 100 Con Paso paso Hacer
		matrizUsuarios[i,1] = v;
	Fin Para
	// Columna 1: v/o 	
	// Columna 2: id_usuario
	// Columna 3: Nombre
	// Columna 4: Fecha Naciemiento 
	// Columna 5: Run 
	// Columna 6: Perfil
	// Columna 7: Direccion/años de experiencia/funcion
 	// Columna 8: telefono/ departamento /Nombre Supervisor
	// Columna 9: Cantidad de empleados
	// Columna 10: m/sm
	
    Definir OP, cont Como Entero;
    Repetir
        // mostrar menu
        Limpiar Pantalla;
        Escribir "Menú Principal";
        Escribir "   1. Registrar usuario";
        Escribir "   2. Mostrar usuario";
        Escribir "   3. Contar usuarios por categoría";
        Escribir "   4. Modificar Usuarios";
        Escribir "   5. Eliminar";
		Escribir "   6. salir";
        // ingresar una opcion
        Escribir "Elija una opción (1-6): ";
        Leer OP;
        // procesar esa opción
        Segun OP Hacer
            1:
                Escribir "Registrar usuario";
            2:
                Escribir "Mostrar usuario";
            3:
                Escribir "Contar usuarios por categoría";
            4:
                Escribir "Modificar Usuarios";
            5:
                Escribir "Eliminar";
			6:
				Escribir "Gracias, vuelva pronto";
            De otro modo:
                Escribir "Opción no válida";
        FinSegun
        Escribir "Presione enter para continuar";
        Esperar Tecla;
	Hasta Que OP = 6;	
FinAlgoritmo
