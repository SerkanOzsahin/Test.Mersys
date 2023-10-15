Feature: Editing Discounts Under Parameters

  Scenario: Create a new Discount
    When the user navigates to setup
      | setup           |
      | parametersSetup |
      | discounts       |
    And the user creates a new discount
    Then the discount document should be added successfully

  Scenario: Edit a new Discount
    When the user navigates to setup
      | setup           |
      | parametersSetup |
      | discounts       |
    And the user edits an existing new discount
    Then the new discount should be edited successfully

  Scenario: Delete a new Discount
    When the user navigates to setup
      | setup           |
      | parametersSetup |
      | discounts       |
    And the user deletes an existing new discount
    Then the new discount should be deleted successfully