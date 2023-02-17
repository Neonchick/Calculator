package com.example.calculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Calculator with plus and multiply
 */
@RestController
public class CalculatorController {

    /**
     * @return Sum of numbers if all numbers from 0 to 10
     * "No numbers from 0 to 10" if numbers null or empty
     * "One number not from 0 to 10" if any number not from 0 to 10
     */
    @PostMapping("/plus")
    public String plus(@RequestBody Numbers numbers) {
        int sum = 0;
        if (numbers == null || numbers.values().isEmpty()) {
            return "No numbers from 0 to 10";
        }
        for (var number: numbers.values()) {
            if (number != null && number >= 0 && number <= 10) {
                sum += number;
            } else {
                return "One number not from 0 to 10";
            }
        }
        return String.valueOf(sum);
    }

    /**
     * @return Multiply of numbers if all numbers from 0 to 10
     * "No numbers from 0 to 10" if numbers null or empty
     * "One number not from 0 to 10" if any number not from 0 to 10
     */
    @PostMapping("/multiply")
    public String multiply(@RequestBody Numbers numbers) {
        int multiply = 1;
        if (numbers == null || numbers.values().isEmpty()) {
            return "No numbers from 0 to 10";
        }
        for (var number: numbers.values()) {
            if (number != null && number >= 0 && number <= 10) {
                multiply *= number;
            } else {
                return "One number not from 0 to 10";
            }
        }
        return String.valueOf(multiply);
    }

}
