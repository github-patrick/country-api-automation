package org.example.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class BasicController {

    @RequestMapping(value = "/welcome")
    @ResponseBody
    public String welcome(@RequestHeader Map<String,String> headers,
                          @RequestParam(required = true) String name) {
        String value = headers.get(HttpHeaders.ACCEPT_LANGUAGE);
        if (name.length() > 0) {
            System.out.println("hello " +name);
        }
        return "Welcome to Spring MVC";
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public String handleExceptionForSpecificController() {
        return "Exception thrown by Exception handler";
    }
}
