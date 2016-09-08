package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class StringController {

    @RequestMapping("/")
    public String text() {
        return "I love Travel Port and would love a job";
    }

}
