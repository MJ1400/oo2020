package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebAppController {
    float sum;
    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "message", defaultValue = "World") String message, Model model) {
        model.addAttribute("condition", false);
        model.addAttribute("message", "Hello " + message);
        return "hello";
    }

    @GetMapping("/calc")
    //@RequestMapping(value = "/calc", method = RequestMethod.GET)
    public String calculate(@RequestParam(value = "n1", defaultValue = "0") int num1, 
                            @RequestParam(value = "n2", defaultValue = "0") int num2,
                            @RequestParam(value = "op", defaultValue = "*") String operator, Model model) {
        
        model.addAttribute("condition", true);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("op", operator);

        if(operator.equals("/")){
            sum = (float) num1 / (float )num2;
        } else if(operator.equals("*")){
            sum = num1 * num2;
        } else if(operator.equals("-")) {
            sum = num1 - num2;
        } else if(operator.equals("+")) {
            sum = num1 + num2;
        } else {
            sum = 0;
        }
        
        model.addAttribute("sum", sum);
        return "hello";
    }
}