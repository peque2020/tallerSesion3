Feature: Objeto

  @Regression @SanityTest @SmokeTest
  Scenario: Ejemplo Objeto

    Given tengo acceso a facebook
    When quiero llenar el formulario de registro con
      | name | email     | direccion | phone | idioma |
      | jb   | jb@jb.com | peru      | 33456 | ingles |
    And click en el boton registrar
    Then mi cuenta deberia ser creada