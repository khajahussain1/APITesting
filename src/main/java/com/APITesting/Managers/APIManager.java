package com.APITesting.Managers;

import com.APITesting.MethodImplimentation.GetRequestMethods;
import com.APITesting.MethodImplimentation.PostRequestMethods;

public class APIManager {

	private GetRequestMethods getRequestMethods;

	private PostRequestMethods postRequestMethods;

	public GetRequestMethods getRequestMethods() {
		if (getRequestMethods == null) {
			getRequestMethods = new GetRequestMethods();
		}
		return getRequestMethods;
	}

	public PostRequestMethods getpostRequestMethods() {
		if (postRequestMethods == null) {
			postRequestMethods = new PostRequestMethods();
		}
		return postRequestMethods;
	}

}
