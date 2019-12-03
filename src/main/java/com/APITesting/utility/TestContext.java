package com.APITesting.utility;

import com.APITesting.Managers.APIManager;

public class TestContext {

	private APIManager methodImplimentationManager = null;

	public TestContext() {

		System.gc();
		methodImplimentationManager = new APIManager();

	}

	public APIManager getMethodImplimentationManager() {
		System.out.println("started PageObjectManager object");
		return methodImplimentationManager;
	}

}