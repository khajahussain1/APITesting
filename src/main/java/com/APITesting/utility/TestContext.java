package com.APITesting.utility;

import com.APITesting.Managers.APIManager;

public class TestContext {

	private APIManager apiManager = null;

	public TestContext() {

		System.gc();
		apiManager = new APIManager();

	}

	public APIManager getapiManager() {
		return apiManager;
	}

}