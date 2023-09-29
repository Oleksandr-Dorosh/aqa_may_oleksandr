package org.example;

import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory","jdk-http-client");
        System.setProperty("webdriver.edge.driver","src/test/resources/WebDriver/msedgedriver.exe");

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.navigate().to("https://www.lacoste.ua/");
        Thread.sleep(3000);
        edgeDriver.navigate().to("https://www.lacoste.ua/login/?next=/account/");


    }
}