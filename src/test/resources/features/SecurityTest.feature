Feature: validating the Sign In to Retail app

  Scenario: sing in with valid username and password.
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "mohammad2536@gmail.com" and "Password@123" and click on login
    Then user should be able to see account link