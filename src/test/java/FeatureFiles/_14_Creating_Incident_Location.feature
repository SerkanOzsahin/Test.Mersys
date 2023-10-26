@Regression
Feature: Incident Location

  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Create a New Incident Location
    When the user navigates to incidents
      | incidents        |
      | incidentsSetup   |
      | incidentLocation |
    And the user creates a new incidents location
    Then the incidents location should be added successfully

  Scenario: Edit an Incident Location
    When the user navigates to incidents
      | incidents        |
      | incidentsSetup   |
      | incidentLocation |
    And the user edits an existing incidents location
    Then the incidents location should be edited successfully

  Scenario: Delete an Incident Location
    When the user navigates to incidents
      | incidents        |
      | incidentsSetup   |
      | incidentLocation |
    And the user deletes an existing incidents location
    Then the incidents location should be deleted successfully
