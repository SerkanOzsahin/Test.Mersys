Feature: Login functionality

  Scenario: Login with valid username and password

    Given Navigate to Campus
    When The Enter username and password
    Then The User should click login button
    And The User should login successfully