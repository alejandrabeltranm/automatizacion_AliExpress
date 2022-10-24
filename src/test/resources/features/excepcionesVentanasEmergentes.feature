#language: es
#author: maria.beltran@sqasa.co

Característica: Cerrar excepciones
  Como usuario
  Quiero cerrar las excepciones de Ali Express
  Para validar que se cierren correctamente

  @cerrarExcepciones
  Escenario: Excepciones
    Dado que usuario quiere cerrar las excepciones de Ali Express
    Cuando realiza el cierre de ventanas emergentes
    Entonces se valida que se cierren correctamente
