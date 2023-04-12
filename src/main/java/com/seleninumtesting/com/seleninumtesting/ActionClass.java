package com.seleninumtesting.com.seleninumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");

		WebElement acceptallcookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		acceptallcookies.click();
		WebElement cookiesaccept = driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		cookiesaccept.click();

		WebElement account = driver.findElement(By.xpath("//span[text()='Account']"));
		Actions action = new Actions(driver);
		
		
  List <WebElement> dropdown= driver.findElements(By.xpath("(//ul[@class='dropdown account-dropdown'])[2]/li/a"));
  
//  action.moveToElement(account);
  
  int tt= dropdown.size();
  System.out.println(tt);
  for(WebElement ele:dropdown) {
	  action.moveToElement(account).build().perform();
	String value= ele.getText();
	System.out.println(value);
	  	if(ele.getText().equals("YOUR ORDERS")){
	  		ele.click();
	  		break;
	  		
	  		
	  	}
		
	}
  	
	}
	
	
	

}
