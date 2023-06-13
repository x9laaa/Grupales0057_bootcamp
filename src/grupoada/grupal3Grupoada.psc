Algoritmo accidente
	DEFINIR procedimiento COMO ENTERO;
	DEFINIR manual COMO ENTERO;
	
	ESCRIBIR "Sigue los procedimientos: 1 Si, 2 NO";
	LEER procedimiento;
	ESCRIBIR "Se ha leido el manual: 1 Si, 2 NO";
	LEER manual;
	
	Si procedimiento=1 Y manual=1 Entonces
		ESCRIBIR "NO HA OCURRIDO UN ACCIDENTE";
	SiNo
		Si manual=1 Entonces
			ESCRIBIR "NO OCURRIRA UN ACCIDENTE";
		SiNo
			Si procedimiento=1 Entonces
				ESCRIBIR "NO OCURRIRA UN ACCIDENTE";
			SiNo
				ESCRIBIR "SI OCURRIRA UN ACCIDENTE";
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
