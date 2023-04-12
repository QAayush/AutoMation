package com.seleninumtesting.com.seleninumtesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentID =driver.getWindowHandle();
		
		WebElement opennewwindow = driver.findElement(By.xpath("(//button[@class='whButtons'])[1]"));
		
		opennewwindow.click(); 
		
		Set<String> childID= driver.getWindowHandles();
		
		for (String child:childID)
		{
			System.out.println(child);
			
			if(!parentID.equals(child))
			{
				driver.switchTo().window(child);
				driver.manage().window().maximize();
				WebElement entername= driver.findElement(By.xpath("(//input[@class='bcTextBox'])[1]"));
				entername.sendKeys("Ayush");
				driver.close();
				
				
			}
			
			
		}
		
		
		
		
		
		driver.switchTo().window(parentID);
		WebElement whitebox=	driver.findElement(By.xpath("//input[@class='whTextBox']"));
			
		whitebox.sendKeys("Dummy");
		

	}

}
