Feature: Validate inclusion of 'Exempt VAT' and 'Withheld VAT' columns in the report

  Scenario: Verify the report columns and corresponding values
    Given I have exported the report
    When I inspect the report for 'Exempt VAT' and 'Withheld VAT' columns
    Then I should see the 'Exempt VAT' and 'Withheld VAT' columns present in the file
    And the 'Exempt VAT' column should contain the correct values
    And the 'Withheld VAT' column should contain the correct values