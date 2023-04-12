package com.seleninumtesting.com.seleninumtesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.vladsch.flexmark.ast.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewindowhandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parentID = driver.getWindowHandle();

		WebElement openwindow = driver.findElement(By.xpath("(//button[@class='whButtons'])[3]"));
		openwindow.click();
		
		Set<String> childwindow = driver.getWindowHandles();
		for (String child : childwindow) {
			
												
			if (!parentID.equals(child)) {
				driver.switchTo().window(child);
				
				String title=driver.getTitle();
				System.out.println(title);
				if(title.contains("XPath Practice")) {
					driver.manage().window().maximize(); 
					break;
				}
			
			}

		}

	}

}
