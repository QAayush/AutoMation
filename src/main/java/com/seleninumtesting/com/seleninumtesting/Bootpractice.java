package com.seleninumtesting.com.seleninumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");

		WebElement dropdown = driver.findElement(By.xpath("//button[@id='menu1']"));

		dropdown.click();

		List<WebElement> dropdownlist = driver.findElements(By.xpath("(//ul[@class='dropdown-menu test'])[1]/li/a"));

		for (WebElement ele : dropdownlist)

		{
//			dropdown.click();
			String value = ele.getText();
			System.out.println(value);

		}

	}

}
