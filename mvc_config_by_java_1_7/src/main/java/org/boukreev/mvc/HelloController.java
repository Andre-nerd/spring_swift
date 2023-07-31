package org.boukreev.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }

    @GetMapping("/hello")
    public String sayJustHello() {
        return "hello";
    }
}
