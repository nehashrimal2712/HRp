Feature: test login page

  Scenario: Test login function with valid credentials
    When user is on swaglabs login page
    And user enters email 
    And user enters password 
    And user clicks on Login button
    Then verify that user is successfully logged in
    
  Scenario: Test login function with invalid credentials
		When user is on swaglabs login page
    And user enters invalid email 
    And user enters invalid password 
    And user clicks on Login button
    Then verify that user is not able to login   
