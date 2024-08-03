Feature: security test scenario
  Scenario: Sign in your login info
    #Given Open and closing browser is being called by Hooks
    When user click on sign in link
    Then validate user is in sign in page
    When user enter username and password and click on login
    Then user should be able to see account link

  Scenario: Navigate to sign in page and sign in with invalid username and valid password.
  Validate error message display "Wrong username or password"
  #Given Open and closing browser is being called by Hooks
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "invalid@gmail.com" and "Password_87" then click on login
    Then user should see error "wrong username or password"

  Scenario: Navigate to sign in page and sign in with valid username and invalid password.
  Validate error message display "Wrong username or password"
    #Given Open and closing browser is being called by Hooks
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "mnm87@gmail.com" and "invalidPassword" then click on login
    Then user should see error "wrong username or password"