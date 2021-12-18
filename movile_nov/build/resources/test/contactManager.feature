Feature: Contact

  Scenario: Crear Contact

    Given i am in the contact manager
    When agrego un contacto con los datos
      | contact name  | phone number |
      | AAAAAAARemove | 77777777   |
    Then the contact "AAAAAAARemove" should be created
