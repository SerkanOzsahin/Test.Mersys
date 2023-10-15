Feature: Editing Discounts Under Parameters

  Scenario: Create a new Discount
    When the user navigates to setup
      | setup           |
      | parametersSetup |
      | discounts       |
    Then the user creates a new discount
    And the discount document should be added successfully

  Scenario: Edit a new Discount
    When the user navigates to setup
      | setup           |
      | parametersSetup |
      | discounts       |
    Then the user edits an existing new discount
    And the new discount should be edited successfully

  Scenario: Delete a new Discount
    When the user navigates to setup
      | setup           |
      | parametersSetup |
      | discounts       |
    Then the user deletes an existing new discount
    And the new discount should be deleted successfully