Feature: This feature is use for testing UI of Retail page

  Background: 
    Given User is on retail website

  Scenario: Verify Shop by Department sidbar
    When User click on All Section
    Then blew option are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Varify department sidebar options
    When User click on All Section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo               |
      | Electronics | TV & Video                     | Video Games             |
      | Computers   | Accessories                    | Networking              |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets       |
      | Sports      | Athletic Clothing              | Exercise & Fitness      |
      | Automotive  | Automotive Parts & Accessories | MotorCycle & Powersport |

  Scenario: Varify User can add an item to cart
    When User click on Sign in option
    And User enter email 'FARBOD.HASHEMI@TEKSCHOOL.US' and password 'Farbod@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'FARBOD.HASHEMI@TEKSCHOOL.US' and password 'Farbod@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | fullName   |              12 |           2025 | securityCode |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'FARBOD.HASHEMI@TEKSCHOOL.US' and password 'Farbod@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'
