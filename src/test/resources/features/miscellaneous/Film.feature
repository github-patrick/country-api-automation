@Film @SmokeTest
Feature: Film feature

  Background:

  Scenario: The addition of a film

#    Gherkin step which matches to a step definition expression
    Given I set the context
    And I have a film with a title and release date
    When I add the film
    Then the film should be added to the list of films


  Scenario: The acknowledgement of the context
    When I add the film
    Then I have the context set to "Mozart and Co."

