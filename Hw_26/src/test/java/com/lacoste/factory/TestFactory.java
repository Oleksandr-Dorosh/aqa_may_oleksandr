package com.lacoste.factory;

import org.junit.jupiter.api.Test;

public class TestFactory {
    @Test
    public void testCash(){
        WebDriverFactory.getByName(BrowserName.EDGE).get("https://www.google.com.ua/");
    }
}
