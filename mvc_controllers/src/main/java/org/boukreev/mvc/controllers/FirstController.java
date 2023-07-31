package org.boukreev.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
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
            @RequestParam(value = "surname", required = false) String surname
    ) {
        System.out.println("hello " + name + " " + surname);
        return "first/hello";
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
