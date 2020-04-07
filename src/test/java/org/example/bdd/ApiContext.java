package org.example.bdd;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiContext {

    public ApiContext(RequestSpecBuilder requestSpecBuilder) {
        this.requestSpecBuilder = requestSpecBuilder;
    }

    private RequestSpecBuilder requestSpecBuilder;
    private Response response;
}
