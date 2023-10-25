Feature: Attestations Management

  Scenario: Create a new Attestations
    When the user navigates to human resources
      | humanResources             |
      | humanResourcesSetup        |
      | humanResourcesAttestations |
    Then the user creates an attestations
    And the attestations document should be added successfully

  Scenario: Edit a Attestations document
    When the user navigates to human resources
      | humanResources             |
      | humanResourcesSetup        |
      | humanResourcesAttestations |
    Then the user edits an existing attestations document
    And the attestations document should be edited successfully

  Scenario: Delete a Attestations document
    When the user navigates to human resources
      | humanResources             |
      | humanResourcesSetup        |
      | humanResourcesAttestations |
    Then the user deletes an existing attestations document
    And the attestations document should be deleted successfully