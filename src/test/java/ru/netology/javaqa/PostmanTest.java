package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanTest {
    @Test
    void testPostRequestBody() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("0")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo ("0"))
        ;
    }
}