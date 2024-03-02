Feature: Open a web browser

  Scenario: Kraft Login Test
    Given The user is on the login page
    When The user types in following credentials
      | email    | mgezer@gmail.com |
      | password | Mg12345678       |
    Then The user should be able to see own name : "Melih Gezer" at the dashboard page
    And The user closes browser