package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_BTVN extends CommonBase {
	
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver("http://demo.seleniumeasy.com/input-form-demo.html");	
	}
	
	@Test
	public void SelectOneOptionFromDropdownlist() throws InterruptedException
	{
		WebElement selectState = driver.findElement(By.name("state"));
		WebElement radioNo = driver.findElement(By.xpath("//input[@value='no']"));
		Select dropdownlist = new Select(selectState);
		
		selectState.click();
		dropdownlist.selectByVisibleText("California");
		Thread.sleep(2000);
		radioNo.click();
	}
	@AfterMethod 
	public void closeChromeDriver()
	{
		driver.close(); // đóng cửa sổ
	}
}