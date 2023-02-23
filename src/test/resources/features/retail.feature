Feature: This feature is use for testing UI of Retail page

  Background: 
    Given User is on retail website

  Scenario: Verify Shop by Department sidbar
    When User click on All Section
    Then blew option are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @test
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
