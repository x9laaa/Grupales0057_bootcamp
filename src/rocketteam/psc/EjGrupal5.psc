Algoritmo EjGrupal5
	
	Definir temp, t,tasa como Real;
	Definir nom,nombre como Cadena;
	Definir cant_clientes,a,i,j,z Como Entero;
	
	Escribir "Ingrese la cantidad de clientes a ingresar";
	Leer cant_clientes;
	
	Dimension nombre(cant_clientes);
	Dimension tasa(cant_clientes);
	Dimension orden(cant_clientes);
	
	Para a = 0 Hasta cant_clientes -1 Hacer
		Escribir "Ingrese nombre ", a+1, ":";
		Leer nombre(a);
		Escribir "Ingrese tasa ", a+1, ":";
		Leer tasa(a);
	FinPara
	
	Para i = cant_clientes - 2 Hasta 0 Con Paso -1 Hacer
		Para j = cant_clientes -1 Hasta 1 Hacer
			Si tasa(j-2) < tasa(j-1) Entonces
				
				t = tasa(j-2);
				nom = nombre(j-2);
				
				tasa(j-2) = tasa(j-1);
				nombre(j-2) = nombre(j-1);
				
				tasa(j-1) = t;
				nombre(j-1) = nom;
			FinSi
		FinPara
	FinPara
	
	Para z = 0 Hasta cant_clientes-1 Hacer
		Escribir "Nombre: ", nombre(z), " - Tasa: ", tasa(z);
	FinPara
	
FinAlgoritmo
