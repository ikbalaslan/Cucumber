@failed_tests
Feature: hooks_test

  Scenario: TC_01
   Given user is on "https://www.bluerentalcars.com" page
    And user enters customer_email and customer_password
      | username       | password |
      | jack@gmail.com | 12345    |
    Then verify the login page url contains login keyword
