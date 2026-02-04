package rest_api;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Post {

	@Test
	public void createUser() {

		baseURI = "https://reqres.in/api";

		String requestBody = "{\n" + "  \"name\": \"Jawwad\",\n" + "  \"job\": \"Test Engineer\"\n" + "}";

		given().header("Content-Type", "application/json")
				.header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e").body(requestBody).when().post("/users")
				.then().statusCode(201).log().all();
	}

}
