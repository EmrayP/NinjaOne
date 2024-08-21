package com.ninjaone.stepdefinitions;

import com.ninjaone.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
/**
 * This class contains the setup and teardown methods for the NinjaOne login page test automation project.
 * It uses Cucumber's @Before and @After annotations to initialize and close the WebDriver instance before and after each test scenario.
 * The setUp method initializes the WebDriver, ensuring the browser is ready for testing.
 * The tearDown method closes the WebDriver, ensuring no browser instances are left open after tests complete.
 * By centralizing these actions, the class promotes reusability and maintainability of the test code.
 */
public class Hooks {
    protected WebDriver driver;

    @Before
    public void setUp(){
        Driver.getDriver();
    }
    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
