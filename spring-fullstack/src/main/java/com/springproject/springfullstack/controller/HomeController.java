package com.springproject.springfullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


// Marks class as a controller where every method returns a domain object instead of a view
@Controller
// This class handles the API for the home screen
public class HomeController {

    // Redirects the default URL to the home page URL
    @RequestMapping("/")
    public String homePage(Model model) {
        return "home";
    }
}
