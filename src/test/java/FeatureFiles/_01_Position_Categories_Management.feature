Feature: Position Categories Management

  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Add Position Categories
    When the user navigates to position categories
      | human resources     |
      | human resources setup |
      | position categories |
    And the user clicks on the add button
    And the user clicks on the save button
    Then the position categories should be added successfully

  Scenario: Edit Position Categories
    When the user navigates to position categories
      | human resources     |
      | human resources setup |
      | position categories |
    And the user clicks on the edit button
    Then position categories should be edited successfully

  Scenario: Delete Position Categories
    When the user navigates to position categories
      | human resources     |
      | human resources setup |
      | position categories |
    And the user clicks on the delete button
    Then position categories should be deleted successfully
