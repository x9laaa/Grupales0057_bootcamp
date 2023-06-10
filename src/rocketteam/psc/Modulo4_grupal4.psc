Algoritmo Grupal_4

//	IMPORTANTE
//	Ir a Configurar>Opciones del lenguaje>Personalizar y activar Utilizar indices en arreglos y cadenas en base 0

	definir n, sumaUsuarios,pro,admin,tipoUsuario,cantEmpleados,aniosXp como entero;
	Definir nombre,fechaNac,run,direccion,telefono,depto,aFuncion,nombreSuperior,tipoUsuarioCadena como cadena;

	Escribir "Indique cantidad de usuarios a ingresar";
	leer n;

	dimension usuarios[n,11];
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Seleccione tipo de usuario 1-Cliente 2-Profesional 3-Administrativo (ingrese solo un número)";
		leer tipoUsuario;

		Si tipoUsuario == 1 Entonces
			tipoUsuarioCadena = "Cliente";
		SiNo si tipoUsuario == 2 Entonces
				tipoUsuarioCadena = "Profesional";
			sino si tipoUsuario == 3 Entonces
					tipoUsuarioCadena = "Administrativo";
				fin si
			fin si
		Fin Si

		Escribir "Ingrese nombre usuario";
		leer nombre;
		Escribir "Ingrese fecha nacimiento usuario";
		leer fechaNac;
		Escribir "Ingrese run usuario";
		leer run;

		Si tipoUsuario == 1 Entonces
			usuarios[i,0] = nombre;
			usuarios[i,1] = fechaNac;
			usuarios[i,2] = run;
			usuarios[i,3] = tipoUsuarioCadena;

			escribir "Ingrese dirección";
			leer direccion;
			usuarios[i,4] = direccion;
			escribir "Ingrese teléfono"
			leer telefono;
			usuarios[i,5] = telefono;
			escribir "Ingrese cantidad empleados";
			leer cantEmpleados;
			usuarios[i,6] = ConvertirATexto(cantEmpleados);

		SiNo si tipoUsuario == 2 Entonces
				usuarios[i,0] = nombre;
				usuarios[i,1] = fechaNac;
				usuarios[i,2] = run;
				usuarios[i,3] = tipoUsuarioCadena;

				escribir "Ingrese años de experiencia";
				leer aniosXp;
				usuarios[i,7] = ConvertirATexto(aniosXp);
				escribir "Ingrese departamento"
				leer depto;
				usuarios[i,8] = depto;

			sino si tipoUsuario == 3 Entonces
					usuarios[i,0] = nombre;
					usuarios[i,1] = fechaNac;
					usuarios[i,2] = run;
					usuarios[i,3] = tipoUsuarioCadena;

					Escribir "Ingrese función";
					leer aFuncion;
					usuarios[i,9] = aFuncion;
					Escribir "Ingrese nombre de superior";
					leer nombreSuperior;
					usuarios[i,10] = nombreSuperior;

				FinSi
			Fin Si
		fin si
	Fin Para

	escribir "";
	escribir "Informe";
	escribir "";

	Para j<-0 Hasta n-1 Con Paso 1 Hacer

		escribir "Usuario ",(j+1);
		Si usuarios[j,3] = "Cliente" Entonces

			escribir usuarios[j,0];
			escribir usuarios[j,1];
			escribir usuarios[j,2];
			escribir usuarios[j,3];
			escribir usuarios[j,4];
			escribir usuarios[j,5];
			escribir usuarios[j,6];
			escribir "";
			sino SI usuarios[j,3] = "Profesional" Entonces
					escribir usuarios[j,0];
					escribir usuarios[j,1];
					escribir usuarios[j,2];
					escribir usuarios[j,3];

					escribir usuarios[j,7];
					escribir usuarios[j,8];
					escribir "";

					sino si usuarios[j,3] = "Administrativo" Entonces
							escribir usuarios[j,0];
							escribir usuarios[j,1];
							escribir usuarios[j,2];
							escribir usuarios[j,3];

							escribir usuarios[j,9];
							escribir usuarios[j,10];
							escribir "";

						fin si
				fin si

		fin si


	Fin Para



FinAlgoritmo
