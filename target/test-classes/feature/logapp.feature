#Author:Test automater
Feature: Test login functionality

  Scenario Outline: Check login successfull
    Given Browser is available
    And user is in login page
    When user input <username> and <password>
    And user click for login
    Then user is navigated to the main page

    Examples: 
      | username | password |
      | Admin    | admin123 |

  Scenario Outline: Check login does not successfull
    Given Browser is available
    And user is in login page
    When user input invalid <username> and <password>
    And user click for login
    Then user does not navigated to the main page

    Examples: 
      | username | password |
      | dmin     | dmin123  |
