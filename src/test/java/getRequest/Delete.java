package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.response.Response;
//import com.jayway.restassured.specification.RequestSpecification;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();

		Response response = request.delete("http://localhost/300/posts");

		int code = response.getStatusCode();

		Assert.assertEquals(code, 200);

	}

}
