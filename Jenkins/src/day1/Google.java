package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	
	WebDriver driver;
	
	@Test	
	public void getDimensions() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:/Browser Drivers/chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		int height = driver.findElement(By.id("hplogo")).getSize().height;
		System.out.println("Height is " + height);
	}

}
