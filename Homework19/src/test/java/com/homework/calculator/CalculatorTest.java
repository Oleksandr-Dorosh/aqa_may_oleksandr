package com.homework.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Calculator was created");
        calculator = new Calculator();
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Before each");
    }

    @Test
    @DisplayName("Test sum a+b")
    public void testSum() {
        int a = 32;
        int b = 12;
        int result = 44;
        int actualResult = calculator.sum(a, b);
        Assertions.assertEquals(result, actualResult, "Actual result: " + actualResult + "; " + "Expected was :" + result);
    }

    @Test
    @DisplayName("Test substraction a-b false ")
    public void testSubstraction() {
        int a = 10;
        int b = 2;
        int result = 9;
        int actualResult = calculator.subtraction(a, b);
        Assertions.assertNotEquals(result, actualResult, "Actual result: " + actualResult + "; " + "Expected was :" + result);
    }

    @Test
    @DisplayName("Test division a/b equals")
    public void testDivision() {
        int a = 20;
        int b = 2;
        int result = 10;
        int actualResult = calculator.division(a, b);
        Assertions.assertEquals(result, actualResult, "Actual result: " + actualResult + "; " + "Expected was :" + result);
    }

    @Test
    @DisplayName("Test multiplication a*b not equals")
    public void testMultiplication() {
        int a = 10;
        int b = 2;
        int result = 21;
        int actualResult = calculator.multiplication(a, b);
        Assertions.assertNotEquals(result, actualResult, "Actual result: " + actualResult + "; " + "Expected was :" + result);
    }

    @AfterEach
    public void after() {
        System.out.println("After each");
    }

    @AfterAll
    public static void close() {
        System.out.println("All tests was finished");
    }

    @ParameterizedTest
    @MethodSource("getValues")
    @DisplayName("Test sum a+b")
    public void testSum1(int a, int b, int result) {
        int actualResult = calculator.sum(a, b);
        Assertions.assertEquals(result, actualResult, "Actual result :" + actualResult + ". " + "Expected result: " + result);

    }

    public static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(3, 6, 9)
        );
    }
}
