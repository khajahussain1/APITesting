package com.APITesting.stepdefination;

import com.APITesting.MethodImplimentation.GetJobMethods;
import io.cucumber.java.en.Given;

public class JetJobSteps {

    GetJobMethods getJobMethods = new GetJobMethods();


    @Given("new job is created with status code {int}.")
    public void new_job_is_created_with_status_code(Integer getstatus_code) {
        getJobMethods.new_job_is_created_with_status_code(getstatus_code);

    }

    @Given("verify new job")
    public void verify_new_job() {

    }

}
