package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class   Base {

	
	static WebDriver driver;
	static Properties prop = new Properties();

	static {
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\RIL-LT-AYUSH\\eclipse-workspace\\com.seleninumtesting\\Data\\Testdata.properties");

			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void dragandDrop(WebElement e, WebElement y) {
		Actions a = new Actions(driver);
		a.dragAndDrop(e, y).build().perform();
	}

	public void clickbttn(String e) {
		WebElement clickbtn = driver.findElement(By.xpath(e));
		clickbtn.click();

	}

	public void setup() {
		String BrowserName = prop.getProperty("Browser");
		if (BrowserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			
		} else if (BrowserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();

		}
		driver.get(prop.getProperty("url"));
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void cookiesaccept() {
		WebElement cookeis= driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		cookeis.click();
	}
	
	public void Ageaccept() {
		WebElement age= driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		age.click();
	}
	
}
