Feature: Login

  Background:
    Given tengo acceso a facebook

  Scenario: test
    When seteo mi email: "jb@jb.com"
    And seteo mi password: pwd129999
    And hago click en el boton login
    Then yo deberia iniciar sesion

  Scenario: test
    And hago click en el boton login
    Then yo no deberia iniciar sesion


  Scenario: test
    When seteo mi email: "jb@jb.com"
    And hago click en el boton login
    Then yo no deberia iniciar sesion