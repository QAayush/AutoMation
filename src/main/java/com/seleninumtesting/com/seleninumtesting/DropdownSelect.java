package com.seleninumtesting.com.seleninumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelect {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.vuse.com/gb/en/customer/account/create/");

		WebElement acceptallcookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		acceptallcookies.click();
		WebElement cookiesaccept = driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		cookiesaccept.click();

		//when select type tag 
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s = new Select(dropdown);
		// s.selectByValue("1");//select by value
		//s.selectByVisibleText("Male");// select by visible text
		s.selectByIndex(2);
		
		
		//if tag dropdown different from select we use bootstaapdropdown
		
		//drop down click
		
		WebElement dropdon=driver.findElement(By.xpath(null));
		dropdon.click();
		//Dropdown list
		
		//List: We will store all the list in single element
		
	List<WebElement>Droplist=	driver.findElements(By.xpath(""));
		
		

	}

}
