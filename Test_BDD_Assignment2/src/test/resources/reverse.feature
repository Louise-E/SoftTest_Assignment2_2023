Feature: Reverse String
    In order to get the reverse of a string
    As a user
    I want to be able to reverse a string
  Scenario: Reverse a string
    Given I have a string "Hello"
    When I reverse the string "Hello"
    Then I get "olleH"