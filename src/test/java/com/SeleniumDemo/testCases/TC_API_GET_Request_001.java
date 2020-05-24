package com.SeleniumDemo.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_API_GET_Request_001 {

	@Test
	public void getWeatherCondition() {
		Logger logger = LogManager.getLogger();
		try {
			// specify base URI
			RestAssured.baseURI = "https://cat-fact.herokuapp.com/";

			// Create request object to send request to server
			RequestSpecification httprequest = RestAssured.given();

			// Create the response object
			Response response = httprequest.request(Method.GET, "/facts");

			// print response in console window
			// response is in JSON format - need to convert to string
			String responseBody = response.getBody().asString();
			System.out.println("Response Body is:" + responseBody);

			// status code validation from response
			int statusCode = response.getStatusCode();
			Assert.assertEquals(statusCode, 200);
			logger.info("Status Code: " + statusCode);

			// verify status line verification
			String statusLine = response.getStatusLine();
			System.out.println("The Status Line: " + statusLine);
			Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

		} catch (Exception e) {
			logger.error("Exception encountered" + e.getMessage());
		}

	}
}
