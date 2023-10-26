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
    And  the user adds a new school department
    Then the new school department should be added successfully

  Scenario: Edit an Existing School Department
    When the user navigates to departments
      | setup        |
      | school setup |
      | departments  |
    And  the user edits an existing school department
    Then the new school department should be edited successfully

  Scenario: Delete an Existing School Department
    When the user navigates to departments
      | setup        |
      | school setup |
      | departments  |
    And  the user deletes an existing school department
    Then the new school department should be deleted successfully
