Feature: FlipKart Validation

  Scenario: Login Validations
    Given FlipKart is up and running and is launched
    Then User clicks on SignIn Link
    And User provides valid credentials
    Then User Clicks on Submit button
