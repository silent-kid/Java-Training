package rest_api;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Patch {

	@Test
	public void update_user_patch() {

		// Base URI
		baseURI = "https://reqres.in/api";

		// Create JSON object (partial update)
		JSONObject requestBody = new JSONObject();
		requestBody.put("job", "Lead Tester");

		Response response = given().header("Content-Type", "application/json")
				.header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e").body(requestBody.toString()).when()
				.patch("/users/2").then().statusCode(200).log().all().extract().response();

		// Assertion
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
