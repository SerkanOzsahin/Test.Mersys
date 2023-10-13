Feature: Attestations_Management

  Scenario: Create a new Attestations
    When navigate to human resources
    Then create a attestations
    And the attestations document should be added successfully

  Scenario: Edit a Attestations document
    When the user edits an existing attestations document
    Then the attestations document should edited successfully

  Scenario: Delete a Attestations document
    When the user deletes an existing attestations document
    Then the attestations document should deleted successfully