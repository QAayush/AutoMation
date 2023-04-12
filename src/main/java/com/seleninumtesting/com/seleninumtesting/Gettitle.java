package com.seleninumtesting.com.seleninumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettitle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		WebElement headertitle = driver.findElement(By.xpath("//div[@class='login_logo']"));
		String header = headertitle.getText();
		System.out.println(header);

		//System.out.println(driver.getTitle());
		
		String title =driver.getTitle();
		System.out.println(title);

//		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
//		username.sendKeys("dummy");

	}

}
