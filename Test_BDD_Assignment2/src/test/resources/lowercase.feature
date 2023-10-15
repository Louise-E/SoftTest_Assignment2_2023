Feature: Turn string to lowercase
  In order to turn string to lowercase
  As a user
  I want to turn string to lowercase

    Scenario: Turn string to lowercase
        Given I have string "BYE"
        When I turn string to lowercase
        Then I should get the string "bye"