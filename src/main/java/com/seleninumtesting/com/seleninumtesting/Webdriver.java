package com.seleninumtesting.com.seleninumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize(); // path create //input[@id='user-name']

		// Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));

		username.sendKeys("dummy");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("dummy");

		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));

		login.click();

		
	
	}

}
