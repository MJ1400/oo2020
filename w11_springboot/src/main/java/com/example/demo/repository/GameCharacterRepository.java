package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.GameCharacter;

public class GameCharacterRepository {
    static List<GameCharacter> characters = new ArrayList<>();

    public static List<GameCharacter> buildCharacters(){

        //Hardcoded
        characters = List.of(
            new GameCharacter("Raimo", 'M', "Goblin"),
            new GameCharacter("Juku", 'M', "Juku"),
            new GameCharacter("Kati", 'F', "Wizard"),
            new GameCharacter("Mari", 'F', "Healer")
            );

        return characters;
    }
}