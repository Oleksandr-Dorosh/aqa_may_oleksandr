package com.lacoste.cash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Objects;

public class DriverCash {
    private static WebDriver driver;
    public DriverCash(){}
    public static WebDriver getDriver(){
        if (Objects.isNull(driver)){
            System.setProperty("webdriver.http.factory","jdk-http-client");
            System.setProperty("webdriver.edge.driver","src/test/resources/WebDriver/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        return driver;
    }
}
