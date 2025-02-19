package ru.andreyszdlv.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String get(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

}
