Feature: Check login functionality

  Scenario: Sample 1
    Given user is on login page
    When user enters valid username and password
    And user clicks on login
    Then user is navigated to the home page
