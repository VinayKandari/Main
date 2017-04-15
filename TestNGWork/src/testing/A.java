package testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class A {
	
	
	@BeforeMethod
	public void before(){
		
		System.out.println("Before");
	}
	
	@Test(groups={"Smoke"})
	public void testcase1(){
		
		System.out.println("Test Case1");
		
	}
	
	@Test()
	public void testcase2(){
		
		System.out.println("Test Case2");
	}

	@AfterMethod
	public void after(){
		
		System.out.println("After");
	}
	
}
