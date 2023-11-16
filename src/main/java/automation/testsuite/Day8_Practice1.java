package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Practice1 extends CommonBase{
	
	@BeforeMethod
	public void openChromeBrower()
	{
		driver = initChromeDriver("https://rise.fairsketch.com/signin");
	}
	
	@Test
	public void getLocatorById()
	{
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Email element is: " + email);
		
		// Tìm password
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Password element is: " + password);
		
		// Lấy button Signin bằng class name
		
		WebElement btnSignin = driver.findElement(By.className("w-100"));
		System.out.println("Signin button element is " + btnSignin);
		
	}
	
	@AfterMethod // TestNG annotation (chú thích trong testNG)
	public void closeChromeDriver()
	{
		driver.close(); // đóng cửa sổ
	}
}
