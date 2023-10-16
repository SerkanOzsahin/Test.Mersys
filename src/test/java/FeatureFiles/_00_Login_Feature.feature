Feature: Login functionality

  Scenario: Login with valid username and password

    Given Navigate to Campus
    When the user enters username and password
    And the user clicks login button
    Then the user should login successfully