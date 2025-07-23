Feature: Data driven testing



Scenario Outline: Validate login to practice test
Given Launch page "https://practice.expandtesting.com/login"
When I enter user name "<UserName>" 
When I enter user password "<Password>"
And I click on submit
Then User should get login

Examples:
|UserName|Password|
|practice|SuperSecretPassword!|
|practice|SuperSecretPassword!|
|pravin|pravin|