package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_BTVN extends CommonBase {
	
	@BeforeMethod
	
	public void openChromeDriver()
	{
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
	}
	
	@Test
	public void GetLocator ()
	{
		//Name
				System.out.println("Location name là: " + driver.findElement(By.id("name")));
				
		//Adress
				System.out.println("Location add là: " + driver.findElement(By.name("address")));
		
		//Email
				System.out.println("Location email là: " + driver.findElement(By.tagName("input")));
				
		//Password
				System.out.println("Location password là: " + driver.findElement(By.id("password")));
	}
}
