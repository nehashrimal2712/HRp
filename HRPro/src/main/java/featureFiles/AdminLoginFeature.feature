Feature: Test the Login page for nopCommerce application

  Scenario: verify that user is able to login with valid credentials
    When user is on login page
    And user enters correct email id
    And user enters correct password
    And user clicks on Login Button
    Then verify that user is login successfully

  Scenario: verify that user is not able to login with Invalid credentials
    When user is on login page
    And user enters Incorrect email id
    And user enters Incorrect password
    And user clicks on Login Button
    Then verify that user is not able to login

  Scenario: verify the demo credentials on the login page
    When user is on login page
    Then verify that user is able to see the Admin email
    And verify that user is able to see the Admin password
