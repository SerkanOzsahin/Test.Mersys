Feature: Department Configuration
  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Add a New School Department
    When the user navigates to departments
      | setup        |
      | school setup |
      | departments  |
    And  the user adds a new School Department
    Then the New School Department should be added successfully

  Scenario: Checking School Department's Active and Disactive Button
    When the user navigates to departments
      | setup        |
      | school setup |
      | departments  |
    And  the user checks existing School Department's active button
    Then the active button should be scrolled successfuly

  Scenario: Edit an Existing School Department
    When the user navigates to departments
      | setup        |
      | school setup |
      | departments  |
    And  the user edits an existing School Department
    Then the New School Department should be edited successfully

  Scenario: Delete an Existing School Department
    When the user navigates to departments
      | setup        |
      | school setup |
      | departments  |
    And  the user deletes an existing School Department
    Then the New School Department should be deleted successfully

