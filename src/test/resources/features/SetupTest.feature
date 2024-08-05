Feature: Navigate to retail app and validate top-left corner Text is TEKSCHOOL
  Scenario: Validate top left corner logo
#    Given Open browser and navigate to retail app  ---->  //Eliminate after hooks
    Then Validate top left corner is TEKSCHOOL
#    Then Close the browser   --->  // Eliminate after hooks

   Scenario: Navigate to retail app and make sure top-left corner text in TEKSCHOOL
   #           And make sure Sign in button is enabled.
   # Given Open browser and navigate to retail app ---> Called from Hook Class
     Then Validate top left corner is TEKSCHOOL
     Then Validate Sign in button is Enabled
   # Then Close the browser


