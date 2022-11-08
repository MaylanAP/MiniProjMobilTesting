@Beli
Feature: Button Beli
  As a user
  I want buy product
  So I can get product

#  Scenario Outline: Beli one product
#    Given I am on alta shop
#    And I click sign in button
#    And I input "<email>" email
#    And I input "<password>" password
#    And I click login button
#    And I get "<result>" result
#    When I click beli button product 1
#    And I click beli button product 2
#    Then product increases
#    Examples:
#      | email | password  | result  |
#      |maylananggi@gmail.com  | maylanqe22  | can login |

  Scenario Outline: Beli one product
    Given I am on alta shop
    And I click sign in button
    And I input "<email>" email
    And I input "<password>" password
    And I click login button
    And I get "<result>" result
    When I click beli button product 1
    And I click beli button product 3
    Then product increases
    Examples:
      | email | password  | result  |
      |maylananggi@gmail.com  | maylanqe22  | can login |
