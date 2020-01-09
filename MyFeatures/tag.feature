Feature: to test the tags
@Fire @Earth
Scenario: Launching of the app
Given the app is launched
Then enter the url
@Water @Air 
Scenario: Enter credentials
Given the username and password are know
Then enter them in fields
And Click login
@Earth
Scenario: add to cart
Given on the product page
Then add the product
And Click next
@Air
Scenario: logout
Given on the homepage
Then click on logout
And Accept