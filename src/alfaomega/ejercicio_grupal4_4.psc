
	Algoritmo RegistroUsuarios
		Definir usuarios, contador como Entero
		Definir nombre, fechaNacimiento, run como Cadena
		
		Definir direccion, telefono, cantEmpleados como Cadena
		Definir añosExperiencia, departamento como Cadena
		Definir  funciones,nombreSuperior como Cadena
			
			Escribir "Ingrese la cantidad de usuarios a registrar:"
			Leer usuarios
			
			Para contador = 1 Hasta usuarios Hacer
				Escribir "Usuario ", contador
				Escribir "Ingrese el nombre:"
				Leer nombre
				
				Escribir "Ingrese la fecha de nacimiento:"
				Leer fechaNacimiento
				
				Escribir "Ingrese el RUN:"
				Leer run
				
				Escribir "Seleccione el tipo de perfil:"
				Escribir "1. Cliente"
				Escribir "2. Profesional"
				Escribir "3. Administrativo"
				Leer tipoPerfil
				
				Segun tipoPerfil Hacer
					Caso 1:
						Escribir "Ingrese la dirección:"
						Leer direccion
						
						Escribir "Ingrese el teléfono:"
						Leer telefono
						
						Escribir "Ingrese la cantidad de empleados:"
						Leer cantEmpleados
						
						Escribir "Perfil: Cliente"
						Escribir "Nombre:", nombre
						Escribir "Fecha de nacimiento:", fechaNacimiento
						Escribir "RUN:", run
						Escribir "Dirección:", direccion
						Escribir "Teléfono:", telefono
						Escribir "Cantidad de empleados:", cantEmpleados
						
					Caso 2:
						Escribir "Ingrese los años de experiencia:"
						Leer añosExperiencia
						
						Escribir "Ingrese el departamento:"
						Leer departamento
						
						Escribir "Perfil: Profesional"
						Escribir "Nombre:", nombre
						Escribir "Fecha de nacimiento:", fechaNacimiento
						Escribir "RUN:", run
						Escribir "Años de experiencia:", añosExperiencia
						Escribir "Departamento:", departamento
						
					Caso 3:
						Escribir "Ingrese la función:"
						Leer funciones
							
						Escribir "Ingrese el nombre del superior:"
						Leer nombreSuperior
							
						Escribir "Perfil: Administrativo"
						Escribir "Nombre:", nombre
						Escribir "Fecha de nacimiento:", fechaNacimiento
						Escribir "RUN:", run
						Escribir "Función:",  funciones
						Escribir "Nombre del superior:", nombreSuperior
								
							De Otro Modo:
								Escribir "Opción inválida"
								
				Fin Segun
						
						contador <- contador + 1
			Fin Para
	Fin Algoritmo


