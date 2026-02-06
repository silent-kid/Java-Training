Feature: Automation Test Store End to End Flow

  Scenario: Complete order flow
    Given user is logged into Automation Test Store
    And user add an address
    When user searches and sort the products
    And user add and reviews cart
    And user completes checkout
	And user view invoice and logout
    