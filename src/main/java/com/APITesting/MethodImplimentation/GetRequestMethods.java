package com.APITesting.MethodImplimentation;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectReader;
import org.testng.Assert;

import com.APITesting.TestBase.TestBase;
import com.APITesting.apiclasses.ResponseHolder;

import cucumber.api.DataTable;
import gherkin.formatter.model.DataTableRow;
import io.restassured.response.Response;

public class GetRequestMethods {

	TestBase testBase;
	String url;
	String lastName;
	ResponseHolder responseHolder;
	Response response;
	private String TOKEN;
	Map<String, Object> responseMap;
	Map<String, Object> query;
	Map<String, String> body;

	public GetRequestMethods() {
		testBase = new TestBase();

	}

	public void apisAreUpAndRunning(String url) {

		this.url = url;

		response = given().when().get(url);

		Assert.assertEquals(response.getStatusCode(), 200);

		System.out.println("response.getStatusCode:- " + response.getStatusCode());
	}

	public void userPerformsGetRequest(String api_url) {

		this.url = this.url + api_url;

	}

	public void performTheGetReqest() throws InterruptedException {

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

		System.out.println("URL:- " + this.url + query);

		if (query == null) {
			// RestAssured.defaultParser = Parser.JSON;

			/*
			 * response = given().headers("Content-Type", ContentType.JSON, "Accept",
			 * ContentType.JSON).when()
			 * .get(this.url).then().contentType(ContentType.JSON).extract().response();
			 */

			response = given().when().get(this.url);

			String data = response.body().prettyPrint();

			// System.out.println("Response of API is :- " + data);

		} else {
			response = given().queryParams(query).when().get(this.url);
		}

		ResponseHolder.setResponse(response);
	}

	public void responseCodeShouldBe(int responseCode) {

		Assert.assertEquals(responseCode, ResponseHolder.getResponseCode());
	}

	@SuppressWarnings("unchecked")
	public void shouldSeeJsonResponseWithPairsFileteredNode(String filter, DataTable tables) throws Throwable {

		query = new LinkedHashMap<String, Object>();

		for (DataTableRow row : tables.getGherkinRows()) {
			query.put(row.getCells().get(0), row.getCells().get(1));

			// System.out.println(row.getCells().get(0) + "-->" + row.getCells().get(1));

		}
		/*
		 * JsonPath jsonPathValidator = response.jsonPath();
		 * System.out.println("jsonPathValidator:-"+jsonPathValidator.prettyPrint());
		 */

		ObjectReader reader = new ObjectMapper().reader(Map.class);

		responseMap = reader.readValue(ResponseHolder.getResponseBody());

		//Thread.sleep(1000);
		testBase.WaiteForApi();

		System.out.println("responseMap:--" + responseMap.toString());
		Map<String, Object> responseMaps = (Map<String, Object>) responseMap.get(filter);

		testBase.WaiteForApi();
		//Thread.sleep(1000);
		System.out.print("responseMaps body is:-  " + responseMaps);

		for (String key : query.keySet()) {
			/*
			 * System.out.println(query.get(key));
			 * System.out.println(responseMaps.get(key).toString());
			 */
			Assert.assertTrue(responseMaps.containsKey(key));
			Assert.assertEquals(query.get(key), responseMaps.get(key).toString());

		}

	}

	@SuppressWarnings("unchecked")
	public void ShouldSeeJsonResponseWithPairsOnTheFileteredNode(String filter, DataTable dataTable)
			throws JsonProcessingException, IOException {

		Map<String, Object> query = new LinkedHashMap<String, Object>();

		for (DataTableRow row : dataTable.getGherkinRows()) {
			query.put(row.getCells().get(0), row.getCells().get(1));

		}

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
		}

	}

	@SuppressWarnings("unchecked")
	public void ShouldeSeeJsonResponseWithPairsOnTheFileteredNode(String filters, DataTable dataTable)
			throws Throwable {

		Map<String, Object> query1 = new LinkedHashMap<String, Object>();

		for (DataTableRow row : dataTable.getGherkinRows()) {
			query1.put(row.getCells().get(0), row.getCells().get(1));
			// System.out.println(row.getCells().get(0)+"-->"+ row.getCells().get(1));

		}

		// System.out.println(query);

		ObjectReader reader = new ObjectMapper().reader(Map.class);

		responseMap = reader.readValue(ResponseHolder.getResponseBody());

		responseMap = (Map<String, Object>) responseMap.get(filters);

		System.out.println(responseMap);

		for (String key : query1.keySet()) {
			// System.out.println(query.get(key));
			System.out.println(responseMap.get(key).toString());
			Assert.assertTrue(responseMap.containsKey(key));
			Assert.assertEquals(query1.get(key), responseMap.get(key).toString());
		}
	}

}
