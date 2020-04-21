package com.example.demo.services;

import java.util.List;

import com.example.demo.model.GameCharacter;
import com.example.demo.repository.GameCharacterRepository;

public class GameCharacterService {

    public static List<GameCharacter> getCharacters(){
        return GameCharacterRepository.buildCharacters();
    }
}