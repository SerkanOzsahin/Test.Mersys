Feature: Creating Positions Under HR

  Scenario: Add a New Position
    When the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user adds a new position
    Then the position should be added successfully

  Scenario: Edit an Existing Position
    When the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user updates an existing position
    Then the position should be edited successfully

  Scenario: Search for a Position
    When the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user searches for a position
    Then the system should display the results

  Scenario: Enable and Disable Positions
    When the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user chooses to enable or disable a position
    Then the position's status should be updated

  Scenario: Delete a Position
    When the user navigates to positions
      | humanResources |
      | setup          |
      | positions      |
    And the user deletes a position
    Then the position should be deleted successfully
