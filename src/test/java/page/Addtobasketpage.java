package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Addtobasketpage extends Base {

	public void clickOnProduct() {

		WebElement product = getDriver().findElement(By.xpath("(//div[@class='product-name'])[1]"));

		Actions act = new Actions(getDriver());
		act.moveToElement(product);

		WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(product));
		
		act.click().build().perform();

	}

	public void clickOnBasket() {
		WebElement basket = getDriver().findElement(By.xpath("(//button[@type='submit'])[2]"));
		basket.click();

	}

	public void chekcItemAddIntoBasket() {
		WebElement basketIcon = getDriver().findElement(By.xpath("//span[@class='icon-bag']"));
		basketIcon.click();

		WebElement basketbtn = getDriver().findElement(By.xpath("//a[@class='action viewcart primary']"));
		Actions act = new Actions(getDriver());
		act.moveToElement(basketbtn);
		act.click().build().perform();

	}

}
