
Feature: Security test scenarios

Background:
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'alisafa@gmail.com' and password 'AliSafa@2024'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      |Electronics|Computers|Smart Home|Sports|Automative|


  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      |<optionOne>|<optionTwo>|
    Examples:
      |department| optionOne | optionTwo|
      | Electronics| TV & Video | Video Games|
      |Computers |Accessories |Networking |
      |Smart Home| Smart Home Lightning | Plugs and Outlets|
      |Sports | Athletic Clothing | Exercise & Fitness|
      |Automotive| Automative Parts & Accessories| MotorCycle & Powersports|

  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And user fill new address form with below information
      |country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
      |country |fullName|phoneNumber|streetAddress|apt|city|state |zipCode |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
      |cartNumber | cartName |monthDate  |yearDate |cartCSV |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’

 Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User change the category to Electronics
    And User search for an items 'Apex Legends'
    And User click on Search icon
    And User click on Apex Legends
    And User select quantities '5'
    And User click add to Cart button
    Then the cart icon quantities should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’







