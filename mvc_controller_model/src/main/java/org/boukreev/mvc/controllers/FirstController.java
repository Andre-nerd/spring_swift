package org.boukreev.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {
    private Logger logger = Logger.getLogger(FirstController.class);

    /** required = false - если параметры не переданы, то заполнит null, если true  - То 400 Bad Request */
    @GetMapping("/hello")
    public String helloPage(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname,
            Model model
    ) {
        System.out.println("hello " + name + " " + surname);
        model.addAttribute("key_message","hello " + name + " " + surname );
        return "first/hello";
    }

    @GetMapping("/calc")
    public String calculatePage(
            @RequestParam(value = "a", required = false) Integer a,
            @RequestParam(value = "b", required = false) Integer b,
            @RequestParam(value = "action", required = false) String action,
            Model model
    ) {
        logger.info("a: " + a + " b: " + b + " action: " + action);
        double result = 0;
        switch (action){
            case "add" -> result = a + b;
            case "div" -> result = (double) a / b;
            case "multi" -> result = a * b;
            case "minus" -> result = a - b;
            default -> result = 0;
        }

        model.addAttribute("key_calc","total: " + result );
        return "first/calculate";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(HttpServletRequest request) {
        String name  = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("hello " + name + " " + surname);
        logger.info("request goodbye name: " +request.getParameter("name"));
        return "first/goodbye";
    }
}
