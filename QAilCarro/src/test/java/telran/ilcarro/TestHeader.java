package telran.ilcarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeader extends TestBase {
    @Test
    public void testSearch() {
        //wd.findElement(By.cssSelector("#root > div > header > section > ul > li:nth-child(1) > a")).click();
        //wd.findElement(By.xpath("//*[@id=\"root\"]/div/header/section/ul/li[1]/a")).click();
        wd.findElement(By.cssSelector("ul > li:nth-child(1) > a")).click();
        Assert.assertTrue(isFindCarFromPresent4(By.cssSelector(".search-sidebar__form")));
    }

    @Test
    public void testLetTheCarWork() {
        wd.findElement(By.cssSelector("ul > li:nth-child(2)")).click();
        Assert.assertTrue(isFindCarFromPresent4(By.cssSelector(".let-carwork-style_let_car__options__1vKeV")));
    }
    @Test
    public void testTermsOfUse() {
        wd.findElement(By.cssSelector("ul > li:nth-child(3)")).click();
        Assert.assertTrue(isFindCarFromPresent4(By.cssSelector(".container-full")));
    }
    @Test
    public void testLogIn() {
        wd.findElement(By.cssSelector("ul > li:nth-child(5)")).click();
        Assert.assertTrue(isFindCarFromPresent4(By.cssSelector(".signup__fields")));

        wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div/input[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div/input[1]")).clear();
        wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div/input[1]")).sendKeys("alexx1@gmail.com");

        wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div/input[2]")).click();
        wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div/input[2]")).clear();
        wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/form/div/input[2]")).sendKeys("LerT0885530");

        //wd.findElement(By.cssSelector("input[type=submit]")).click();
        wd.findElement(By.cssSelector("input[value=\"Y'alla!\"]")).click();





    }




}
