package org.example.bdd.utils;

import io.restassured.path.json.JsonPath;

public class RestUtils {

    public static JsonPath getJsonPath(String text) {
        return new JsonPath(text);
    }
}
