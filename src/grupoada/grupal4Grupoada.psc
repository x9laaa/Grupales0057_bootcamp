
InicioProceso 'Registro de Usuarios'
  Escribir "Ingrese la cantidad de usuarios a registrar:"
  Leer cantidadUsuarios
  Para i = 1 hasta cantidadUsuarios hacer
    Escribir "Ingrese el nombre del usuario", i
    Leer nombreUsuario
    Escribir "Ingrese la fecha de nacimiento del usuario", i, " (formato DD/MM/AAAA)"
    Leer fechaNacimiento
    Escribir "Ingrese el RUN del usuario", i
    Leer runUsuario
    Escribir "Seleccione el tipo de perfil del usuario", i, "(1: Cliente, 2: Profesional, 3: Administrativo)"
    Leer tipoPerfil
    Si tipoPerfil = 1 entonces
      Escribir "Ingrese la dirección del cliente2", i
      Leer direccionCliente
      Escribir "Ingrese el teléfono del cliente2", i
      Leer telefonoCliente
      Escribir "Ingrese la cantidad de empleados del cliente2", i
      Leer cantidadEmpleados
      Escribir "Datos del cliente2", i
      Escribir "Nombre:", nombreUsuario
      Escribir "Fecha de nacimiento:", fechaNacimiento
      Escribir "RUN:", runUsuario
      Escribir "Dirección:", direccionCliente
      Escribir "Teléfono:", telefonoCliente
      Escribir "Cantidad de empleados:", cantidadEmpleados
    FinSi
    Si tipoPerfil = 2 entonces
      Escribir "Ingrese los años de experiencia del profesional", i
      Leer anosExperiencia
      Escribir "Ingrese el departamento del profesional", i
      Leer departamentoProfesional
      Escribir "Datos del profesional", i
      Escribir "Nombre:", nombreUsuario
      Escribir "Fecha de nacimiento:", fechaNacimiento
      Escribir "RUN:", runUsuario
      Escribir "Años de experiencia:", anosExperiencia
      Escribir "Departamento:", departamentoProfesional
    FinSi
    Si tipoPerfil = 3 entonces
      Escribir "Ingrese la función del administrativo", i
      Leer funcionAdministrativo
      Escribir "Ingrese el nombre del superior del administrativo", i
      Leer nombreSuperior
      Escribir "Datos del administrativo", i
      Escribir "Nombre:", nombreUsuario
      Escribir "Fecha de nacimiento:", fechaNacimiento
      Escribir "RUN:", runUsuario
      Escribir "Función:", funcionAdministrativo
      Escribir "Nombre del superior:", nombreSuperior
    FinSi
  FinPara
Fin

--

Grupo 6