# NinjaOne Login Page Test Automation

This project contains automated tests for verifying the elements on the NinjaOne login page using Java, Maven, TestNG, and Cucumber.

## Project Structure

- `src/main/java`: Contains the main application code.
- `src/test/java`: Contains the test code.
    - `com.ninjaone.stepdefinitions`: Step definitions for Cucumber feature files.
    - `com.ninjaone.pages`: Page Object Model (POM) classes for the web pages.
    - `com.ninjaone.utils`: Utility classes, including constants and base test setup.
- `src/test/resources`: Contains the Cucumber feature files.
- `.github/workflows`: Contains GitHub Actions workflows for CI/CD.

## Prerequisites

- Java 11
- Maven
- ChromeDriver
- Git

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/ninjaone-login-tests.git
    cd ninjaone-login-tests
    ```

2. Install dependencies:
    ```sh
    mvn clean install
    ```

3. Configure the `ConfigurationsReader` with the necessary properties (e.g., URL, email, password).

## Running Tests

To run the tests locally, use the following command:
```sh
mvn test

## Generating Reports

After running the tests, you can generate Cucumber reports. These reports will be available in the `target/Cucumber-Reports` directory. After the workflow actions are completed, the `pages build and deployment` job will run. Under `pages build and deployment`, you can see the report link. Click on the link to view the report. The report is available at: 

## Interpreting the Results

### Test Output
After running the tests, Maven will display the test results in the terminal. Look for lines indicating the number of tests run, passed, failed, and skipped.

Example:

[INFO] Results: 

[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0

### Detailed Report

Maven generates a detailed test report in the `target/surefire-reports` directory. Open the `index.html` file in a web browser to view the detailed test results, including:

- Test cases executed
- Pass/fail status
- Error messages and stack traces for any failed tests
