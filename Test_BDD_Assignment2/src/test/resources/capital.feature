Feature: Capitalize a string
  In order to capitalize a string
  As a user
  I want to be able to capitalize a string

  Scenario:
    Given I have the string "hi"
    When I capitalize the string "hi"
    Then I should get "HI"