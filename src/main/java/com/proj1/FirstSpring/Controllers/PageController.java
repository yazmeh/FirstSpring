package com.proj1.FirstSpring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @GetMapping("/home")
    public String homePage(@RequestParam(name = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "homePage";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}