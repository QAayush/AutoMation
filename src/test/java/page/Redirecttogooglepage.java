package page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Redirecttogooglepage extends Base {

	public void accept_Iamunder18_button() {
		WebElement accept = getDriver().findElement(By.xpath("//button[@id='btn-entry-age-deny']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		  js.executeScript("arguments[0].click();", accept);
				
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Google"));
		String title = getDriver().getTitle();
		
		System.out.println(title);

		assertEquals("Google", title);

	
	}
}
