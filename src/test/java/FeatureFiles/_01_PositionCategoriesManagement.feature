Feature: Position Categories Management

  Scenario: Add Position Categories
    And the user clicks on the elements in LeftNav
      | human resources     |
      | setup               |
      | position categories |
    Then the position categories should be added successfully

  Scenario: Edit Position Categories
    And the user clicks on the edit button and user edits position category
    And the user clicks on the save button
    Then position categories should be edited successfully

  Scenario: Delete Position Categories
    And the user clicks on the delete button and deletes position name
    Then position categories should be deleted successfully



