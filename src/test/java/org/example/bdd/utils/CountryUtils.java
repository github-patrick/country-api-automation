package org.example.bdd.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.bdd.constants.Constants;

import static io.restassured.RestAssured.given;

public class CountryUtils {

    public static Response getCountry(RequestSpecification requestSpecification) {
        requestSpecification.basePath(Constants.COUNTRY_PATH);
        return given()
//                .log().all()
                .spec(requestSpecification).
        when()
                .get().
        then()
                .log().all()
                .extract().response();
    }
}
