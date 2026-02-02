package rest_api;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Delete {
	@Test
	public void deleteWithHeaders() {

		baseURI = "https://reqres.in/api";

		given().header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e").header("Accept", "application/json")
				.when().delete("/users/2").then().statusCode(204);
	}

}
