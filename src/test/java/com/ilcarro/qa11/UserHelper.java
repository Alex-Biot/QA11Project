package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void logOut() {
        click(By.xpath("//a[contains(.,'logOut')]"));
    }

    public boolean userLoggedIn() {
        return isElementPreswent(By.xpath("//a[contains(.,'logOut')]"));
    }

    public void fillLoginForm(User user) {
        type(By.name("email"),user.getEmail());
        type(By.name("password"),user.getPassword());
    }

    protected void logIn() {
        click(By.cssSelector("[href='/login']"));
        fillLoginForm(new User()
                .withEmail("manuel@gmail.com")
                .withPassword("Manuel12345"));
        submitForm();
    }

    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        fillLoginForm(user);
    }

    public void isRegistrationFormOpened() {
        Assert.assertTrue(isElementPreswent(By.cssSelector("form.signup__fields")));
    }

    public void selectPolicyCheckBox() {
        click(By.cssSelector("#check_policy"));
    }

    public boolean isLoginFormPresent() {
        return isElementPreswent(By.cssSelector(".Login_login__right_block__1niYm"));
    }

}
