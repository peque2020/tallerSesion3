Feature: ToDo
  Scenario: Crear tarea

    Given la aplicacion toDo esta abierta
    When agrego un titulo "Ir al supermercado"
    And presiono boton "Guardar"
    Then se ha creado la tarea "Ir al supermercado"