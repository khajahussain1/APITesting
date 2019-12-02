package com.apiclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	 @Test
	public void responsecode() {
		 Response rp = RestAssured.get(
		 "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		 int code = rp.getStatusCode();
		 String data = rp.prettyPrint();
		 System.out.println(data);
		/*Response rp = RestAssured.get("http://localhost:3000/db");
		int code = rp.getStatusCode();
		String data = rp.asString();
		System.out.println(data);*/

		System.out.println("status code is " + code);
		Assert.assertEquals(code, 200);
	}

	//@Test
	public void testbody() {
		Response rp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employee/1");
		String data = rp.prettyPrint();
		
//responseBody = response.body().prettyPrint().toString();
		System.out.println("data is " + data);
		System.out.println("responce time is " + rp.getTime());
	}

}
