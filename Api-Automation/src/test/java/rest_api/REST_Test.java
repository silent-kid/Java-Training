package rest_api;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
public class REST_Test {
	@Test
	public void test_get() {
		baseURI = "https://reqres.in/api";
		
		given().header("X-api-key","reqres_5282e5b946f94eb59c0aa3df95ad459e").get("/users?page=2").then().statusCode(200).log().all();
	}
}
