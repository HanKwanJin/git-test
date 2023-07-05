package dev.be.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/one")
    public String featureOne() {
        return "git-test";
    }
}
