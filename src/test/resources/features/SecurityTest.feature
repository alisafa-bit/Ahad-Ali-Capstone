Feature: validating the Sign In to Retail app

  Scenario: sing in with valid username and password.
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "mohammad2536@gmail.com" and "Password@123" and click on login
    Then user should be able to see account link

  Scenario Outline:  Navigate to sign in page and sign in with invalid credentials
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "<username>" and "<password>" and click on login
    Then user should see error "<errorMessage>"
    Examples:
    |       username         |   password     |      errorMessage         |
    |mohammad2536@gmail.com| WrongPassword  |wrong username or password|
    |Wrong@gmail.com        | Password@123  |wrong username or password|
    |mohammad2536@gmail.com| Passwosrd@123s |wrong username or password|
    |invalid@gmail.com        |Password@123  |wrong username or password|
