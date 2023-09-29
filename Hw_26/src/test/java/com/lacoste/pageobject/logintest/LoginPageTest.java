package com.lacoste.pageobject.logintest;

import com.lacoste.factory.BrowserName;
import com.lacoste.factory.WebDriverFactory;
import com.lacoste.pageobject.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageTest {
    private static LoginPage loginPage;
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        driver.get("https://www.lacoste.ua/login/?next=/account/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginIcon = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("email"))));
        loginIcon.click();
        loginPage.getEMAIL_FIELD().sendKeys("Hello@hi.hhh");
        WebElement passwordIcon = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("password"))));
        passwordIcon.click();
        loginPage.getPASSWORD_FIELD().sendKeys("Hello123");
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='auth-form__submit']"))));
        LoginPage.getLOGIN_BUTTON().click();
        WebElement loginError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='error auth-form__error js-error-non_field_errors']")));
        Assertions.assertTrue(loginError.isDisplayed());
        Assertions.assertEquals("Не вдається ввійти в систему за допомогою наданих облікових даних.", loginError.getText());

    }

}