Feature: Verify company data

  Scenario Outline: check login is successfull with valid credentials
    Given open the browser
    When user enters valid <username> and <password>
    And clicks on login button
    And clicks on company field
    When user enters company name to text field
    And clicks on search button
    Then company data should fetch from linkedIn and display on UI

    Examples: 
      | username | password |
      | bharath  |    12345 |
