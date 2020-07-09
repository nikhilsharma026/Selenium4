package selenium4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementScreenshot 
{
    public static void main( String[] args )
    {
        //Instead of using this set property command, we can also use below code:
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil Sharma\\Documents\\Browser Drivers\\chromedriver.exe");
    	
    	WebDriverManager.chromedriver().setup();
    	
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.google.com");
    	
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
    	
    	
    	driver.manage().window().minimize();				// With selenium 4, we have minimize option as well
    	
    	
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	driver.manage().window().maximize();
    	
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	WebElement web= driver.findElement(By.xpath("//img[@alt='Google']"));
    	
    	
    	File file= web.getScreenshotAs(OutputType.FILE);
    	
    	
    	try {
			FileUtils.copyFile(file, new File("./google.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	driver.quit();
    	
    	
    	
    	
    }
}
