package com.lacoste.pageobject;

import com.lacoste.pageobject.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {
    private static final By EMAIL_FIELD = By.name("email");
    private static final By PASSWORD_FIELD = By.name("password");
    private static final By LOGIN_BUTTON = By.xpath("//button[@class='auth-form__submit']");
    private static final By LOGIN_ERROR = By.xpath("//div[@class='error auth-form__error js-error-non_field_errors']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEMAIL_FIELD() {
        return driver.findElement(EMAIL_FIELD);
    }

    public WebElement getPASSWORD_FIELD() {
        return driver.findElement(PASSWORD_FIELD);
    }

    public static WebElement getLOGIN_BUTTON() {
        return driver.findElement(LOGIN_BUTTON);
    }

    public static WebElement getLOGIN_ERROR() {
        return driver.findElement(LOGIN_ERROR);
    }
}
