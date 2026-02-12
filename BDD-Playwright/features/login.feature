Feature: Login

  Scenario: Valid login
    Given I open the login page
    When I login with valid credentials
    Then I should see a success message