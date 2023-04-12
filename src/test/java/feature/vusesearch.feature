Feature: Verify Search functionality

Background: Launch the url
Given launch url
@Test
Scenario: Verify user able to search product
When Verify user accept all cookies and age
When User able to enter search item into search file
Then visible all products