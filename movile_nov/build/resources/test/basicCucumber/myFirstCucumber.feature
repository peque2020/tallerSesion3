Feature: Login

  #This is a comment

  Scenario: Como usuario comun
            quiero usar mis credenciales 4
            para poder ingresar a la aplicacion

    Given tengo acceso a facebook
    When seteo mi email: "jb@jb.com"
    And seteo mi password: pwd12345
    And hago click en el boton login
    Then yo deberia iniciar sesion