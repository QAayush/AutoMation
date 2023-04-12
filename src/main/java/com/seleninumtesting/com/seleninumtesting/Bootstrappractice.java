package com.seleninumtesting.com.seleninumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrappractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/7-customized-bootstrap-dropdown-demos-in-menus-navbar-and-tabs/");
		
		WebElement dropdown= driver.findElement(By.xpath("//a[@class='main-link'][1]"));
		
		/* dropdown.click(); */
		
		List<WebElement> dropdownlist=driver.findElements(By.xpath("//ul[@id='menu-top-header-menu']/li[1]//ul/li/a"));
		
		for(WebElement test:dropdownlist ) 
		{
			dropdown.click();
			 
			String value = test.getText();
			System.out.println(value);
			
			test.click();
			
			
		}
		
	}

}
