package com.APITesting.stepdefination;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectReader;
import org.testng.Assert;

import com.APITesting.MethodImplimentation.GetRequestMethods;
import com.APITesting.apiclasses.ResponseHolder;
import com.APITesting.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequestSteps

{
	String url;
	String lastName;
	ResponseHolder responseHolder;
	Response response;
	private String TOKEN;
	Map<String, Object> responseMap;
	Map<String, Object> query;
	Map<String, String> body;

	TestContext testContext;
	GetRequestMethods getRequestMethods;

	public GetRequestSteps(TestContext context) {
		testContext = context;
		getRequestMethods = testContext.getapiManager().getRequestMethods();
	}

	@Given("^the apis are up and running for \"([^\"]*)\"$")
	public void the_apis_are_up_and_running_for(String url) {

		getRequestMethods.apisAreUpAndRunning(url);

		/*
		 * this.url = url;
		 * 
		 * response = given().when().get(url);
		 * 
		 * Assert.assertEquals(response.getStatusCode(), 200);
		 * 
		 * System.out.println("response.getStatusCode:- "+response.getStatusCode());
		 */
	}

	@When("^a user performs a get request to \"([^\"]*)\"$")
	public void a_user_performs_a_get_request_to(String api_url) {

		getRequestMethods.userPerformsGetRequest(api_url);

		// this.url = this.url + api_url;

	}

	@SuppressWarnings("deprecation")
	@When("^and perform the reqest$")
	public void and_perform_the_reqest() throws InterruptedException {
		getRequestMethods.performTheGetReqest();

		// response = given().contentType(ContentType.JSON).when().get(this.url);
		//
		// String data = response.asString();
		//
		// System.out.println(data);

		/*
		 * RestAssured.defaultParser = Parser.JSON;
		 * 
		 * return given().headers("Content-Type", ContentType.JSON, "Accept",
		 * ContentType.JSON). when().get(endpoint).
		 * then().contentType(ContentType.JSON).extract().response();
		 */
		/*
		 * RestAssured.baseURI =
		 * "http://localhost:8080/api/activity/getActivity/0000000001";
		 * RequestSpecification httpRequest = RestAssured.given(); Response response =
		 * httpRequest.get("/Hyderabad");
		 * 
		 * // Retrieve the body of the Response ResponseBody body = response.getBody();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * // By using the ResponseBody.asString() method, we can convert the body //
		 * into the string representation. System.out.println("Response Body is: " +
		 * body.asString());
		 */

		/*
		 * System.out.println("URL:- "+this.url + query);
		 * 
		 * if (query == null) { // RestAssured.defaultParser = Parser.JSON;
		 * 
		 * response = given().headers("Content-Type", ContentType.JSON, "Accept",
		 * ContentType.JSON).when()
		 * .get(this.url).then().contentType(ContentType.JSON).extract().response();
		 * 
		 * response = given().when().get(this.url);
		 * 
		 * String data = response.body().prettyPrint();
		 * 
		 * //System.out.println("Response of API is :- " + data);
		 * 
		 * } else { response = given().queryParams(query).when().get(this.url); }
		 * 
		 * ResponseHolder.setResponse(response);
		 */
	}

	@Then("^the response code should be (\\d+)$")
	public void the_response_code_should_be(int responseCode) {

		getRequestMethods.responseCodeShouldBe(responseCode);
		// Assert.assertEquals(responseCode, ResponseHolder.getResponseCode());
	}

	@Then("^I should see json response with pairs on the filetered \"([^\"]*)\" node$")
	public void i_should_see_json_response_with_pairs_on_the_filetered_node(String filter, DataTable dataTable)
			throws Throwable {
		getRequestMethods.ShouldeSeeJsonResponseWithPairsOnTheFileteredNode(filter, dataTable);

		/*Map<String, Object> query = new LinkedHashMap<String, Object>();

		// query = new LinkedHashMap<String, Object>();

		for (DataTableRow row : dataTable.getGherkinRows()) {
			query.put(row.getCells().get(0), row.getCells().get(1));

		}

		// System.out.println(query);

		ObjectReader reader = new ObjectMapper().reader(Map.class);

		responseMap = reader.readValue(ResponseHolder.getResponseBody());

		System.out.println("responseMap:- " + responseMap);

		responseMap = (Map<String, Object>) responseMap.get(filter);
		System.out.println("responseMap:-..." + responseMap);

		for (String key : query.keySet()) {
			// System.out.println(query.get(key));
			// System.out.println(responseMap.get(key).toString());
			Assert.assertTrue(responseMap.containsKey(key));
			Assert.assertEquals(query.get(key), responseMap.get(key).toString());
		}*/

	}

	@Then("^I shoulde see json response with pairs on the filetered \"([^\"]*)\" node$")
	public void i_shoulde_see_json_response_with_pairs_on_the_filetered_node(String filters, DataTable dataTable)
			throws Throwable {
		getRequestMethods.shouldSeeJsonResponseWithPairsFileteredNode(filters, dataTable);

		/*Map<String, Object> query1 = new LinkedHashMap<String, Object>();

		// query = new LinkedHashMap<String, Object>();

		for (DataTableRow row : dataTable.getGherkinRows()) {
			query1.put(row.getCells().get(0), row.getCells().get(1));
			// System.out.println(row.getCells().get(0)+"-->"+ row.getCells().get(1));

		}

		// System.out.println(query);

		ObjectReader reader = new ObjectMapper().reader(Map.class);

		responseMap = reader.readValue(ResponseHolder.getResponseBody());

		// System.out.println("welcome to hyd");
		// System.out.println(responseMap);

		responseMap = (Map<String, Object>) responseMap.get(filters);

		System.out.println(responseMap);

		for (String key : query1.keySet()) {
			// System.out.println(query.get(key));
			System.out.println(responseMap.get(key).toString());
			Assert.assertTrue(responseMap.containsKey(key));
			Assert.assertEquals(query1.get(key), responseMap.get(key).toString());
		}*/
	}

	@SuppressWarnings("unchecked")
	@Then("^I should see json response with pairs filetered \"([^\"]*)\" node$")
	public void i_should_see_json_response_with_pairs_filetered_node(String filter, DataTable tables) throws Throwable {

		getRequestMethods.shouldSeeJsonResponseWithPairsFileteredNode(filter, tables);
		/*
		 * query = new LinkedHashMap<String, Object>();
		 * 
		 * // query = new LinkedHashMap<String, Object>();
		 * 
		 * for (DataTableRow row : tables.getGherkinRows()) {
		 * query.put(row.getCells().get(0), row.getCells().get(1));
		 * 
		 * //System.out.println(row.getCells().get(0) + "-->" + row.getCells().get(1));
		 * 
		 * } JsonPath jsonPathValidator = response.jsonPath();
		 * System.out.println("jsonPathValidator:-"+jsonPathValidator.prettyPrint());
		 * 
		 * 
		 * ObjectReader reader = new ObjectMapper().reader(Map.class);
		 * 
		 * responseMap = reader.readValue(ResponseHolder.getResponseBody());
		 * 
		 * Thread.sleep(1000);
		 * 
		 * System.out.println("responseMap:--"+responseMap.toString()); Map<String,
		 * Object> responseMaps = (Map<String, Object>) responseMap.get(filter);
		 * 
		 * 
		 * Thread.sleep(1000);
		 * System.out.print("responseMaps body is:-  "+responseMaps);
		 * 
		 * for (String key : query.keySet()) { System.out.println(query.get(key));
		 * System.out.println(responseMaps.get(key).toString());
		 * Assert.assertTrue(responseMaps.containsKey(key));
		 * Assert.assertEquals(query.get(key), responseMaps.get(key).toString());
		 * //System.out.println("query.get(key), responseMaps.get(key).toString():-"
		 * +query.get(key)+"-->"+ responseMaps.get(key).toString()); }
		 */
	}

	// @When("^a user post a request to \"([^\"]*)\"$")
	// public void a_user_post_a_request_to(String api_url) {
	//
	// this.url = this.url + api_url;
	// }

	// @When("^I add the following filters$")
	// public void I_add_the_following_filters(DataTable dataTable) {
	//
	// query = new LinkedHashMap<String, String>();
	//
	// for(DataTableRow row : dataTable.getGherkinRows())
	// {
	// query.put(row.getCells().get(0), row.getCells().get(1));
	//
	// }
	// }

	@When("^a user performs a post request to \"([^\"]*)\" with below details$")
	public void a_user_performs_a_post_request_to_with_below_details(String api_url, DataTable dataTable) {

		this.url = this.url + api_url;
		this.body = new LinkedHashMap<String, String>();

		for (DataTableRow row : dataTable.getGherkinRows()) {
			this.body.put(row.getCells().get(0), row.getCells().get(1));

		}

		response = given().contentType(ContentType.JSON).body(body).when().post(this.url);
		ResponseHolder.setResponse(response);
	}

	@When("^and perform the post reqest$")
	public void and_perform_the_post_reqest() throws Throwable {
		response = given().contentType(ContentType.JSON).body(this.body).when().post(this.url);
		ResponseHolder.setResponse(response);

	}

}
