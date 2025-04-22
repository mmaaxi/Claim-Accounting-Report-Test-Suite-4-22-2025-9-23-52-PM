Feature: Validate inclusion and position of the 'Estado Código' column

  Scenario: Verify the presence and correct position of the 'Estado Código' column
    Given the export file is downloaded
    When I review the columns in the export file
    Then the 'Estado Código' column should be included
    And it should be positioned to the right of the 'i' column