package com.seleninumtesting.com.seleninumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//
		// basic auth alert

		// Username:password@url

		/*
		 * WebElement alert =
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		 * 
		 * alert.click(); //driver.switchTo().alert().accept();
		 * 
		 * Alert a=driver.switchTo().alert(); a.accept();// simple alert
		 */

		/*
		 * WebElement alert =
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		 * 
		 * alert.click();
		 * 
		 * Alert aler=driver.switchTo().alert(); aler.dismiss();// two option alert cancel or accept
		 */
		
		WebElement alert =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		alert.click();
		
		Alert aler =driver.switchTo().alert();
		aler.sendKeys("Admin");
		aler.accept();
		
	}

}
