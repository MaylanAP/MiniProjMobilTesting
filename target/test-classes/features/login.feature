@Login
Feature: Login
  As a user
  I want login
  So I success login

  Scenario Outline: login with email and password
    Given I am on alta shop
    When I click sign in button
    And I input "<email>" email
    And I input "<password>" password
    And I click login button
    Then I get "<result>" result
    Examples:
      | email                 | password       | result        |
      | maylananggi@gmail.com | maylanqe22     | can login     |
      | maylananggi@gmail.com | passwordmaylan | error message |
      | akumaylan@gmail.com   | maylanqe22     | error message |
      | akumaylan@gmail.com   | passwordmaylan | error message |
      |                       |                | error message |
      |                       | maylanqe22     | error email   |
      |                       | passwordmaylan | error email   |
      | maylananggi@gmail.com |                | error pass    |
      | akumaylan@gmail.com   |                | error pass    |