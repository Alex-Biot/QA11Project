package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends TestBase {

    @BeforeMethod
    public void goToFooter(){
        System.out.println("Test is present");
        app.wd.findElement(By.cssSelector("a[aria-current= 'page']"));
        app.wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);

    }
    @Test
    public void footerTest(){
        System.out.println("Begins");
    }
}
