@completeTest
Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Varify user can sign in into Retail Application
    And User enter email 'FARBOD.HASHEMI@TEKSCHOOL.US' and password 'Farbod@123456'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Varify user can create an account into Retail Website
    And User click on Create New Account button
    Then User fill the signUp information with below data
      | fullName | email | password    | password    |
      |          |       | Tek@6583456 | Tek@6583456 |
    And User click on SignUp button
    Then User should be logged into account page
