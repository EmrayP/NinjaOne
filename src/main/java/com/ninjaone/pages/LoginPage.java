package com.ninjaone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the LoginPage and contains WebElements and methods to interact with the login page of the NinjaOne application.
 * It uses the Page Object Model (POM) design pattern to encapsulate the elements and actions on the login page.
 * The class is initialized with a WebDriver instance and uses the PageFactory to locate elements.
 * It provides methods to verify the presence of various elements on the login page.
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='email']")
    private WebElement emailInput;

    @FindBy(css = "input[name='password']")
    WebElement passwordInput;

    @FindBy(id = "staySignedIn")
    WebElement keepMeSignedInCheckbox;

    @FindBy(css = "button[type='submit']")
    WebElement signInButton;

    @FindBy(linkText = "Forgot your password?")
    WebElement forgotPasswordLink;

    @FindBy(linkText = "Do not have an account?")
    WebElement doNotHaveAccountLink;

    public boolean isEmailInputDisplayed() {
        return emailInput.isDisplayed();
    }

    public boolean isPasswordInputDisplayed() {
        return passwordInput.isDisplayed();
    }

    public boolean isKeepMeSignedInCheckboxDisplayed() {
        return keepMeSignedInCheckbox.isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        return signInButton.isDisplayed();
    }

    public boolean isForgotPasswordLinkDisplayed() {
        return forgotPasswordLink.isDisplayed();
    }

    public boolean isDoNotHaveAccountLinkDisplayed() {
        return doNotHaveAccountLink.isDisplayed();
    }
}
