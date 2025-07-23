Feature: Google Search

Scenario: Google Search Functionality
Given Launch google browser
When User enters any keyword to search
And User hits enter
Then Valid search result should display
 