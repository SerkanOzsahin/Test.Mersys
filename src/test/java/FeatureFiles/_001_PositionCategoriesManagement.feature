Feature: Position Categories Management

  Scenario: Add Position Categories
    When user clicks on human resources
    Then user clicks on position categories
    And user clicks add button

  Scenario: Edit Position Categories
    When user clicks on the edit button
    Then user edits
    And user clicks the save button

  Scenario: Delete Position Categories
    When user clicks on the delete button
    And user deletes position name


