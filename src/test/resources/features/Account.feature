@Test
Feature: Security test scenarios

  Background:
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'alisafa@gmail.com' and password 'AliSafa@2024'
    And User click on login button
    When User click on Account option

  Scenario: Verify user can sign in into Retail Application
    Then User should be logged in into Account

  Scenario: Verify User can update Profile Information
    And User update Name ‘NameValue’ and Phone ‘PhoneValue’
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can Update password
    And User enter below information
      |previousPassword| newPassword|confirmPassword|
      |   password     |newPassword|confirmPassword |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
      |cartNumber | cartName |monthDate  |yearDate |cartCSV |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
    #  |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
      |cartNumber | cartName |yearDate |monthDate |cartCSV |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      |country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
      |country |fullName|phoneNumber|streetAddress|apt|city|state |zipCode |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’


  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      |country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
      |country |fullName|phoneNumber|streetAddress|apt|city|state |zipCode |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed




