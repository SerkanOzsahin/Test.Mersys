Feature: Editing Grade Levels

  Scenario: Add Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user adds a new grade level
      | name                  |
      | order                 |
      | max application count |
      | short name            |
      | next grade            |
    Then the grade level should be added successfully

  Scenario: Edit Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user edits a new grade level
      | name                  |
      | order                 |
      | max application count |
      | short name            |
      | next grade            |
    Then the grade level should be edited successfully

  Scenario: Delete Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user deletes a new grade level
    Then the grade level should be deleted successfully

