Feature: Flight booking on the IRCTC website

  Scenario: Search for available flights
    Given User is on the homepage of the IRCTC airline site
    When User enters source and destination cities
    And User selects flight dates
    Then User should see a list of available flights
