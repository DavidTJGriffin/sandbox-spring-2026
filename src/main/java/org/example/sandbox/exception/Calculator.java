package org.example.sandbox.exception;

public class Calculator {

    public int divide(int numerator, int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Cannot divide by zero.");
        }
        return numerator / denominator;


    }

    public int safeDivide(int numerator, int denominator) {
        try {
            return divide(numerator, denominator);
        } catch (DivideByZeroException e) {
            System.err.println("Error: " + e.getMessage());
            return 0; // Return a default value or handle as needed
        }
    }
}
