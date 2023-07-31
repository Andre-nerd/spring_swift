package org.boukreev.mvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    private Logger logger = Logger.getLogger(SecondController.class);
    @GetMapping("exit")
    public String exit(){
        return "second/exit";
    }
}
