Feature: Language Change On TOI Website

  Scenario: Looking for language selector
    Given User is on the homepage
    When User clicks on the language selector
    And User Clicks On Hindi Language
    Then User should see the hindi language site
