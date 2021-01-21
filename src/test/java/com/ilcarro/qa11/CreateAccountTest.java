package com.ilcarro.qa11;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getHeader().isSignUpTabPresentInHeader()) {
            app.getUser().logOut();
        }
    }

    @Test
    public void testSignUp() {

        app.getHeader().openRegistrationFormFromHeader();

        app.getUser().isRegistrationFormOpened();

        app.getUser().fillRegistrationForm(new User()
                .withFirstName("Manuel")
                .withSecondName("Neuer")
                .withEmail("manuel6@gmail.com")
                .withPassword("Manuel12345"));

        app.getUser().selectPolicyCheckBox();

        app.getUser().submitForm();

        Assert.assertTrue(app.getUser().isLoginFormPresent());
    }

    @Test
    public void testSignUpWithoutPassword() {
        app.getHeader().openRegistrationFormFromHeader();

        app.getUser().isRegistrationFormOpened();
        app.getUser().fillRegistrationForm(new User()
                .withFirstName("Manuel1")
                .withSecondName("Neuer1")
                .withEmail("manuel51@gmail.com"));

        app.getUser().selectPolicyCheckBox();

        app.getUser().submitForm();
        Assert.assertTrue(app.getUser().isLoginFormPresent());
    }


}
