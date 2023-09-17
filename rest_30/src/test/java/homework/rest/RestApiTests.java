package homework.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class RestApiTests {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @Test
    public void testGetUser() {
        Response response = get("api/users/1");
        response.prettyPrint();
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testCreateUser() {
        String requestBody = "{\"name\": \"John\", \"job\": \"developer\"}";
        Response response = given()
                .contentType("application/json")
                .body(requestBody)
                .post("api/users");

        assertEquals(201, response.getStatusCode());
        response.prettyPrint();

        int userId = response.getBody().jsonPath().getInt("id");

        assertNotEquals(0, userId);
    }

    @Test
    public void testUpdateUser() {
        String requestBody = "{\"name\": \"Updated Name\"}";
        Response response = given()
                .contentType("application/json")
                .body(requestBody)
                .put("api/users/1");


        assertEquals(200, response.getStatusCode());
        response.prettyPrint();

    }
    @Test
    public void testListOfUsers() {
        Response response = get("api/users?page=2");

        assertEquals(200, response.getStatusCode());
        response.prettyPrint();

        List<Map<String, Object>> users = response.getBody().jsonPath().getList("data");

        assertNotNull(users);
        assertFalse(users.isEmpty());

        for (Map<String, Object> user : users) {
            assertTrue(user.containsKey("id"));
            assertNotNull(user.get("id"));
        }
    }
}
