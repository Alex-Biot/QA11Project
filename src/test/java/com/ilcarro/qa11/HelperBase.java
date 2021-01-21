package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public boolean isElementPreswent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public boolean isElementPresent2(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void type(By locator, String text) {
        if(text!=null) {
            click(locator);
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void submitForm() {
        click(By.cssSelector("[type='submit']"));
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void jumpToFutter() {
        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
    }
}
