@Logout
Feature: Logout
  As a user
  I want logout account
  So I can logout

  Scenario Outline: Logout
    Given I am on alta shop
    And I click sign in button
    And I input "<email>" email
    And I input "<password>" password
    And I click login button
    And I get "<result>" result
    When I click logout button
    Then I in the page home
    Examples:
      | email | password  | result  |
      |maylananggi@gmail.com  | maylanqe22  | can login |
