package com.seleninumtesting.com.seleninumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathpractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.vuse.com/gb/en/customer/account/create/");

		WebElement acceptallcookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		acceptallcookies.click();
		WebElement cookiesaccept = driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		cookiesaccept.click();

		WebElement Firstname = driver.findElement(By.xpath("(//input[@id='firstname'])[1]"));// when we received multiples
																							// then we do indexing
		Firstname.sendKeys("Ayush");

		WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastname'][1]"));
		Lastname.sendKeys("Chauhan");

		WebElement Email = driver.findElement(By.xpath("//input[@id='email_address']"));
		Email.sendKeys("dummy@gmail.com");

		WebElement Dateofbirth = driver.findElement(By.xpath("//input[@id='dob']"));
		Dateofbirth.sendKeys("23/08/2000");

		WebElement GenderSelect = driver.findElement(By.xpath("//select[@id='gender']"));
		Select dropdown = new Select(GenderSelect);

		
		dropdown.selectByValue("1");

		WebElement Address = driver.findElement(By.xpath("//input[@name='address-search']"));
		Address.sendKeys("Delhi");

		WebElement Mobilenumber=driver.findElement(By.xpath("//input[@name='telephone'][1]"));
		Mobilenumber.sendKeys("98989898988");
		
		
		WebElement Checkbox=driver.findElement(By.xpath("//span[@class='small-checkbox-text']"));
		
		Checkbox.click();
		
		
	}

}
