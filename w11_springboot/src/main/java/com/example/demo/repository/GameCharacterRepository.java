package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.demo.model.GameCharacter;

public class GameCharacterRepository {
    static List<GameCharacter> characters = new ArrayList<>();

    public static List<GameCharacter> buildCharacters() {
        List<GameCharacter> characters = Arrays.asList(new GameCharacter("Marten", 'M', "Human"),
        new GameCharacter("Juku", 'M', "Wizard"),
        new GameCharacter("Kati", 'F', "Healer"),
        new GameCharacter("Kalle", 'M', "Goblin"));
        return characters;
    }
}