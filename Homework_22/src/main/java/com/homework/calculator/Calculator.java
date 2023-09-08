package com.homework.calculator;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is forbidden");
        }
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
