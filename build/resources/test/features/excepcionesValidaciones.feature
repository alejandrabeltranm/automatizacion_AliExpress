#language: es
#author: maria.beltran@sqasa.co

Característica: Elegir producto
  Como usuario
  Quiero alegir un producto de Ali Express
  Para validar que se pueda anadir a la cesta

  Antecedentes:
    Dado que usuario quiere cerrar las excepciones de Ali Express
    Cuando realiza el cierre de ventanas emergentes

  @excepcionesValidaciones
  Esquema del escenario: Excepciones y Validaciones
    Cuando elige un producto
    Entonces se valida que se pueda enviar a Colombia
      | pais   |
      | <pais> |
    Y se anade a la cesta

    Ejemplos:
      | pais     |
      | Colombia |
      #| Ecuador  |
