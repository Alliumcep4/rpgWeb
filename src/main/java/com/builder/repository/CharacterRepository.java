package com.builder.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.builder.model.Character;

public interface CharacterRepository extends MongoRepository<Character, String> {
}