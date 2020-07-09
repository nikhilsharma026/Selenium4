package selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow 
{
	static WebDriver driver;
	
	
	public static void main( String[] args ) throws InterruptedException
    {
        //Instead of using this set property command, we can also use below code:
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil Sharma\\Documents\\Browser Drivers\\chromedriver.exe");
    	
    	WebDriverManager.chromedriver().setup();
    	
    	
    	driver = new ChromeDriver();
    	driver.get("http://www.google.com");
    	driver.manage().window().maximize();

    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	NewWindow.newWindow();
    	NewWindow.getlocationOFWebElement();
    	
    }
	
	
	
    public static void newWindow() throws InterruptedException {
    	
    	String first= driver.getWindowHandle();
    	
    	driver.switchTo().newWindow(WindowType.TAB);
    	
    	driver.get("http://www.facebook.com");
    	
    	String second= driver.getWindowHandle();
    	
    	driver.switchTo().newWindow(WindowType.WINDOW);
    	
    	driver.get("http://www.youtube.com");
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Set<String> windows = driver.getWindowHandles();
    	Iterator<String> it = windows.iterator();
    	while(it.hasNext()) {
    		
    		System.out.println(it.next());
    	}
    	
    	driver.switchTo().window(first);
    	
    	Thread.sleep(3000);
    	
    	driver.switchTo().window(second);
    	
    	driver.navigate().to("http://www.youtube.com");
    	
    	driver.get("http://www.facebook.com");
    	
    	Thread.sleep(3000);
    	
    	
    }
    
    public static void getlocationOFWebElement() {
    	WebElement web = driver.findElement(By.xpath("//u[text()='Facebook']/parent::i"));
    	
    	System.out.println(web.getRect().getDimension().getHeight());
    	System.out.println(web.getRect().getDimension().getWidth());
    	System.out.println(web.getRect().getX());
    	System.out.println(web.getRect().getY());
    	
    	driver.quit();
    }
}
