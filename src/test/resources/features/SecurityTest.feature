Feature: security test scenario
  Scenario: Sign in your login info
    When user click on sign in link
    Then validate user is in sign in page
    When user enter username and password and click on login
    Then user should be able to see account link
