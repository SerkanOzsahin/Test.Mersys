Feature: School Setup Location

  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Add School Setup Location
    When the user navigates to school setup location
      | setup        |
      | school setup |
      | locations    |
    And the user click on the add button
    And the user click on the save button
    Then the location should be add successfully

  Scenario: Edit School Setup Location
    When the user navigates to school setup location
      | setup        |
      | school setup |
      | locations    |
    And the user click on the edit button
    Then the location should be edit successfully

  Scenario: Delete School Setup Location
    When the user navigates to school setup location
      | setup        |
      | school setup |
      | locations    |
    And the user click on the delete button
    Then the location should be delete successfully
