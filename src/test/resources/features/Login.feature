Feature: Verify elements on the NinjaOne login page

  Scenario: User should see the required elements on the login page
    Given the user is on the NinjaOne login page
    Then the user should see the "Email" input field
    And the user should see the "Password" input field
    And the user should see the "Keep me signed in" checkbox
    And the user should see the "Sign In" button
    And the user should see the "Forgot your password?" link
    And the user should see the "Do not have an account?" link
