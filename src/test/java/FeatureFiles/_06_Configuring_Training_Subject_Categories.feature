Feature: Education Categories

  Scenario: Create a new Subject Categories
    When the user navigates to education
      | educationButton   |
      | setupButton       |
      | subjectCategories |
    Then the user creates a subject categories
    And the subject categories document should be added successfully

  Scenario: Edit a Subject Categories
    When the user navigates to education
      | educationButton   |
      | setupButton       |
      | subjectCategories |
    Then the user edits an existing subject categories
    And the subject categories should be edited successfully

  Scenario: Delete a Subject Categories
    When the user navigates to education
      | educationButton   |
      | setupButton       |
      | subjectCategories |
    Then the user deletes an existing subject categories
    And the subject categories should be deleted successfully