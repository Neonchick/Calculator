package com.example.calculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    CalculatorController calculatorController = new CalculatorController();

    @Test
    void plusWithCorrectInput() {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(10);
        Numbers numbers = new Numbers(values);
        String result = calculatorController.plus(numbers);
        assertEquals(result,"16");
    }

    @Test
    void plusWithNullNumbers() {
        String result = calculatorController.plus(null);
        assertEquals(result,"No numbers from 0 to 10");
    }

    @Test
    void plusWithEmptyNumbers() {
        List<Integer> values = new ArrayList<>();
        Numbers numbers = new Numbers(values);
        String result = calculatorController.plus(numbers);
        assertEquals(result,"No numbers from 0 to 10");
    }

    @Test
    void plusWithToSmallNumbers() {
        List<Integer> values = new ArrayList<>();
        values.add(-1);
        values.add(-2);
        values.add(-3);
        values.add(-4);
        Numbers numbers = new Numbers(values);
        String result = calculatorController.plus(numbers);
        assertEquals(result,"One number not from 0 to 10");
    }

    @Test
    void plusWithToBigNumbers() {
        List<Integer> values = new ArrayList<>();
        values.add(11);
        values.add(12);
        values.add(13);
        values.add(14);
        Numbers numbers = new Numbers(values);
        String result = calculatorController.plus(numbers);
        assertEquals(result,"One number not from 0 to 10");
    }

    @Test
    void multiplyWithCorrectInput() {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(10);
        Numbers numbers = new Numbers(values);
        String result = calculatorController.multiply(numbers);
        assertEquals(result,"60");
    }

    @Test
    void multiplyWithNullNumbers() {
        String result = calculatorController.multiply(null);
        assertEquals(result,"No numbers from 0 to 10");
    }

    @Test
    void multiplyWithEmptyNumbers() {
        List<Integer> values = new ArrayList<>();
        Numbers numbers = new Numbers(values);
        String result = calculatorController.multiply(numbers);
        assertEquals(result,"No numbers from 0 to 10");
    }

    @Test
    void multiplyWithToSmallNumbers() {
        List<Integer> values = new ArrayList<>();
        values.add(-1);
        values.add(-2);
        values.add(-3);
        values.add(-4);
        Numbers numbers = new Numbers(values);
        String result = calculatorController.multiply(numbers);
        assertEquals(result,"One number not from 0 to 10");
    }

    @Test
    void multiplyWithToBigNumbers() {
        List<Integer> values = new ArrayList<>();
        values.add(11);
        values.add(12);
        values.add(13);
        values.add(14);
        Numbers numbers = new Numbers(values);
        String result = calculatorController.multiply(numbers);
        assertEquals(result,"One number not from 0 to 10");
    }
}