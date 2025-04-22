Feature: Validate column renaming for 'Monto Acumulado Folio OPC'

  Scenario: Verify the renaming of the column header in the application
    Given I am on the application page displaying the column 'Monto Acumulado Folio OPC'
    When I check the current name of the header in Column Z
    Then the header should appear as 'Monto Acumulado Folio OPC (2121)'
    And there should be no conflicting data with previous columns