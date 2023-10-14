Feature: Position Categories Management

  Scenario: Add Position Categories
    Then user clicks on human resources button and  on setup button
    And user clicks on position categories
    Then position categories should be added successfully

  Scenario: Edit Position Categories
    Then user clicks on the edit button and user edits position category
    And user clicks on the save button
    And position categories should be edited successfully


  Scenario: Delete Position Categories
    Then user clicks on the delete button and deletes position name
    And position categories should be deleted successfully



