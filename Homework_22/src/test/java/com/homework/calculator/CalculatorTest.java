package com.homework.calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeClass
    public void init(){
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeTestMethod(){
        System.out.println("Before test method");
    }

    @Test
    public void sumTest(){
        int a = 10;
        int b = 13;
        int result = calculator.sum(a,b);
        Assert.assertEquals(result,23);
        System.out.println("Test1");
    }

    @Test
    public void subTest(){
        int a=12;
        int b=2;
        int result= calculator.subtraction(a,b);
        Assert.assertEquals(result,10);
        System.out.println("Test2");

    }
    @Test
    public void divTest(){
        int a =12;
        int b =2;
        int result= calculator.division(a,b);
        Assert.assertEquals(result,6);
        System.out.println("Test3");
    }
    @AfterMethod
    public void afterTestMethod(){
        System.out.println("After test method");
    }

    @AfterClass
    public void afterTestClass(){
        System.out.println("After class");
    }
}
