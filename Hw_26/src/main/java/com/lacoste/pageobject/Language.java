package com.lacoste.pageobject;

import com.lacoste.pageobject.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Language extends AbstractPage {

    private static final By CHANGE_BUTTON = By.name("UA");
    private static final By ENGLISH = By.xpath("//button[@class='active btn-lang']");
    private static final By UKRAINIAN = By.xpath("//button[@class='btn-lang']");
    public Language(WebDriver driver) {
        super(driver);
    }

    public static WebElement getCHANGE_BUTTON() {
        return driver.findElement(CHANGE_BUTTON);
    }

    public WebElement getENGLISH() {
        return driver.findElement(ENGLISH);
    }

    public WebElement getUKRAINIAN() {
        return driver.findElement(UKRAINIAN);
    }


}
