package com.p1;

import com.p1.HelloWorldEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public HelloWorldEntity sayHello() {
        HelloWorldEntity helloWorldEntity = new HelloWorldEntity("Hello, World!");
        return helloWorldEntity;
    }
}