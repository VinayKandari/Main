/*package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Browser Drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select s = new Select(driver.findElement(By.id("tools")));
		
		List<WebElement>  myTools = s.getOptions();
		
		List <String> actualList = new ArrayList<>();
		
		for (WebElement e : myTools){
			
			actualList.add(e.getText());
		}
		
		List <String> temp = new ArrayList<>();
		temp.addAll(actualList);
		
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
		
		
	}

	
	@Test
	public void test2() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Browser Drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select s = new Select(driver.findElement(By.id("tools1")));
		
		List<WebElement>  myTools = s.getOptions();
		
		List <String> actualList = new ArrayList<>();
		
		for (WebElement e : myTools){
			
			actualList.add(e.getText());
		}
		
		List <String> temp = new ArrayList<>();
		temp.addAll(actualList);
		
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
		
		
	}

}
*/