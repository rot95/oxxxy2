package com.versus.oxxxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class WelcomeController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String welcome() {
        return "forward:/static/index.html";
    }

    @RequestMapping(value = "/oxxxy", method = RequestMethod.GET)
    public String sayHelloOxxxy(ModelMap model) {
        model.addAttribute("greeting", "Hi Oxxxy");
        return "welcome.jsp";
    }

}