package com.proj1.FirstSpring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjController
 */
@RestController
public class ProjController {
    public ProjController() {
        System.out.println("Project");
    }

    @GetMapping("/")
    public String hello() {
        return "<h1>Hello world</h1>";
    }

    @GetMapping("/testparam")
    public String testRequest(@RequestParam(value = "name", defaultValue = "testing") String name) {
        return "Hello world " + name;
    }

    @RequestMapping(value = "{path:.*}")
    public String testRequest() {
        return "Not found";
    }
}