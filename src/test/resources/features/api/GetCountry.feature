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


  Scenario: A response has more than one country retrieved
    Given the country of interest is "united"
    When I make a request to get its details
    Then the status code is 200
    And I should see a total count of 5

  @bug
  Scenario: A request supports xml as a media type
    Given the country of interest is "Nigeria"
    And I request that my response is in xml
    When I make a request to get its details
    Then the status code is 200

  @wip
  Scenario: A request with a media type not supported
    Given the country of interest is "Ghana"
    And I request that my response is in pdf
    When I make a request to get its details
#    returns a 200 as the api defaults to json if not xml.
    Then the status code is 200








