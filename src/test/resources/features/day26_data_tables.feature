@data_tables1
Feature: data_tables
  Scenario: customer_login
    Given user is on "https://www.bluerentalcars.com" page
    And user enters customer_email and customer_password
      | username       | password |
      | jack@gmail.com | 12345    |
    Then verify the application login is successful
    And close the application