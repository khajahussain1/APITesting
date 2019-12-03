@tag
Feature: Perform the post request

  Scenario: Check the movie details
    Given the apis are up and running for "http://cmapi.bananaappscenter.com/"
    When a user performs a post request to "api/MovieBooking/MovieBooking" with below details
      | Mov_ID      | 3 |
      | Location_ID | 5 |
    And and perform the post reqest
    Then the response code should be 200
    Then I should see json response with pairs filetered "main" node
      | temp     | 280.32 |
      | pressure |   1012 |
      | humidity |     81 |
      | temp_min | 279.15 |
      | temp_max | 281.15 |
