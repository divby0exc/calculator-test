package com.divby0exc.calculatortestspring.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int a = 10;
        int b = 5;
        int result = a+b;
        assertEquals(result, Calculator.add(a,b));
    }

    @Test
    void sub() {
    }
}