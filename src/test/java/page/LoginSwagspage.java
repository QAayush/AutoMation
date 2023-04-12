package page;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.seleninumtesting.com.seleninumtesting.Webdriver;

import base.Supportbase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSwagspage extends Supportbase {

	
	public void launchurl()  {
		setup();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void entercorrect_username_password(String uname, String pass) {
		WebElement username=getDriver().findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		username.sendKeys(uname);
		WebElement password=getDriver().findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		password.sendKeys(pass);
	}
	
	public void click_loginbtn() {
		WebElement btn=getDriver().findElement(By.xpath("//input[@type='submit']"));
				btn.click();
	}
	
	public void swagLabsLogo() {
		WebElement logo=getDriver().findElement(By.xpath("//div[@class='app_logo']"));
	String logoname=	logo.getText();
	
	assertEquals(logoname, "Swag Labs");
		
		
	}
	
	public void enterincorrect_username_password() {
		WebElement username=getDriver().findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		username.sendKeys("dummy");
		WebElement password=getDriver().findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		password.sendKeys("dummy");
	}
	
	
	public void check_alert() {
		WebElement errormsg=getDriver().findElement(By.xpath("//h3[@data-test='error']"));
		String error=errormsg.getText();
		if(error.equalsIgnoreCase("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("Test match");
		}
		
	}
	
}
