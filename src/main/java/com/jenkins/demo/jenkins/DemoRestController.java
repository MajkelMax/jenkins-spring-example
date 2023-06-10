package com.jenkins.demo.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/")
    public String get() {
        return "Hello World";
    }

}
