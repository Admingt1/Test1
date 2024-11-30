#Author:Test automater
Feature: Test login functionality hook

  Scenario Outline: Check login successfull
    Given user is in login page
    When user input <username> and <password>
    And user click for login
    Then user is navigated to the main page

    Examples: 
      | username | password |
      | Admin    | admin123 |
 
  Scenario Outline: Check login not successfull 
    Given user is in login page    
    When user input <username> and <password>
    And user click for login
    Then user is can not navigated to the main page

    Examples: 
      | username | password |
      | Ad    | adm|