package com.ninjaone.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
/**
 * This class serves as the test runner for the NinjaOne login page test automation project.
 * It uses Cucumber with TestNG to execute the feature files located in the specified directory.
 * The class is configured with Cucumber options to define the paths to feature files and step definitions,
 * as well as to specify the output formats for the test reports.
 * By extending AbstractTestNGCucumberTests, it inherits the necessary functionality to run Cucumber tests with TestNG.
 */
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "com.ninjaone.stepdefinitions",    // Package containing step definitions
        plugin = {
                "pretty",                              // Prints Gherkin steps in the console
                "html:target/cucumber-reports/index.html", // HTML report
                "json:target/cucumber-reports/cucumber.json"  // JSON report
        },
        monochrome = true                         // Makes the console output more readable
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // This class will be empty, but it inherits functionality from AbstractTestNGCucumberTests.
}
