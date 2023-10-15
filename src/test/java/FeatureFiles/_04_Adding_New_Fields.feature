Feature: Adding New Fields to Admin Panel
  Scenario: Add a New Fields
    And  the user clicks on yhe elements in Left Nav
    | setup     |
    | parameters|
    | field     |
    And  the user adds a new field
    Then the new field should be added succesfully

  Scenario: Edit an Existing Field
    And  the user clicks on yhe elements in Left Nav
      | setup     |
      | parameters|
      | field     |
    And the user edits an existing field
    Then the field should be edited succesfully

  Scenario: Delete an Existing Field
    And the user clicks on yhe elements in Left Nav
      | setup     |
      | parameters|
      | field     |
    And the user deletes an existing field
    Then te field shold be deleted succesfully

