Feature: Position Categories Management

  Scenario: Add Position Categories
    When the user navigates to position categories
      | human resources     |
      | setup               |
      | position categories |
    And the user clicks on the add button
    And the user clicks on the save button
    Then the position categories should be added successfully

  Scenario: Edit Position Categories
    When the user navigates to position categories
      | human resources     |
      | setup               |
      | position categories |
    And the user clicks on the edit button
    And the user clicks on the save button
    Then position categories should be edited successfully

  Scenario: Delete Position Categories
    When the user navigates to position categories
      | human resources     |
      | setup               |
      | position categories |
    And the user clicks on the delete button
    Then position categories should be deleted successfully



