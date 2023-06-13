Algoritmo Grupal_3
	//Equipo Rocket
//	Diego Ortiz
//	Joshua Vargas
//	Matias Aguayo
//	Christopher López
//	Alejandro Quiñones
	definir P, Q, R Como Logico;

	escribir "¿El trabajador ha cumplido los precidimientos de seguridad?";
	leer P;

	escribir "¿El trabajador ha leído el manual de seguridad interno?";
	leer Q;

	Escribir "¿Ocurrirá un accidente?"
	Si Q <> Verdadero O P <> Verdadero Entonces
		R = Verdadero;
		escribir R;
	SiNo
		R = Falso;
		escribir R;
	Fin Si


FinAlgoritmo
