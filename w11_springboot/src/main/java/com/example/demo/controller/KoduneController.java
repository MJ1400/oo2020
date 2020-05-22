package com.example.demo.controller;

import com.example.demo.repository.KoduneRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KoduneController {
    @GetMapping("/kodune")
    public String printVariable(@RequestParam(value = "var", defaultValue = "1") String myVar, Model model){
        model.addAttribute("var", myVar);
        model.addAttribute("bools", KoduneRepository.buildBooleans());
        return myVar;
    }


}