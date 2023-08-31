package com.lacoste.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class TestLogin {
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/WebDriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lacoste.ua/");
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://www.lacoste.ua/login/?next=/account/");
        WebElement inputLogin = driver.findElement(By.xpath("//input[@name='email' and @class='auth-form__input auth-form__input--register']"));
        inputLogin.sendKeys("mylogin@gm.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password' and @name='password' and @class='auth-form__input auth-form__input--register']"));
        inputPassword.sendKeys("somepassword");

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='auth-form__submit']"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorPasswordMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='error auth-form__error js-error-non_field_errors']")));
        Assertions.assertTrue(errorPasswordMessage.isDisplayed());
        Assertions.assertEquals("Не вдається ввійти в систему за допомогою наданих облікових даних.", errorPasswordMessage.getText());
    }
}