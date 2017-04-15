package testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {

	FirefoxDriver driver;

	@BeforeMethod
	public void before() {

		System.setProperty("webdriver.gecko.driver", "C:\\Browser Drivers\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test
	public void method() throws InterruptedException, IOException {

		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("Test");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord("Hello")).perform();
		act.sendKeys(Keys.RETURN).perform();
		//driver.findElement(By.id("pass")).sendKeys("Test");
		// driver.findElement(By.id("u_0_q")).click();
		// driver.findElement(By.id("day")).click();

		/*
		 * File f1 = driver.getScreenshotAs(OutputType.FILE); File f2 = new
		 * File("C://New folder//SS1.png"); FileUtils.copyFile(f1, f2);
		 * 
		 * Select dropdown = new Select(driver.findElement(By.id("day")));
		 * dropdown.selectByIndex(2); Thread.sleep(2000);
		 * 
		 * File f3 = driver.getScreenshotAs(OutputType.FILE); File f4 = new
		 * File("C://New folder//SS2.png"); FileUtils.copyFile(f3, f4);
		 */

	}

	/*@AfterMethod
	public void after() {

		driver.quit();
	}*/

}
