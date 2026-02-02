package rest_api;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {

    @Test
    public void putUser() {

        baseURI = "https://reqres.in/api";

        RequestSpecification request = given();

        request.header("Content-Type", "application/json").header("X-api-key","reqres_5282e5b946f94eb59c0aa3df95ad459e");

        Map<String, String> body = new HashMap<>();
        body.put("name", "Jawwad");
        body.put("job", "QA Manager");

        request.body(body);

        Response response = request.put("/users/2");

        response.then().statusCode(200);

        System.out.println(response.asPrettyString());
    }
    
    @Test
    public void putUsingJSONObject() {

        baseURI = "https://reqres.in/api";

        JSONObject json = new JSONObject();
        json.put("name", "Jawwad");
        json.put("job", "QA Manager");

        given()
            .header("Content-Type", "application/json")
            .body(json.toString())
        .when()
            .put("/users/2")
        .then()
            .statusCode(200)
            .log().all();
    }

}
