package com.ninjaone.stepdefinitions;

import com.ninjaone.pages.LoginPage;
import com.ninjaone.utils.BaseTest;
import com.ninjaone.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

/**
 * This class contains step definitions for the login-related scenarios in the Cucumber feature files.
 * It extends the BaseTest class to inherit setup and teardown methods for WebDriver.
 * The class uses Cucumber annotations to map Gherkin steps to Java methods.
 * It verifies the presence of various elements on the login page using assertions.
 *
 * @author Emray Pala
 */
public class LoginSteps extends BaseTest {

    private LoginPage loginPage;

    @Given("the user is on the NinjaOne login page")
    public void the_user_is_on_the_ninja_one_login_page() {
        if (driver == null) {
            setUp(); // Ensure driver is initialized
        }
        loginPage = new LoginPage(driver);
        driver.get(getBaseUrl());
    }

    @Then("the user should see the {string} input field")
    public void theUserShouldSeeTheInputField(String field) {
        loginPage = new LoginPage(driver);
        switch (field.toLowerCase()) {
            case Constants.EMAIL_TEXT:
                Assert.assertTrue(loginPage.isEmailInputDisplayed(), Constants.EMAIL_INPUT_NOT_DISPLAYED);
                break;
            case Constants.PASSWORD_TEXT:
                Assert.assertTrue(loginPage.isPasswordInputDisplayed(), Constants.PASSWORD_INPUT_NOT_DISPLAYED);
                break;
        }
    }

    @Then("the user should see the {string} checkbox")
    public void theUserShouldSeeTheCheckbox(String checkbox) {
        Assert.assertTrue(loginPage.isKeepMeSignedInCheckboxDisplayed(), Constants.KEEP_ME_SIGNED_IN_CHECKBOX_NOT_DISPLAYED);
    }

    @Then("the user should see the {string} button")
    public void theUserShouldSeeTheButton(String button) {
        Assert.assertTrue(loginPage.isSignInButtonDisplayed(), Constants.SIGN_IN_BUTTON_NOT_DISPLAYED);
    }

    @Then("the user should see the {string} link")
    public void theUserShouldSeeTheLink(String link) {
        switch (link.toLowerCase()) {
            case Constants.FORGOT_PASSWORD_TEXT:
                Assert.assertTrue(loginPage.isForgotPasswordLinkDisplayed(), Constants.FORGOT_PASSWORD_LINK_NOT_DISPLAYED);
                break;
            case Constants.DO_NOT_HAVE_ACCOUNT_TEXT:
                Assert.assertTrue(loginPage.isDoNotHaveAccountLinkDisplayed(), Constants.DO_NOT_HAVE_ACCOUNT_LINK_NOT_DISPLAYED);
                break;
        }
    }
}