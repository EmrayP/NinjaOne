package com.ninjaone.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

/**
 * This utility class provides methods to manage the WebDriver instance used in the NinjaOne login page test automation project.
 * It includes methods to initialize and configure the WebDriver, as well as to close the WebDriver instance.
 * The class ensures that the WebDriver is properly set up with necessary configurations such as window maximization and implicit wait time.
 * By centralizing WebDriver management, the class promotes reusability and maintainability of the test code.
 */
public class Driver {

    public static WebDriver driver;
    private ConfigurationsReader configReader;


    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }


    public String getBaseUrl() {
        return configReader.getProperty("url");
    }
     public static void closeDriver(){
        if(driver != null)
             driver.quit();
        driver = null;
 }
}
