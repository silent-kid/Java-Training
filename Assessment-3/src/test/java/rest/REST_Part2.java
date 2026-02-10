package rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class REST_Part2 {
	
	
    static String baseUri = "https://reqres.in";
    @DataProvider(name = "userIds")
    public Object[][] userIds() {
        return new Object[][]{{1},{2},{3}};
    }
    
    @Test(dataProvider = "userIds")
    public void test_Ids(int userId) {
    	Response response = RestAssured.given()
                .baseUri(baseUri)
                .header("X-api-key", "reqres_5282e5b946f94eb59c0aa3df95ad459e")
                .basePath("/api/users/{id}")
                .pathParam("id", userId)
                .when()
                .get();
    	
        Assert.assertEquals(response.statusCode(), 200, "Error");
        Assert.assertTrue(response.body().asString().contains("data"),"No data found");
    }
    

}
