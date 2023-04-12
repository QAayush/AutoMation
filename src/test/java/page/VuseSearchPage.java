package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import ch.qos.logback.core.joran.action.Action;

public class VuseSearchPage extends Base{
	
	public void launchurl() {
		setup();
		
	}
	
	public void cookies_accet() {
		cookiesaccept();
	}
	
	public void age_Accept() {
		Ageaccept();
	}
	
	public void enter_searchproduct() {
		WebElement searchvalue= getDriver().findElement(By.xpath("//input[@id='search']"));
		searchvalue.sendKeys("Products");
	}
	public void visible_product() {
		WebElement products= getDriver().findElement(By.xpath("(//div[@class='product-name'])[1]"));
		WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(products));
		
		Actions act=new Actions(getDriver());
				act.moveToElement(products);
				act.click().build().perform();
	}

	
}
