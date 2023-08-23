package com.homework.calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void init() {
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("Before test method");
    }

    @DataProvider(name = "testdata")
    public Object[][] testData() {
        return new Object[][]{
                {10, 13, 23},
                {15, 5, 20},
                {8, 4, 12}
        };
    }

    @Test(dataProvider = "testdata")
    public void sumTest(int a, int b, int expected) {
        int result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
        System.out.println("Тест суми - Результат: " + result);
    }

    @Test
    public void subTest() {
        int a = 12;
        int b = 2;
        int result = calculator.subtraction(a, b);
        Assert.assertEquals(result, 10);
        System.out.println("Test2");

    }

    @Test
    public void divTest() {
        int a = 12;
        int b = 2;
        int result = calculator.division(a, b);
        Assert.assertEquals(result, 6);
        System.out.println("Тест ділення - результат: " + result);
    }

    @AfterMethod
    public void afterTestMethod() {
        System.out.println("After test method");
    }

    @AfterClass
    public void afterTestClass() {
        System.out.println("After class");
    }
}
