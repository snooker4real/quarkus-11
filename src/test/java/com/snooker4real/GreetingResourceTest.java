package com.snooker4real;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {

    @RestClient
    @InjectMock
    GreetingService service;
    @Test
    void testHelloEndpoint() {
        Mockito.when(service.remoteHello()).thenReturn("Hello from Quarkus facile");

        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus facile"));
    }

}