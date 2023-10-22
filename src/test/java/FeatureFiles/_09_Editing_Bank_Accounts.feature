Feature: Editing Bank Account

  Scenario: Add Bank Account
    When the user navigates to bank accounts
      | setup         |
      | parameters    |
      | bank accounts |
    And the user clicks on the add button
    And the user clicks on the save button
    Then the bank accounts should be added successfully

  Scenario: Edit Bank Account
    When the user navigates to bank accounts
      | setup         |
      | parameters    |
      | bank accounts |
    And the user clicks on the edit button
    Then the bank accounts should be edited successfully

  Scenario: Delete Bank Account
    When the user navigates to bank accounts
      | setup         |
      | parameters    |
      | bank accounts |
    Then the user clicks on the delete button
    Then the bank accounts should be deleted successfully