Feature: Login functionality

  Scenario: User enters email on login page
    Given user is on Google login page
    When user enters email "test@test.com"
    Then email should be entered successfully