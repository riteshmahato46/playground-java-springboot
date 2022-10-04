package com.prototype.playground.controllers;

import com.prototype.playground.PlaygroundConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(PlaygroundConstants.HOME_REST_ENDPOINT)
    public String Home()
    {
        return "Hello Home Boi";
    }
}