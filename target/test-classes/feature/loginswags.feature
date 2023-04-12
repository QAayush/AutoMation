Feature: verify login functionality

Background: Launch the url
Given launch site

@Regression
Scenario Outline: Verify succesfully login when enter valid user name and password
When user enter correct "<username>" correct "<password>"
And click on login button
Then Swags labs logo visible

Examples:
|username|password|
|ayush|test|
|anil|test|





