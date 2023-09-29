package com.lacoste.pageobject.adstract;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected static WebDriver driver;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
