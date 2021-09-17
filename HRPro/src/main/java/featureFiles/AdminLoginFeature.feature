Feature: Test the Login page for nopCommerce application

Scenario: verify that user is able to login with valid credentials
When user is on login page
And user enters correct email id
And user enters correct password
And user clicks on Login Button
Then verify that user is login successfully
