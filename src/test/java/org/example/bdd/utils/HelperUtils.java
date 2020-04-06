package org.example.bdd.utils;

import io.restassured.response.Response;
import org.example.bdd.dtos.CountryDto;
import org.example.bdd.dtos.CountrySpecificDto;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class HelperUtils {

    public static void assertOnObject(Response response) {
        CountryDto countryDto = response.then().extract().body().as(CountryDto.class);
        CountrySpecificDto countryDto1 = countryDto.getResponse().stream().findFirst().get();
        assertNotNull(countryDto1);

    }
}
