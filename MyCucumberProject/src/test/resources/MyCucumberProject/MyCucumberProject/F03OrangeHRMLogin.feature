Feature: Orange HRM Login

Background: 
Given Launch Orange HRM url

Scenario: Verify Orange HRM with valid login details
When User enters valid login details
And User hits Login
Then Validate user should able to login
 
 
Scenario: Verify Orange HRM with Invalid login details
When User enters Invalid login details
And User hits Login button
Then Validate user should not able to login