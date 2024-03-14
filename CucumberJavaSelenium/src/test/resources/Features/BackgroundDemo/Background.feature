Feature: Check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

  Scenario: check logout link
 
    When user clicks on profile link
    Then logout link is displayed

  Scenario: check for admin page

    When user clicks on admin field
    Then admin page should be displayed
