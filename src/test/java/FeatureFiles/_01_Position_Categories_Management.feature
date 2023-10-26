@SmokeTest @Regression
Feature: Position Categories Management

  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Add Position Categories
    When the user navigates to position categories
      | human resources       |
      | human resources setup |
      | position categories   |
    And the user adds a new position categories
    Then the position categories should be added successfully

  Scenario: Edit Position Categories
    When the user navigates to position categories
      | human resources       |
      | human resources setup |
      | position categories   |
    And the user edits an existing position categories
    Then position categories should be edited successfully

  Scenario: Delete Position Categories
    When the user navigates to position categories
      | human resources       |
      | human resources setup |
      | position categories   |
    And the user deletes an existing position categories
    Then position categories should be deleted successfully
