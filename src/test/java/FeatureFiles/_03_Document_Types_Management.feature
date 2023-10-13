Feature: Document Types Management

  Scenario: Add a Document Type
    And the user click on the elements in LeftNav
      | setup         |
      | parameters    |
      | documentTypes |

    And the user adds a new document type
    Then the document type should be added successfully
    And the user edits an existing document type
    Then the document type should be edited successfully
    And the user deletes an existing document type
    Then the document type should be deleted successfully
