package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-13
 * Time: 00:28
 * Project: spring-docker-demo
 * Copyright: MIT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GymExercise {
    String id;
    String name;
    int maxLift;
    boolean doIEnjoyIt;
}
