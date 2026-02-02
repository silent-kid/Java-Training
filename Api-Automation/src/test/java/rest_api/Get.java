package rest_api;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Get {
	@Test(enabled = false)
	public void getUsers() {
		baseURI = "https://reqres.in/api";

		given().header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e").get("/users?page=2").then()
				.statusCode(200).log().all();
	}

	@Test(enabled = false)
	public void getSingleUser() {

		baseURI = "https://reqres.in/api";

		given().header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e").when().get("/users/2").then()
				.statusCode(200).log().all();
	}

	@Test
	public void usingRequestSpecification() {

		baseURI = "https://reqres.in/api";

		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e");
		httpRequest.queryParam("page", 2);

		Response response = httpRequest.get("/users");

		System.out.println(response.asPrettyString());

		response.then().statusCode(200);
	}

	@Test
	public void validateUserEmail() {

		baseURI = "https://reqres.in/api";

		given().header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e").when().get("/users/2").then()
				.statusCode(200).body("data.email", equalTo("janet.weaver@reqres.in"))
				.body("data.first_name", equalTo("Janet")).log().all();
	}

}
