Feature: Editing Bank Account

  Scenario: Add Bank Account
    When the user navigates to bank accounts
      | setup         |
      | parameters    |
      | bank accounts |
    And the user adds a bank account
    Then the bank accounts should be added successfully

  Scenario: Edit Bank Account
    When the user navigates to bank accounts
      | setup         |
      | parameters    |
      | bank accounts |
    And the user edits a bank account
    Then the bank accounts should be edited successfully

  Scenario: Delete Bank Account
    When the user navigates to bank accounts
      | setup         |
      | parameters    |
      | bank accounts |
    Then the user deletes a bank account
    Then the bank accounts should be deleted successfully