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
      |           |                 |           |             |
      |           | may1@gmail.com  | akunmay1  | cant regis  |
      |           |                 | akunmay1  | cant regis  |
      | maylan    |                 | akunmay1  | cant regis  |
      | maylan    |                 |           | cant regis  |
      | maylan    | may1@gmail.com  |           | cant regis  |
      | maylan    |                 |           | cant regis  |
      |           | may1@gmail.com  |           | cant regis  |

