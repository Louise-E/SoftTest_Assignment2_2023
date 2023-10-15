Feature: String Utilities

  Scenario: Reverse String
    Given I have a string "aBc"
    When I reverse the string
    Then I get "cBa"

  Scenario: Capitalize String
    Given I have a string "aBc"
    When I capitalize the string
    Then I get "ABC"

  Scenario: Lowercase String
    Given I have a string "aBc"
    When I lowercase the string
    Then I get "abc"