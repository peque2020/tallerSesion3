Feature: Calculadora
  Scenario: Suma

    Given la aplicacion calculadora esta abierta
    When presiono el boton "2"
    And presiono el boton "+"
    And presiono el boton "7"
    And presiono el boton "="
    Then el resultado deberia ser: 9