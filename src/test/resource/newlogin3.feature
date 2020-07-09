Feature: proof of the concept thaot my framwork works

Scenario:i am opening browser 
    Given i check urrent url is correct or not
    When after login <user> and <password> 
    Then search user and close browser
    
Scenario Outline: i am opening browser 
    Given i check urrent url is correct or not
    When after login <user> and <password> 
    Then search user and close browser

    Examples: 
      | user  |password  |