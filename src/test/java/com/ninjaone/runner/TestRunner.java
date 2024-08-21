package com.ninjaone.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "com.ninjaone.stepdefinitions",    // Package containing step definitions
        plugin = {
                "pretty",                              // Prints Gherkin steps in the console
                "html:target/cucumber-reports/cucumber.html", // HTML report
                "json:target/cucumber-reports/cucumber.json"  // JSON report
        },
        monochrome = true                         // Makes the console output more readable
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // This class will be empty, but it inherits functionality from AbstractTestNGCucumberTests.
}
