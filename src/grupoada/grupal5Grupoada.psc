//grupal 5 ada
//Nelson Carvala, Michel Echavarria, Juan David Lucio, Pablo Aliaga
Algoritmo grupal5ada
	
	Definir n, i, j Como Entero
	Definir tasa, tasaTemp Como Entero
	Definir nombres Como Cadena
	
	Escribir "Ingresar la cantidad de cliente2s"
	Leer n
	
	Dimension tasa[n]
	Dimension nombres[n]
	
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese el nombre de la persona"
		Leer nombres[i]
		Escribir  "Ingrese tasa accidentabilidad"
		Leer tasa[i]
	Fin Para
	
	Para i <- 1 Hasta  n-1 Con Paso 1 Hacer
		Para j <- 1 Hasta  n-1 Con Paso 1 Hacer
			Si tasa[j] < tasa[j+1]
				tasaTemp = tasa[j+1]
				tasa[j+1] = tasa[j]
				tasa[j] = tasaTemp
			FinSi
		FinPara
	FinPara
	
	Escribir "Datos:"
	Para i <- 1 Hasta n Hacer
		Escribir "Nombre: ", nombres[i]," Tasa accidentabilidad: ",tasa[i];
	Fin Para
	
FinAlgoritmo