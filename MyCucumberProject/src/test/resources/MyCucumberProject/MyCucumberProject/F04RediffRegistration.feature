@AllTest
Feature: Rediff Registration

Background: 
Given Launch Rediff url

@Sanity
Scenario: Validate registration on rediff with valid data
When I enter valid full name as "Pravin Garade"
When I enter valid rediff id "pravingarade"
When I enter valid rediff password  as "pravin@123"
When I reenter valid password  as "pravin@123"
When I select birth date
|10|MAR|1988|
And I click on Check availibility button
Then rediff id available message should display
 
 @Regression
Scenario: Validate registration on rediff with invalid data
When I enter invalid full name as "Vinayak Patil"
When I enter invalid rediff id "vinayakpatil"
When I enter invalid rediff password  as "vinayak@123"
When I reenter invalid password  as "vinayak@123"
When user select birth date
|Day|Month|Year|
|10 |MAR|1988|
And user click on Check availibility button
Then rediff id unavailable message should display 