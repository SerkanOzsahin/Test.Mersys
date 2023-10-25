Feature: Attestations Management

  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Create a new Attestations
    When the user navigates to human resources
      | human resources             |
      | human resources setup        |
      | human resources attestations |
    Then the user creates an attestations
    And the attestations document should be added successfully

  Scenario: Edit a Attestations document
    When the user navigates to human resources
      | human resources             |
      | human resources setup        |
      | human resources attestations |
    Then the user edits an existing attestations document
    And the attestations document should be edited successfully

  Scenario: Delete a Attestations document
    When the user navigates to human resources
      | human resources             |
      | human resources setup        |
      | human resources attestations |
    Then the user deletes an existing attestations document
    And the attestations document should be deleted successfully
