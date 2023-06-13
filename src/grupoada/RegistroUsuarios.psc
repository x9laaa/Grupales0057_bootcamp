Algoritmo RegistroUsuarios
	Definir cantidadUsuarios, i Como Entero
	Definir nombre, fechaNacimiento, run Como Cadena
	
	Escribir "Registro de Usuarios"
	Escribir "Ingrese la cantidad de usuarios a registrar: "
	Leer cantidadUsuarios
	
	Para i = 1 Hasta cantidadUsuarios Con Paso 1 Hacer
		Escribir "Usuario ", i
		Escribir "Ingrese el nombre: "
		Leer nombre
		Escribir "Ingrese la fecha de nacimiento: "
		Leer fechaNacimiento
		Escribir "Ingrese el RUN: "
		Leer run
		
		Escribir "Seleccione el tipo de perfil:"
		Escribir "1. Cliente"
		Escribir "2. Profesional"
		Escribir "3. Administrativo"
		Escribir "Ingrese su opción: "
		Leer opcionPerfil
		
		Segun opcionPerfil Hacer
			Caso 1:
				Definir direccion, telefono, cantEmpleados Como Cadena
				Escribir "Ingrese la dirección: "
				Leer direccion
				Escribir "Ingrese el teléfono: "
				Leer telefono
				Escribir "Ingrese la cantidad de empleados: "
				Leer cantEmpleados
				
				Escribir "Nombre: ", nombre
				Escribir "Fecha de nacimiento: ", fechaNacimiento
				Escribir "RUN: ", run
				Escribir "Dirección: ", direccion
				Escribir "Teléfono: ", telefono
				Escribir "Cantidad de empleados: ", cantEmpleados
				
			Caso 2:
				Definir aniosExperiencia, departamento Como Cadena
				Escribir "Ingrese los años de experiencia: "
				Leer aniosExperiencia
				Escribir "Ingrese el departamento: "
				Leer departamento
				
				Escribir "Nombre: ", nombre
				Escribir "Fecha de nacimiento: ", fechaNacimiento
				Escribir "RUN: ", run
				Escribir "Años de experiencia: ", aniosExperiencia
				Escribir "Departamento: ", departamento
				
			Caso 3:
				Definir nombreSuperior, funsionAdm Como Cadena
				Escribir "Ingrese la función: "
				Leer funcionAdm
				Escribir "Ingrese el nombre del superior: "
				Leer nombreSuperior
						
				Escribir "Nombre: ", nombre
				Escribir "Fecha de nacimiento: ", fechaNacimiento
				Escribir "RUN: ", run
				Escribir "Función: ", funcionAdm
				Escribir "Nombre del superior: ", nombreSuperior
		Fin Segun
	Fin Para
FinAlgoritmo
