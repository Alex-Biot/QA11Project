package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenHomePageTest extends TestBase{

    @Test
    public void homePageTest() {
        System.out.println("site open");

        System.out.println("FindCarFromPresent : " + app.getCar().isFindCarFromPresent());
        app.getCar().isElementPresent2(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));

        app.getCar().jumpToFutter();
    }

}
