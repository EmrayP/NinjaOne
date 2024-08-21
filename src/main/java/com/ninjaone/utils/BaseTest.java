package com.ninjaone.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    private ConfigurationsReader configReader;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        configReader = new ConfigurationsReader();
        driver.get(ConfigurationsReader.getProperty("url"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public String getBaseUrl() {
        return configReader.getProperty("url");
    }

    public String getEmail() {
        return configReader.getProperty("email");
    }

    public String getPassword() {
        return configReader.getProperty("password");
    }
}
