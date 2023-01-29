@bluerental_car
  Feature: login_feature
    Scenario Outline: TC
      Given Given user is on "https://www.bluerentalcars.com/" page
      When User navigate to login page
      And user enters the firstname "<username>"
      And user enters the lastname "<password>"
      And user clicks on login button
      Then verify the login is successful
      Then close the application

      Examples: test_data
      |username                        |  password |
      | sam.walker@bluerentalcars.com| c!fas_art |
      | kate.brown@bluerentalcars.com|  tad1$Fas|
      |raj.khan@bluerentalcars.com   | v7Hg_va^ |
      |pam.raymond@bluerentalcars.com| Nga^g6! |


