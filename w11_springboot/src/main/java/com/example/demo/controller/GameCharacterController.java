package com.example.demo.controller;

import com.example.demo.repository.GameCharacterRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GameCharacterController {
    @GetMapping("/characters")
    public String getCharacters(Model model) {

        model.addAttribute("characters", GameCharacterRepository.buildCharacters());
        return "characters";
    }
}