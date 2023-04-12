package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class SiginPage extends Base {

	public void account_icon() {
		WebElement acounticon = getDriver().findElement(By.xpath("//span[@class='icon-account']"));
		Actions action = new Actions(getDriver());
		action.moveToElement(acounticon).build().perform();

		List<WebElement> dropdown = getDriver().findElements(By.xpath("(//ul[@data-target='dropdown'])[2]/li"));

		for (WebElement ele : dropdown) {
			action.click();

			String value = ele.getText();
			System.out.println(value);
			if (value.equals("SIGN IN/REGISTER")) {
				ele.click();
			}
		}

	}
	
	public void enter_signindetails() {
		WebElement Email=getDriver().findElement(By.xpath("//input[@name='login[username]']"));
		Email.sendKeys("ayush.chauhn@gmail.com");
		WebElement password=getDriver().findElement(By.xpath("//input[@name='login[password]']"));
		password.sendKeys("Ayush@44");
	}
	
	public void clickbtn() {
		WebElement signin= getDriver().findElement(By.xpath("(//button[@type='submit'])[2]"));
		signin.click();
	}
}
