Feature: Adding New Fields to Admin Panel
  
  Scenario: Add a New Fields
    When the user navigates to field
    | setup     |
    | parameters|
    | field     |
    And  the user adds a new field
    Then the new field should be added succesfully

  Scenario: Edit an Existing Field
    When the user navigates to field
      | setup     |
      | parameters|
      | field     |
    And the user edits an existing field
    Then the field should be edited succesfully

  Scenario: Delete an Existing Field
    When the user navigates to field
      | setup     |
      | parameters|
      | field     |
    And the user deletes an existing field
    Then the field shold be deleted succesfully

