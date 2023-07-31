package org.boukreev.mvc_first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Neil Alishev
 */
@Controller
public class HelloController {

//    @GetMapping("/hello.html-world")
//    public String sayHello() {
//        return "hello_world";
//    }
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }

    @GetMapping("/hello")
    public String sayJustHello() {
        return "hello";
    }
}
