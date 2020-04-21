package com.example.demo.controller;

import com.example.demo.repository.GameCharacterRepository;
import com.example.demo.services.GameCharacterService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameCharacterController {
    
    @GetMapping("/characters")
    public String getCharacters(Model model){

        model.addAttribute("characters", GameCharacterService.getCharacters());

        return "characters";
    }
}