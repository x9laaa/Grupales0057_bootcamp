Algoritmo OrdenamientoClientes

    Definir N, i, j como Entero
    Definir profesional como Cadena

    Escribir "Ingrese el nombre del profesional:"
    Leer profesional

    Escribir "Ingrese la cantidad de clientes:"
    Leer N

    Dimension tasas[N]
    Dimension nombres[N]

    Para i = 1 Hasta N Hacer
        Escribir "Cliente ", i
        Escribir "Ingrese el nombre del cliente:"
        Leer nombres[i]
        Escribir "Ingrese la tasa de accidentabilidad del cliente asociado a ", profesional, ":"
        Leer tasas[i]
    FinPara

    Para i = 1 Hasta N - 1 Hacer
        Para j = 1 Hasta N - i Hacer
            Si tasas[j] < tasas[j + 1] Entonces
                temp_tasa = tasas[j]
                tasas[j] = tasas[j + 1]
                tasas[j + 1] = temp_tasa


                temp_nombre = nombres[j]
                nombres[j] = nombres[j + 1]
                nombres[j + 1] = temp_nombre
            FinSi
        FinPara
    FinPara

    Escribir "Tasas de accidentabilidad (de mayor a menor):"
    Para i = 1 Hasta N Hacer
        Escribir nombres[i], ": ", tasas[i]
    FinPara

FinAlgoritmo