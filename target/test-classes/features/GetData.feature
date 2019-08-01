Feature: Rest API testing framework using java rest assured

  @tags
  Scenario: Get Locations
    Given the apis are up and running for "http://cmapi.bananaappscenter.com/"
    When a user performs a get request to "api/Location/LocationDetails"
    And and perform the reqest
    Then the response code should be 200
    # And I should see json response with pairs on the filetered "Msg" node
    #| Message    | Success Location Details |
    #| StatusCode |                      200 |
    #| isError    | false                    |
    #| isSuccess  | true                     |
    Then I should see json response with pairs filetered "[1].pgm" node
      | Country       |              1 |
      | CountryName   | India          |
      | Latitude      |        17.6868 |
      | Location_ID   |              5 |
      | Location_Name | Visakhapatnam  |
      | Longitude     |        83.2185 |
      | State         |              1 |
      | StateName     | Andhra Pradesh |
      | Status        | true           |
