Feature: Education Categories

  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Create a new Subject Categories
    When the user navigates to education
      | educationButton   |
      | setupButton       |
      | subjectCategories |
    And the user creates a subject categories
    Then the subject categories document should be added successfully

  Scenario: Edit a Subject Categories
    When the user navigates to education
      | educationButton   |
      | setupButton       |
      | subjectCategories |
    And the user edits an existing subject categories
    Then the subject categories should be edited successfully

  Scenario: Delete a Subject Categories
    When the user navigates to education
      | educationButton   |
      | setupButton       |
      | subjectCategories |
    And the user deletes an existing subject categories
    Then the subject categories should be deleted successfully

  Scenario: Checking Disable Scrolling and Creating Subject Categories
    When the user navigates to education
      | educationButton   |
      | setupButton       |
      | subjectCategories |
    And the user creates a subject categories with disable scroll
    Then the user deletes an existing subject categories
