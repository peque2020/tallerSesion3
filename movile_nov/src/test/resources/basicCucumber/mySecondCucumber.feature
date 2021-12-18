Feature: Login

  Scenario Outline: Ejemplo segundo test

    Given tengo acceso a <application>
    When seteo mi email: "<email>"
    And seteo mi password: pwd<password>
    And hago click en el boton login
    Then <verificacion>

    Examples:
      | email       | password | application | verificacion                 |
      | jb1@jb1.com | 123      | facebook    | yo deberia iniciar sesion    |
      | jb2@jb2.com | 222      | Whatsapp    | yo deberia iniciar sesion    |
      | jb3@jb3.com | 333      | facebook2   | yo deberia iniciar sesion    |
      | jb4@jb5.com | 444      | facebook    | yo deberia iniciar sesion    |
      | jb4@jb5.com | 000      | facebook    | yo no deberia iniciar sesion |