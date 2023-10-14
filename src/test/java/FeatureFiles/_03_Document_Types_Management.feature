Feature: Document Types Management

  Scenario: Add a Document Type
    And the user clicks on the elements in LeftNav
      | setup         |
      | parameters    |
      | documentTypes |
    And the user adds a new document type
    Then the document type should be added successfully

  Scenario: Edit an Existing Document Type
    And the user clicks on the elements in LeftNav
      | setup         |
      | parameters    |
      | documentTypes |
    And the user edits an existing document type
    Then the document type should be edited successfully

  Scenario: Delete an Existing Document Type
    And the user clicks on the elements in LeftNav
      | setup         |
      | parameters    |
      | documentTypes |
    And the user deletes an existing document type
    Then the document type should be deleted successfully
    