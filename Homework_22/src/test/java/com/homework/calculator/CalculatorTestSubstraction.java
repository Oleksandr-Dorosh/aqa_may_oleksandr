package com.homework.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTestSubstraction {
    private Calculator calculator;

    @BeforeClass
    public void init() {
        calculator = new Calculator();
        System.out.println("Перед класом");
    }

    @Test
    public void subTest() {
        int a = 12;
        int b = 2;
        int result = calculator.subtraction(a, b);
        Assert.assertEquals(result, 10);
        System.out.println("Test2");
    }
}
