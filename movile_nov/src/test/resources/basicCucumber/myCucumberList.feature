Feature: Listas

  @Regression
  Scenario: Ejemplo Listas

    Given tengo acceso a facebook
    When seteo mi email: "jb@jb.com"
    And seteo mi password: pwd129999
    And hago click en el boton login
    Then yo deberia iniciar sesion
    And los labels deberian ser mostrados
      | logout        |
      | marketplace   |
      | mi perfil     |
      | groups        |
      | notifications |