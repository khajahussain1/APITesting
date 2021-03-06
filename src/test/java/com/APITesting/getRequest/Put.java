package com.APITesting.getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.response.Response;
//import com.jayway.restassured.specification.RequestSpecification;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();

		json.put("id", "25");

		json.put("title", "Selenium webdriver");
		json.put("authour", "khaja");

		request.body(json.toJSONString());

		Response response = request.put("http://localhost/300/delete");

		int code = response.getStatusCode();

		Assert.assertEquals(code, 200);


	}

}
