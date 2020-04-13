package org.example.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// Controller advices are applied across all controllers in this application or spring container context.
@ControllerAdvice
public class BasicControllerAdvice {

    private Log logger = LogFactory.getLog(BasicControllerAdvice.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleRuntimeExceptions(HttpRequest request, Exception ex) {
        logger.error(ex.getCause());
        logger.error(request.getURI());
        return "This was triggered";
    }
}
