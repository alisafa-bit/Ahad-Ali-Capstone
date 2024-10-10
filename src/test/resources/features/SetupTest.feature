Feature: Setup Framework

  Scenario: Validate top left corner logo
    Then validate top left corner is TEKSCHOOL

  Scenario: Validate the logo and sign in button
    Then validate top left corner is TEKSCHOOL
    Then Validate Sign in button is Enabled