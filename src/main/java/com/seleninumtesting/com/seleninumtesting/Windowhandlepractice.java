package com.seleninumtesting.com.seleninumtesting;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlepractice {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentID =driver.getWindowHandle();
		
		
		WebElement btn= driver.findElement(By.xpath("(//button[@class='whButtons'])[2]"));
		btn.click();
		
		Set <String> childdata=driver.getWindowHandles();	
		
		for(String child:childdata) {
			System.out.println(child);
			
			if(!parentID.equals(child)) {
				driver.switchTo().window(child);
			}
		}

		WebElement alertclick=driver.findElement(By.xpath("//button[@id='alertBox']"));
		alertclick.click();
		Alert aler=driver.switchTo().alert();
		aler.accept();
		
	}

}
