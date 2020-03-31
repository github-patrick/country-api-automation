Feature: Foo Bar

  Scenario: Foo test
    Given I am an object
    When I execute my method
    Then I should see an output
    And the context in foo should be "Mozart and Co."


  Scenario: The sum of a list of numbers should be calculated
    Given a list of numbers
      | 17   |
      | 42   |
      | 4711 |
    When I summarize them
    Then should I get 4770

  Scenario: An international coffee shop must handle currencies
    Given I have a film
      | title                | release_date |
      | Shawshank Redemption | 1995         |
      | Heat                 | 1994         |


