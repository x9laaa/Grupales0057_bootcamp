Algoritmo Modulo4_grupal_2
	definir nombres,apellidos,telefono,afp,direccion,comuna como cadena;
	definir sistemaSalud,edad,rut Como Entero

	escribir "Ingrese RUT";


	Repetir
		leer rut;
		si rut>99999998 Entonces
			escribir "Rut debe ser menor a 99.999.999"
		FinSi
	Hasta Que rut<99999999

	escribir "Ingrese nombres";
	Repetir
		leer nombres;
		si Longitud(nombres)<1 Entonces
			escribir "Debe ingresar nombre";
		FinSi
	Hasta Que Longitud(nombres)>0

	escribir "Ingrese apellidos";
	Repetir
		leer apellidos;
		si Longitud(apellidos)<1 Entonces
			escribir "Debe ingresar apellidos";
		FinSi
	Hasta Que Longitud(apellidos)>0


	escribir "Ingrese teléfono";
	Repetir
		leer telefono;
		si Longitud(telefono)>15 Entonces
			escribir "Teléfono no debe tener más de 15 caracteres";
		FinSi
	Hasta Que Longitud(telefono)<16;

	escribir "Ingrese AFP";
	Repetir
		leer afp;
		si Longitud(afp)<1 Entonces
			escribir "Debe ingresar AFP";
		FinSi
	Hasta Que Longitud(afp)>0;

	escribir "Ingrese sistema de salud 1(Fonasa) 2(Isapre)";
	Repetir
		leer sistemaSalud;
		si sistemaSalud1 <> 1 Y sistemaSalud <> 2 Entonces
			escribir "Debe ingresar 1(Fonasa) o 2(Isapre)";

		FinSi
	Hasta Que sistemaSalud == 1 O sistemaSalud == 2;


	escribir "Ingrese dirección";
	Repetir
		leer direccion;
		si Longitud(direccion)>50 Entonces
			escribir "Dirección no debe tener más de 50 caracteres";
		FinSi
	Hasta Que Longitud(direccion)<51;

	escribir "Ingrese comuna";
	Repetir
		leer comuna;
		si Longitud(comuna)<1 Entonces
			escribir "Debe ingresar comuna";
		FinSi
	Hasta Que Longitud(comuna)>0;

	escribir "Ingrese edad";
	Repetir
		leer edad;
		si edad>119 Entonces
			escribir "Edad debe ser menor a 120 años";
		FinSi
	Hasta Que edad<120;

	Escribir "";
	Escribir "Informe";
	escribir "Rut: ",rut;
	escribir "Nombre completo:",nombres," ",apellidos;
	escribir "Teléfono: ",telefono;
	escribir "AFP: ",afp;
	escribir "Sistema de salud: ",sistemaSalud;
	escribir "Dirección: ",direccion;
	escribir "Comuna: ",comuna;
	escribir "Edad: ",edad;

FinAlgoritmo