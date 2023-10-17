Feature: Adding New Fields to Admin Panel
  
  Scenario: Add a New Fields
    When the user navigates to field
    | setup     |
    | parameters|
    | fields    |
    And  the user adds a new field
    Then the new field should be added successfully

  Scenario: Edit an Existing Field
    When the user navigates to field
      | setup     |
      | parameters|
      | fields     |
    And the user edits an existing field
    Then the field should be edited successfully

  Scenario: Delete an Existing Fields
    When the user navigates to field
      | setup     |
      | parameters|
      | fields     |
    And the user deletes an existing field
    Then the field should be deleted successfully

