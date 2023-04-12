package com.seleninumtesting.com.seleninumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boots {

	public static void main(String[] args) {


		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s = new Select (dropdown);
		//s.selectByValue("za");
		s.selectByIndex(2);
		
	}

}
