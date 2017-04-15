package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	ChromeDriver driver;
	
	@org.testng.annotations.Test

	public void Method() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://shop.theTestingWorld.com");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(driver.findElementByXPath("//*[text()='Components']")).perform();
		Thread.sleep(3000);
		act.click(driver.findElementByXPath("//*[text()='Monitors (2)'")).perform();
	}

}
