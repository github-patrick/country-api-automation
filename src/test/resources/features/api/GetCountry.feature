@Api
Feature: As a client
  I want to be able to retrieve a country
  So that I have its details


  Scenario: A client retrieves a country
    Given the country of interest is "Sweden"
    When I make a request to get its details
    Then the status code is 200
    And I should see details for "Sweden"
    And the schema is correct


  Scenario: An attempt to retrieve a non existent country
    Given the country of interest is "nonexistent"
    When I make a request to get its details
    Then the status code is 200
    And I should see an empty data set



