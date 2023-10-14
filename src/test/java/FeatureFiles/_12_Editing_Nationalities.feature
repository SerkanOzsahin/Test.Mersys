Feature: Editing Nationalities

  Scenario: Adding a Nationality
    When the user navigates to nationalities
      | setup         |
      | parameters    |
      | nationalities |
    And the user adds a nationality
    Then the nationality should be added successfully

  Scenario: Editing a Nationality
    When the user navigates to nationalities
      | setup         |
      | parameters    |
      | nationalities |
    And the user edits the nationality
    Then the nationality should be edited successfully

  Scenario: Searching for Nationalities
    When the user navigates to nationalities
      | setup         |
      | parameters    |
      | nationalities |
    And the user uses the search function to find a nationality
    Then the matching nationalities should be displayed successfully

  Scenario: Deleting a Nationality
    When the user navigates to nationalities
      | setup         |
      | parameters    |
      | nationalities |
    And the user deletes a nationality
    Then the nationality should be deleted successfully
