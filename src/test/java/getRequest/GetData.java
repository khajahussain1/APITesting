package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.response.Response;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	//@Test
	public void testResponceCode() {
		Response rp = RestAssured.get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code = rp.getStatusCode();

		System.out.println(rp);

		System.out.println("status code is " + code);
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testbody() {
		Response rp = RestAssured.get(
				"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data = rp.asString();


		System.out.println("data is " + data);
		System.out.println("responce time is "+rp.getTime());
		//Assert.assertEquals(code, 200);
	}


}
