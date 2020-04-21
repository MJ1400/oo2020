package com.example.demo.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
@Controller
public class WebAppController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "msg", defaultValue = "World") String message, Model model){
        model.addAttribute("condition", false);
        model.addAttribute("message", "Hello " + message);
        return "hello";
    }

    @GetMapping("/calc")
    public String calculate(@RequestParam(value = "n1", defaultValue = "0") int num1, 
                            @RequestParam(value = "n2", defaultValue = "0") @Min(5) @Max(20) int num2,
                            @RequestParam(value = "op", defaultValue = "+") String op, Model model){
        
        model.addAttribute("condition", true);

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);

        String sign = "";
        float sum = 0;

        switch(op){
            case "multiply":
                sum = num1 * num2;
                sign = "*";
                break;
            case "add":
                sum = num1 + num2;
                sign = "+";
                break;
            case "divide":
                sum = (float) num1 / (float) num2;
                sign = "/";
                break;
            case "substract":
                sum = num1 - num2;
                sign = "-";
                break;
        }

        model.addAttribute("sign", sign);

        model.addAttribute("sum", sum);

        return "hello";
    }
}