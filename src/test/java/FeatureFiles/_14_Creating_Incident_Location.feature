Feature: Incident Location

  Scenario: Create a new Incident Location
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