package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.GymExercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-13
 * Time: 00:29
 * Project: spring-docker-demo
 * Copyright: MIT
 */

public interface GymExerciseRepository extends MongoRepository<GymExercise, String> {
    List<GymExercise> findGymExerciseByDoIEnjoyIt(boolean enjoys);
}
