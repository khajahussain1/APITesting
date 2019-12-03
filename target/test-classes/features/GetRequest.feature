Feature: Rest API testing framework using java rest assured

  @tags
  Scenario: Get Locations
    #Given the apis are up and running for "http://cmapi.bananaappscenter.com/"
    #When a user performs a get request to "api/Location/LocationDetails"
    Given the apis are up and running for "https://samples.openweathermap.org/"
    When a user performs a get request to "data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22"
    And and perform the reqest
    Then the response code should be 200
    #And I should see json response with pairs on the filetered "Msg" node
    #| Message    | Success Location Details |
    #| StatusCode |                      200 |
    #| isError    | false                    |
    #| isSuccess  | true                     |
    Then I should see json response with pairs filetered "main" node
      | temp     | 280.32 |
      | pressure |   1012 |
      | humidity |     81 |
      | temp_min | 279.15 |
      | temp_max | 281.15 |

  
