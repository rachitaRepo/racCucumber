Feature: Search functionality

Scenario: User searches for a valid product
Given User opens the application
When User enters valid keyword "HP" into search box
And User clicks on Search button
Then User should get valid product displayed in search result

Scenario: User searches for a invalid product
Given User opens the application
When User enters invalid keyword "Honda" into search box
And User clicks on Search button
Then User should get message about no product matching 

Scenario: User searches without any product
Given User opens the application
When User donot enters any product name into search box
And User clicks on Search button
Then User should get a message about no product matching 