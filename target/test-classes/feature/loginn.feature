Feature: Feature to test login functionality

  Scenario: Check login successfully with valid credentials
    Given User on in login page
    When user enters username and password
    And clicks on loging button
    Then user is navigated to the home page

  Scenario: Check login successfully with invalid credentials
    Given User on in login page
    When user enters invalid username and password
    And clicks on loging button
    Then error message is displayed - invalid Credentials
