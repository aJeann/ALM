package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.GymExercise;
import com.example.springdocker.repository.FoodRepository;
import com.example.springdocker.repository.GymExerciseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-13
 * Time: 00:30
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@Service
public class GymExerciseService {
    private final GymExerciseRepository repository;

    public List<GymExercise> getGymExercises() {
        return repository.findAll();
    }

    public void saveNewExercise(GymExercise gymExercise) {
        repository.save(gymExercise);
    }

    public List<String> getEnjoyableExercises() {
        // hämtar alla övningar jag gillar
        List<GymExercise> funExercise = repository.findGymExerciseByDoIEnjoyIt(true);

        // returnerar endast Food namnen i en lista
        return funExercise.stream()
                .map(gymExercise -> gymExercise.getName())
                .collect(Collectors.toList());
    }
}
