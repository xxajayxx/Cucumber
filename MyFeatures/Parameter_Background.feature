Feature: The Working of TestMeApp

  Background: To launch
    Given the link to app is available
    And the app is Launched

  Scenario Outline: To login
    Given the app is up and running
    Then Click on login button
    And the username is entered "<Username>"
    And the password is entered "<Password>"
    And the login button is clicked
    Given the user is at homepage and logged in
    Then the user browses the product using the tree
    And selects the product which is to be purchased
    When at the cart page
    Then add the product to the cart
    Then the user clicks on the cart
    And removes the product

    Examples: 
      | Username | Password    |
      | lalitha  | Password123 |
