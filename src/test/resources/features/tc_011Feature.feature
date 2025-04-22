Feature: Validate the update of the formula for 'IVA Acumulado'

  Scenario: Examine formula in 'IVA Acumulado' column for correct tax inclusion
    Given I am on the "IVA Calculation" page
    When I examine the 'IVA Acumulado' formula
    Then the formula should include only IVA 16%, IVA FRONTERIZO, IVA 0%, and IVA EXENTO
    And the formula should exclude IVA retenido

  Scenario: Validate accumulator with different IVA amounts
    Given I have a list of IVA amounts
    When I add IVA 16%, IVA FRONTERIZO, IVA 0%, and IVA EXENTO
    Then the 'IVA Acumulado' should reflect the correct accumulated sum