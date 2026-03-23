package com.APITesting.MethodImplimentation;

import com.APITesting.apiclasses.ResponseHolder;
import com.APITesting.utility.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.util.logging.Logger;


public class GetJobMethods {

    private final String serviceURL = ConfigReader.gethosturl();

    ResponseHolder ResponseHolder;
    Response response;
    RequestSpecification request;
    //public Logger logger = Logger.getLogger(GetJobMethods.class);

    public GetJobMethods()
    {
        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
        request = RestAssured.given();
        request.header("Authorization", "Bearer"+ConfigReader.getBererToken());
        request.header("Content-Type", "application/json");
    }

    public void new_job_is_created_with_status_code(int get_status_code){

        response =request.get(ConfigReader.gethosturl()+ConfigReader.getEndPontURL());
        Assert.assertEquals(response.getStatusCode(), get_status_code);

    }




}
