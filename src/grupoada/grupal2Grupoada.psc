//Pablo Aliaga
Algoritmo ValidarClientes
	
	Escribir "Ingrese la cantidad de cliente2s a validar: ";
	Leer cantidadClientes;
	
	Para i <- 1 hasta cantidadClientes hacer
		
		Escribir "Cliente ", i, ":";
		
		// Validar RUT
		Escribir "Ingrese el RUT (menor a 99.999.999): ";
		Leer rut;
		Mientras rut >= 99999999 hacer;
			Escribir "RUT inv�lido. Ingrese nuevamente: ";
			Leer rut;
		Fin Mientras;
		
		// Validar Nombres
		Escribir "Ingrese los nombres: ";
		Leer nombres;
		Mientras nombres = "" hacer;
			Escribir "Nombres inv�lidos. Ingrese nuevamente: ";
			Leer nombres;
		Fin Mientras;
		
		// Validar Apellidos
		Escribir "Ingrese los apellidos: ";
		Leer apellidos;
		Mientras apellidos = "" hacer;
			Escribir "Apellidos inv�lidos. Ingrese nuevamente: ";
			Leer apellidos;
		Fin Mientras;
		
		// Validar Tel�fono
		Escribir "Ingrese el n�mero de tel�fono (no m�s de 15 caracteres): ";
		Leer telefono;
		Mientras Longitud(telefono) > 15 hacer;
			Escribir "N�mero de tel�fono inv�lido. Ingrese nuevamente: ";
			Leer telefono;
		Fin Mientras;
		
		// Validar AFP
		Escribir "Ingrese la AFP: ";
		Leer afp;
		Mientras afp = "" hacer;
			Escribir "AFP inv�lida. Ingrese nuevamente: ";
			Leer afp;
		Fin Mientras;
		
		// Validar Sistema de Salud
		Escribir "Ingrese el sistema de salud (1 para Fonasa, 2 para Isapre): ";
		Leer sistemaSalud;
		Mientras sistemaSalud <> 1 Y sistemaSalud <> 2 hacer;
			Escribir "Sistema de salud inv�lido. Ingrese nuevamente: ";
			Leer sistemaSalud;
		Fin Mientras;
		
		// Validar Direcci�n
		Escribir "Ingrese la direcci�n (no m�s de 50 caracteres): ";
		Leer direccion;
		Mientras Longitud(direccion) > 50 hacer;
			Escribir "Direcci�n inv�lida. Ingrese nuevamente: ";
			Leer direccion;
		Fin Mientras;
		
		// Validar Comuna
		Escribir "Ingrese la comuna: ";
		Leer comuna;
		Mientras comuna = "" hacer;
			Escribir "Comuna inv�lida. Ingrese nuevamente: ";
			Leer comuna;
		Fin Mientras;
		
		// Validar Edad
		Escribir "Ingrese la edad (menor a 120 a�os): ";
		Leer edad;
		Mientras edad >= 120 hacer;
			Escribir "Edad inv�lida. Ingrese nuevamente: ";
			Leer edad;
		Fin Mientras;
		
		// Mostrar datos del cliente2
		Escribir "----------------------------------------";
		Escribir "Datos del Cliente ", i, ":";
		Escribir "RUT: ", rut;
		Escribir "Nombres: ", nombres;
		Escribir "Apellidos: ", apellidos;
		Escribir "Tel�fono: ", telefono;
		Escribir "AFP: ", afp;;
		Escribir "S";
	Fin Para;
Fin algoritmo