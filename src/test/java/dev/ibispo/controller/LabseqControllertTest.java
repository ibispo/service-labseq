package dev.ibispo.controller;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class LabseqControllertTest {
	 
	@Test
    public void testHelloEndpoint() {
        given()
          .when().get("/labseq/hello")
          .then()
             .statusCode(200)
             .body(is("Hello my darling Isa!"));
    }

}
