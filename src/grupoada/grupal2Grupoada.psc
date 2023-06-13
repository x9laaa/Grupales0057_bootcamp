//Pablo Aliaga
Algoritmo ValidarClientes
	
	Escribir "Ingrese la cantidad de clientes a validar: ";
	Leer cantidadClientes;
	
	Para i <- 1 hasta cantidadClientes hacer
		
		Escribir "Cliente ", i, ":";
		
		// Validar RUT
		Escribir "Ingrese el RUT (menor a 99.999.999): ";
		Leer rut;
		Mientras rut >= 99999999 hacer;
			Escribir "RUT inválido. Ingrese nuevamente: ";
			Leer rut;
		Fin Mientras;
		
		// Validar Nombres
		Escribir "Ingrese los nombres: ";
		Leer nombres;
		Mientras nombres = "" hacer;
			Escribir "Nombres inválidos. Ingrese nuevamente: ";
			Leer nombres;
		Fin Mientras;
		
		// Validar Apellidos
		Escribir "Ingrese los apellidos: ";
		Leer apellidos;
		Mientras apellidos = "" hacer;
			Escribir "Apellidos inválidos. Ingrese nuevamente: ";
			Leer apellidos;
		Fin Mientras;
		
		// Validar Teléfono
		Escribir "Ingrese el número de teléfono (no más de 15 caracteres): ";
		Leer telefono;
		Mientras Longitud(telefono) > 15 hacer;
			Escribir "Número de teléfono inválido. Ingrese nuevamente: ";
			Leer telefono;
		Fin Mientras;
		
		// Validar AFP
		Escribir "Ingrese la AFP: ";
		Leer afp;
		Mientras afp = "" hacer;
			Escribir "AFP inválida. Ingrese nuevamente: ";
			Leer afp;
		Fin Mientras;
		
		// Validar Sistema de Salud
		Escribir "Ingrese el sistema de salud (1 para Fonasa, 2 para Isapre): ";
		Leer sistemaSalud;
		Mientras sistemaSalud <> 1 Y sistemaSalud <> 2 hacer;
			Escribir "Sistema de salud inválido. Ingrese nuevamente: ";
			Leer sistemaSalud;
		Fin Mientras;
		
		// Validar Dirección
		Escribir "Ingrese la dirección (no más de 50 caracteres): ";
		Leer direccion;
		Mientras Longitud(direccion) > 50 hacer;
			Escribir "Dirección inválida. Ingrese nuevamente: ";
			Leer direccion;
		Fin Mientras;
		
		// Validar Comuna
		Escribir "Ingrese la comuna: ";
		Leer comuna;
		Mientras comuna = "" hacer;
			Escribir "Comuna inválida. Ingrese nuevamente: ";
			Leer comuna;
		Fin Mientras;
		
		// Validar Edad
		Escribir "Ingrese la edad (menor a 120 años): ";
		Leer edad;
		Mientras edad >= 120 hacer;
			Escribir "Edad inválida. Ingrese nuevamente: ";
			Leer edad;
		Fin Mientras;
		
		// Mostrar datos del cliente
		Escribir "----------------------------------------";
		Escribir "Datos del Cliente ", i, ":";
		Escribir "RUT: ", rut;
		Escribir "Nombres: ", nombres;
		Escribir "Apellidos: ", apellidos;
		Escribir "Teléfono: ", telefono;
		Escribir "AFP: ", afp;;
		Escribir "S";
	Fin Para;
Fin algoritmo