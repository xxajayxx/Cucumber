Feature: DemoWebShop Validationzz

Scenario: Guest user Registration in DemoWebShop
Given User launches the DemoWebShop App zz
Then User clicks on SignIn button
And User provides the valid data for all the fields 
When User clicks on Submit button at the end of the form 
Then Verifies the result of the registration
And  Prints the message


Scenario: Registered user login in DemoWebApp
Given Application launched by registered user zz
Then User access the login Link
And Provides the Valid data as input
And Verifies the login status
