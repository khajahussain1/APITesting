package com.APITesting.utility;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Common_Methods {

    public static RequestSpecification request;

    /*public static RequestSpecification request()
    {
        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
        request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Authorization", "Bearer"+ConfigReader.getBererToken());


    }

    public static Response getGet() {

        //return RequestSpecification(ConfigReader.getBererToken()).body()
    }
*/
}
