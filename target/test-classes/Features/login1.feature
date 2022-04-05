Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Ram      |    12345 |
      #| shaam    |    12345 |
