Feature: Sign In Feature

  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    Then User enter email 'ihateteacher@tek.com' and password 'Tek@12345'
    Then User click on login button
    Then User should be logged in into Account
