package testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Facebook1 {
	
	ChromeDriver driver;
	
	@Test
	
    public void method() throws InterruptedException{
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElementById("email").sendKeys("test");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Hello").perform();
		act.sendKeys(Keys.RETURN).perform();
    	
    }
    
    

}
