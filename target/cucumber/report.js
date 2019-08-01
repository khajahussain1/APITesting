$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GetData.feature");
formatter.feature({
  "line": 1,
  "name": "Rest API testing framework using java rest assu",
  "description": "",
  "id": "rest-api-testing-framework-using-java-rest-assu",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Simple init",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "set basic web application url is \"https://samples.openweathermap.org/data/2.5/weather?q\u003dLondon,uk\u0026appid\u003db6907d289e10d714a6e88b30761fae22\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.simple_init()"
});
formatter.result({
  "duration": 4746828131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://samples.openweathermap.org/data/2.5/weather?q\u003dLondon,uk\u0026appid\u003db6907d289e10d714a6e88b30761fae22",
      "offset": 34
    }
  ],
  "location": "Stepdefination.set_basic_web_application_url_is(String)"
});
formatter.result({
  "duration": 2079005437,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Get request examples",
  "description": "",
  "id": "rest-api-testing-framework-using-java-rest-assu;get-request-examples",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Set Get api end point",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Set Header param request content type as \"application/json\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.set_Get_api_end_point()"
});
formatter.result({
  "duration": 29073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "application/json",
      "offset": 42
    }
  ],
  "location": "Stepdefination.set_Header_param_request_content_type_as(String)"
});
formatter.result({
  "duration": 91752,
  "status": "passed"
});
});