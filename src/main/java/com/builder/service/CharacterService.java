package com.builder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.builder.model.Character;
import com.builder.repository.CharacterRepository;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> getAll() {
        return characterRepository.findAll();
    }

    public Character getById(String id) {
        return characterRepository.findById(id).orElse(null);
    }

    public Character save(Character character) {
        return characterRepository.save(character);
    }
}