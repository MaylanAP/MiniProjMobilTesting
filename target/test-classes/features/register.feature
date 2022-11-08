@Register
Feature: Register
  As a user
  I want register
  So I can register

  Scenario Outline: New Register
    Given I am on alta shop
    When I click sign in button
    And I click register link
    And I input "<fullname>" fullname
    And I input "<email>" new email
    And I input "<password>" new password
    And I click register button
    Then I get "<result>" result regis
    Examples:
      | fullname  | email   | password  | result |
      | maylan    | may1@gmail.com  | akunmay1  | can regis   |
      | maylan    | may1@gmail.com  | akunmay1  | cant regis  |
      |           |                 |           | error name  |
      |           | may1@gmail.com  | akunmay1  | error name  |
      |           |                 | akunmay1  | cant name   |
      | maylan    |                 | akunmay1  | cant email  |
      | maylan    |                 |           | cant email  |
      | maylan    | may1@gmail.com  |           | cant pass   |
      | maylan    |                 |           | cant pass   |
      |           | may1@gmail.com  |           | cant pass   |

