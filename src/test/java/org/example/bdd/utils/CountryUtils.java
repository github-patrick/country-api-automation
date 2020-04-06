package org.example.bdd.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.example.bdd.ApiContext;
import org.example.bdd.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;

public class CountryUtils {

    private static Logger log = LoggerFactory.getLogger(ApiContext.class);

    public static Response getCountry(RequestSpecification requestSpecification) {

        log.info("Making a request to get a country");
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
