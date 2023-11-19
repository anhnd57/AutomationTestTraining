package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Practice3 extends CommonBase {
	
	@BeforeMethod
	public void openChromeDriver()
	{
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	@Test 
	public void getLocatorsOnThePage()
	{
		//User Email
		WebElement UserEmail =	driver.findElement(By.id("userId"));
		System.out.println("Location của user email " + UserEmail);
		
		//Password
		System.out.println("Location password là: " + driver.findElement(By.id("pass")));
		
		//Company
		System.out.println("Location company là: " + driver.findElement(By.name("company")));
		
		
		//MobileNumber
		System.out.println("Location MobileNumber là: " + driver.findElement(By.name("mobile number")));
	}
		
	@AfterMethod 
	public void closeChromeDriver()
	{
		//driver.close(); // đóng cửa sổ
	}
}
