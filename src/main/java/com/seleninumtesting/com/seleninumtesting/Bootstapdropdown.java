package com.seleninumtesting.com.seleninumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstapdropdown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		// drop down select by bootstarp
		
		driver.get("https://www.jquery-az.com/7-customized-bootstrap-dropdown-demos-in-menus-navbar-and-tabs/");
		
		WebElement dropdown= driver.findElement(By.xpath("//button[@id='menu1']"));
		
		//dropdown.click();
		
		List <WebElement> dropdownlist=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		
		int listsize= dropdownlist.size();// size of list
		
		System.out.println(listsize);
		
		for(WebElement ele:dropdownlist )
		{
			dropdown.click();
			String value = ele.getText();
			System.out.println(value);
			
			
//			if(value.equals("HTML")) { ele.click(); break; }
//			 
		}
		

	}

}
