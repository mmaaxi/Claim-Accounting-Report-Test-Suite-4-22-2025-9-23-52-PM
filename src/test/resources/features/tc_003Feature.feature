Feature: Validar actualización de la columna 'estado'

  Scenario: Verificar que el encabezado 'estado' corresponda con las especificaciones actualizadas
    Given I navigate to the relevant page
    When I check the header for 'estado'
    Then The header matches the updated specifications in the "Descripción de Campos" sheet

  Scenario: Comparar datos actuales con valores esperados definidos en la documentación
    Given I am on the page with the 'estado' column
    When I compare the current data with expected values
    Then The 'estado' column contains the correct information