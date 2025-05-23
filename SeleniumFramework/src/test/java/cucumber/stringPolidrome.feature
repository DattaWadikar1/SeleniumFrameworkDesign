Feature: Determine if String is Palindrome or not. A string is a palindrome if it read the same backwards as forwards.
Background:
  Given Login to application
  Scenario: Valid Palindrome
    Given I entered string "Refer"
    When I test it for Palindrome
    Then the result should be "true"

  Scenario: Invalid Palindrome
    Given I entered string "Coin"
    When I test it for Palindrome
    Then the result should be "false"

  Scenario Outline: Invalid Palindrome
    Given I entered string <username>
    When I test it for Palindrome
    Then the result should be <password>
    Examples:
      | username | password
      | Refer    | true
      | Coin     | false