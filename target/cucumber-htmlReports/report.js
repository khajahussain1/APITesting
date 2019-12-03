$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GetRequest.feature");
formatter.feature({
  "line": 1,
  "name": "Rest API testing framework using java rest assured",
  "description": "",
  "id": "rest-api-testing-framework-using-java-rest-assured",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24202190,
  "status": "passed"
});
formatter.before({
  "duration": 72496,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Get Locations",
  "description": "",
  "id": "rest-api-testing-framework-using-java-rest-assured;get-locations",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tags"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#Given the apis are up and running for \"http://cmapi.bananaappscenter.com/\""
    },
    {
      "line": 6,
      "value": "#When a user performs a get request to \"api/Location/LocationDetails\""
    }
  ],
  "line": 7,
  "name": "the apis are up and running for \"https://samples.openweathermap.org/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "a user performs a get request to \"data/2.5/weather?q\u003dLondon,uk\u0026appid\u003db6907d289e10d714a6e88b30761fae22\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "and perform the reqest",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the response code should be 200",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#And I should see json response with pairs on the filetered \"Msg\" node"
    },
    {
      "line": 12,
      "value": "#| Message    | Success Location Details |"
    },
    {
      "line": 13,
      "value": "#| StatusCode |                      200 |"
    },
    {
      "line": 14,
      "value": "#| isError    | false                    |"
    },
    {
      "line": 15,
      "value": "#| isSuccess  | true                     |"
    }
  ],
  "line": 16,
  "name": "I should see json response with pairs filetered \"main\" node",
  "rows": [
    {
      "cells": [
        "temp",
        "280.32"
      ],
      "line": 17
    },
    {
      "cells": [
        "pressure",
        "1012"
      ],
      "line": 18
    },
    {
      "cells": [
        "humidity",
        "81"
      ],
      "line": 19
    },
    {
      "cells": [
        "temp_min",
        "279.15"
      ],
      "line": 20
    },
    {
      "cells": [
        "temp_max",
        "281.15"
      ],
      "line": 21
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://samples.openweathermap.org/",
      "offset": 33
    }
  ],
  "location": "GetRequestSteps.the_apis_are_up_and_running_for(String)"
});
formatter.result({
  "duration": 4011346688,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "data/2.5/weather?q\u003dLondon,uk\u0026appid\u003db6907d289e10d714a6e88b30761fae22",
      "offset": 34
    }
  ],
  "location": "GetRequestSteps.a_user_performs_a_get_request_to(String)"
});
formatter.result({
  "duration": 182750,
  "status": "passed"
});
formatter.match({
  "location": "GetRequestSteps.and_perform_the_reqest()"
});
formatter.result({
  "duration": 1796696392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 28
    }
  ],
  "location": "GetRequestSteps.the_response_code_should_be(int)"
});
formatter.result({
  "duration": 1182584,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "main",
      "offset": 49
    }
  ],
  "location": "GetRequestSteps.i_should_see_json_response_with_pairs_filetered_node(String,DataTable)"
});
formatter.result({
  "duration": 2488350114,
  "status": "passed"
});
formatter.after({
  "duration": 97793,
  "status": "passed"
});
formatter.after({
  "duration": 59658,
  "status": "passed"
});
formatter.after({
  "duration": 15103,
  "status": "passed"
});
});