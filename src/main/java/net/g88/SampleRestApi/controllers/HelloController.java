package net.g88.SampleRestApi.controllers;


import net.g88.SampleRestApi.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author rpilachowski
 */
@Controller
@RequestMapping(value = "/api/v1/hello")
public class HelloController {
    public HelloController() {

    }

    /**
     * Returns a greeting
     *
     * @param request the request object
     * @return a greeting
     */
    @RequestMapping(method = RequestMethod.GET, produces = {"application/json", "application/xml"})
    public @ResponseBody ResponseEntity greeting(HttpServletRequest request) {
        Greeting greeting = new Greeting();

        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
