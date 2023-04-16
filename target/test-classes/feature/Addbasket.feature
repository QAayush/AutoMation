Feature: Verify add to basket functionality


@Test2 @test
Scenario: Verify user able to Add to cart any product
Given launch url
When Verify user accept all cookies and age
When User able to enter search item into search file
And Click on product
When Click on add to basket button
Then Product add successfully into a basket