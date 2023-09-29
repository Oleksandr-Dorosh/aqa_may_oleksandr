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

public class TestAddToCart {
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
    public void TestAddToCart() throws InterruptedException{
        driver.get("https://www.lacoste.ua/cholovicha/");
        WebElement iconArrow = driver.findElement(By.cssSelector("em.icon-arrow"));
        iconArrow.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement tolstovka = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='product-item-image-link']")));
        tolstovka.click();
        WebElement basket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='lc-button lc-button--secondary product-button js-sidepopup-trigger js-lac-basket-btn js-size-select-btn']")));
        basket.click();
        WebElement tolstovkaSize = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-pk='39606']")));
        tolstovkaSize.click();
        WebElement addToBasket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='js-add-basket product-add-to-basket lc-button lc-button--primary product-button js-lac-basket-btn']")));
        addToBasket.click();
        WebElement toBasket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/baskets/basket/']")));
        toBasket.click();
        WebElement Message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".basket-page .basket-item .name")));
        Assertions.assertTrue(Message.isDisplayed());
        Assertions.assertEquals("Lacoste толстовка чоловіча на блискавці", Message.getText());


    }
}
