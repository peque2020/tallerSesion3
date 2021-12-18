Feature: Mapas

  @Regression
  Scenario: Ejemplo Mapas

    Given tengo acceso a facebook
    When quiero llenar el formulario de registro con los datos
      | name      | jb        |
      | email     | jb@jb.com |
      | direccion | peru      |
      | phone     | 7777      |
      | idioma    | ingles    |
    And click en el boton registrar
    Then mi cuenta deberia ser creada