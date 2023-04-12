Feature: Verify under 18 button working or not

@Test1
Scenario: Verify when we click on under18 button is wokring or not
Given launch url
When Verify user accept all cookies and age
And Click on  IAM under18 button
