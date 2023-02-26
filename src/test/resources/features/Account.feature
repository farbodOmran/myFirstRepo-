Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'FARBOD.HASHEMI@TEKSCHOOL.US' and password 'Farbod@12345'
    And User click on login button
    And User should be logged in into Account
    Then User click on Account option

  Scenario: Varify user can update Profile Information
    And User update Name 'FarbodOmran' and Password '4163458728'
    And User click on Update Button
    Then User profile information should be updated

  Scenario: Varify User can Update password
    When User enter below information
      | value1        | value2       | value3       |
      | Farbod@123456 | Farbod@12345 | Farbod@12345 |
    And User click on Change Password button
    Then a massage should be displayed 'Password Updated Successfully'

  Scenario: Varify User can add a payment method
    When User click on Add a payment method link
    And User fil Debit or Credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 5674235698431246 | farbodomrani |               3 |           2025 |          007 |
    And User click on Add your card button
    Then a massage should be displayed 'Payment Method added successfully'

  Scenario: Varify User can edit Debit or Credit Card
    When User click on Edit option of card section
    And User edit information with below data
      | CardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 4546376457623244 | FarbodOmran |               5 |           2028 |          363 |
    And User click on Update Your Card button
    Then a massage should be displayed 'Payment Method updated Successfully'

  Scenario: Varify user can remove Debit or Credit card
    When User click on remove option
    And User click on remove option of card section
    Then payment details should be removed

  Scenario: Varify user can add an Address
    When User click on Add address option
    And User fill new address form with belew information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then a massage should be displayed 'Address added successfully'

  Scenario: Varify User can edit an Address added on account
    When User click on edit address option
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click update Your Address button
    Then a massage should be displayed 'Address Updatet Successfully'

  Scenario: Varify User can remove Address from Account
    When User click on remove option of Address section
    Then Address details should be removed
