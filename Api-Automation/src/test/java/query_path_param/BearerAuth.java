package query_path_param;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BearerAuth {
	@Test
	public void test2() {
		baseURI = "https://api.github.com";
		basePath = "/users/silent-kid/repos";
		RequestSpecification reqspec = given();
		reqspec.header("Authorization","Bearer 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");
		
		Response res = reqspec.get();
		
		JsonPath jsonpath = res.jsonPath();
		String reposname = jsonpath.getString("name");
		
		System.out.print(jsonpath);
		System.out.print(reposname);
		Assert.assertEquals(res.statusCode(), 200);
		}
}
