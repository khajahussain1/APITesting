package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import static com.jayway.restassured.RestAssured.*;

public class Get {

	 @Test
	public void testResponceCode() {
		int code = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();


		System.out.println("status code is " + code);
		Assert.assertEquals(code, 200);
	}

	@Test
	public void testbody() {
		
		String data=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		long time=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
	System.out.println("Responce time is "+time);
	}

}
