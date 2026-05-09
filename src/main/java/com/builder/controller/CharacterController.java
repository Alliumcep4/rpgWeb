package com.builder.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.builder.model.Character;
import com.builder.service.CharacterService;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getAll() {
        return characterService.getAll();
    }

    @GetMapping("/{id}")
    public Character getById(@PathVariable String id) {
        return characterService.getById(id);
    }

    @PostMapping
    public Character create(@RequestBody Character character) {
        return characterService.save(character);
    }
}