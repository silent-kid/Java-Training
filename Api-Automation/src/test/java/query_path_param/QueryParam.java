package query_path_param;

import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParam {
	
	@Test
	public void queryParameters() {
		baseURI = "https://reqres.in/api";
		RequestSpecification request = given();
		
				request.header("X-api-key","reqres_5282e5b946f94eb59c0aa3df95ad459e")
//				.pathParam("resource","users");
	            .queryParam("page", 2);         
	            Response response =
	            request
	                .when()
	                .get("/users");

	        response
	            .then()
	            .statusCode(200)
	            .body("data[4].first_name", equalTo("George"))
	            .body("data.first_name", hasItems("George", "Rachel"))
	            .log().all();

	        Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
}
