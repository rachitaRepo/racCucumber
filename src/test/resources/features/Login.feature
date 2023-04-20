Feature: Login Functionality

Scenario: Login with valid credential
Given User navigates to login page
When User enters valid email address "test@test.test" into email field
And User enters valid password "12345" into password field
And User clicks on Login button
Then User should get successfully logged in

Scenario: Login with Invalid credentials
Given  User navigates to login page
When User enters invalid emailaddress "test1@test.test" into email field
And User enters invalid password "123456" into password field
And User click on Submit button
Then User should get proper warning message about credential mismatch

Scenario: Login with valid email and invalid password
Given  User navigates to login page
When User enters the valid email address "test@test.test" into email field
And User enters invalid password "1234567" into password field
And User click on Submit button
Then User should get proper warning message about credential mismatch

Scenario: Login with invalid email and valid password
Given  User navigates to login page
When User enters the invalid email address "test1111@test.test" into email field
And User enters valid password "12345" into password field
And User click on Submit button
Then User should get proper warning message about credential mismatch

Scenario: login without providing any credential
Given  User navigates to login page
When User do not enter any email address into email field
And User do not enter any password into password field
And User click on Submit button
Then User should get proper warning message about credential mismatch