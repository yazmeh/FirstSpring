package com.proj1.FirstSpring.Controllers;

import com.proj1.FirstSpring.Service.GreetingService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreetingController
 */
@RestController
public class GreetingController {

    private static long counter = 1;
    private final String template = "Hello %s";

    @RequestMapping("/greetings")
    public GreetingService greeting(@RequestParam(value = "name", defaultValue = "John Doe") String name) {
        return new GreetingService(GreetingController.counter++, String.format(template, name));
    }

}