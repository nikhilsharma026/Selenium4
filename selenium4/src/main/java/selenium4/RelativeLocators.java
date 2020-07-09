package selenium4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	
    	
    	driver = new ChromeDriver();
    	driver.get("https://automationbookstore.dev/");
    	driver.manage().window().maximize();

    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	
    	WebElement web= driver.findElement(RelativeLocator.withTagName("li").toRightOf(By.id("pid3")).above(By.id("pid8")));
    	
    	Assert.assertEquals(web.getAttribute("id"),"pid4","working");
    	
    	driver.quit();
	}

}
