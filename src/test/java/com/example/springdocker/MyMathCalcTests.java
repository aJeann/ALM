package com.example.springdocker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-18
 * Time: 15:04
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public class MyMathCalcTests {

    MyMathCalc math;

    @BeforeEach
    public void beforeMethod(){
    math = new MyMathCalc();
    }

    @Test
    void mathAdd(){
        int expected = 7;
        int actual = math.add(3, 4);

        assertEquals(expected, actual);
    }

    @Test
    void mathDivide(){
        double expected = 7;
        double actual = math.divide(14, 2);

        assertEquals(expected, actual);
    }

    @Test
    void mathMultiply(){
        int expected = 44;
        int actual = math.multiply(11, 4);

        assertEquals(expected, actual);

    }

    @Test
    void divideThrows(){
        assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
    }
}
