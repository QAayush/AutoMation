package com.seleninumtesting.com.seleninumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.vuse.com/gb/en/customer/account/create/");

		WebElement acceptcookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		acceptcookies.click();

		WebElement age = driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(age));
		age.click();
	}

}
