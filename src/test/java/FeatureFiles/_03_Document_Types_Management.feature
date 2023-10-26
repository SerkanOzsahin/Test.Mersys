@SmokeTest
Feature: Document Types Management

  Background:
    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully

  Scenario: Add a Document Type
    When the user navigates to document types
      | setup          |
      | parameters     |
      | document types |
    And the user adds a new document type
    Then the document type should be added successfully

  Scenario: Edit an Existing Document Type
    When the user navigates to document types
      | setup          |
      | parameters     |
      | document types |
    And the user edits an existing document type
    Then the document type should be edited successfully

  Scenario: Delete an Existing Document Type
    When the user navigates to document types
      | setup          |
      | parameters     |
      | document types |
    And the user deletes an existing document type
    Then the document type should be deleted successfully
