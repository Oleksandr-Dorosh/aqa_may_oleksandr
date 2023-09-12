package com.lacoste.pageobject.languagetest;

import com.lacoste.pageobject.Language;
import com.lacoste.factory.BrowserName;
import com.lacoste.factory.WebDriverFactory;
import com.lacoste.pageobject.LoginPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LanguageTest {
    private static LanguageTest languageTest;
    private static WebDriver webDriver;

    @BeforeAll
    public static void init() {
        webDriver = WebDriverFactory.getByName(BrowserName.EDGE);
        Language language = new Language(webDriver);
        webDriver.manage().window().maximize();
    }

    @Test
    public void languageTest() {
        webDriver.get("https://www.lacoste.ua");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement languageIcon = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.cssSelector(".header-lang-link.js-header-lang-link"))));
        languageIcon.click();
        WebElement englishButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/header/div[1]/div[2]/div[1]/li[1]/div/div/ul/li[1]/form/button")));
        englishButton.click();
        WebElement spanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Нова колекція']")));
        String textInSpan = spanElement.getText();
        String expectedTextInEnglish = "New Collection";
        if (textInSpan.equals(expectedTextInEnglish)) {
            System.out.println("The text is displayed in English: " + textInSpan);
        } else {
            System.out.println("The text is not displayed in English: " + textInSpan);
        }

    }


}
