Feature: Login functionality on the IRCTC website

  Scenario: Valid user login
    Given User navigates to "https://www.air.irctc.co.in/"
    When User enters valid credentials
    And User clicks on login button
    Then User should be logged in successfully


