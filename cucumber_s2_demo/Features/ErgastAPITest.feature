Feature: Testing Ergast Developer API for 2018 Racers Data

  Scenario: Verify the GET request for 2018 racers data
    Given the API base URL is "http://ergast.com/api/f1/2018/circuits.json"
    When a GET request is sent
    Then the response status code should be 200
    And the response body should not be empty
