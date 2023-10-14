Feature: Creating Positions Under HR

  Scenario: Add a New Position
    And the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user adds a new position
    Then the position should be added successfully

  Scenario: Edit an Existing Position
    And the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user updates an existing position
    Then the position should be edited successfully

  Scenario: Search for a Position
    And the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user searches for a position
    Then the system should display the relevant results

  Scenario: Enable and Disable Positions
    And the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user chooses to enable or disable a position
    Then the position's status should be updated accordingly

  Scenario: Delete a Position
    And the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user deletes a position
    Then the position should be deleted successfully
