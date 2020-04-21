package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebAppController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "msg", defaultValue = "World") String message, Model model){
        model.addAttribute("message", "Hello " + message);
        return "hello";
    }

    @GetMapping("/calc")
    public String calculate(@RequestParam(value = "n1", defaultValue = "0") int num1, 
                            @RequestParam(value = "n2", defaultValue = "0") int num2, Model model){
        model.addAttribute("condition", true);

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);

        int sum = num1 * num2;

        model.addAttribute("sum", sum);

        return "hello";
    }
}