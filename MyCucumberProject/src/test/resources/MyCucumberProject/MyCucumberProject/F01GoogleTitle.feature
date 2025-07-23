Feature: Google

Scenario: Validate Google title
Given Launch google
When read title
Then title should be Google
