Feature: Parameters Navigation

  Scenario: Check if parameters menu links lead to the correct pages
    When the user navigates to parameters
      | setup      |
      | parameters |

    Then Upon clicking the following menu links, the user should see the corresponding page titles
      | countries     |
      | states        |
      | cities        |
      | citizenships  |
      | rfl           |
      | nationalities |
      | fees          |
      | discounts     |
      | gradeLevels   |
      | documentTypes |
      | bankAccounts  |
      | fields        |
      | fieldSettings |
