Feature: Check login functionality

  Scenario Outline:check login is successfull with valid credentials
 
    Given user is on login page
    When user enters valid <username> and <password>
    And user clicks on login
    Then user should navigate to home page

     Examples: 
      | username | password  |
      | Admin    | admin123  |
      | Admin    | admin1234 |