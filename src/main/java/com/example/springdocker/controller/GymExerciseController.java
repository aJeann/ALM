package com.example.springdocker.controller;

import com.example.springdocker.model.GymExercise;
import com.example.springdocker.service.GymExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-13
 * Time: 00:29
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@RestController
public class GymExerciseController {
    private final GymExerciseService service;

    @GetMapping("/exercises")
    public List<GymExercise> getExercises() {
        return service.getGymExercises();
    }

    @PostMapping("/exercises")
    public void saveNewExercise(@RequestBody GymExercise gymExercise) {
        service.saveNewExercise(gymExercise);
    }

    @GetMapping("/exercises/fun")
    public List<String> getFunExercises() {
        return service.getEnjoyableExercises();
    }
}
