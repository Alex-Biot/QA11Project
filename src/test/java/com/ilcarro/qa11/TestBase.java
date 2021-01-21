package com.ilcarro.qa11;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        app.init();
    }

    @AfterSuite(enabled = false)
    public void tearDown() {
        app.stop();
    }

}
