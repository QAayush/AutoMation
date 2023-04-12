package com.seleninumtesting.com.seleninumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownpractice {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testuserautomation.github.io/DropDown/");
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@name='Cities']"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		
		

	}

}
