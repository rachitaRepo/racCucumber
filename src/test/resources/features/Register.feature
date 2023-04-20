Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given  User navigates to Register Account page
When User enters the details into below fields
|first name|rash					|
|last name|tyagi					|
|email|test@test.test			|
|telephone|9900334456			|
|password|12345						|
And User select privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an account only all fields
Given  User navigates to Register Account page
When User enters the details into below fields
|first name|rash					|
|last name|tyagi					|
|email|testtest@test.test			|
|telephone|9900334456			|
|password|12345						|
And User select  yes for Newsletter
And User select Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates a duplicated account
Given  User navigates to Register Account page
When User enters the details into below fields
|first name|rash					|
|last name|tyagi					|
|email|testtest@test.test			|
|telephone|9900334456			|
|password|12345						|
And User select  yes for Newsletter
And User select Privacy Policy
And User clicks on Continue button
Then User should get proper warning message about duplicate email

Scenario: User creates an account without filling any details
Given  User navigates to Register Account page
When User don't enter any details into fields
And User clicks on Continue button
Then User should get proper warning messages for every mandatory fields
