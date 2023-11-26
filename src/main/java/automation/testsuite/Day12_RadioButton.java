package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_RadioButton extends CommonBase {

	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");	
	}
	
	@Test
	public void testCheckbox()
	{
		//Kiểm tra giá trị mặc định của radio Male và Female là chưa check
		
		WebElement radioMale = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement radioFemale = driver.findElement(By.xpath("//input[@value='Male']"));
		System.out.println("Trạng thái của radio male là: " + radioMale.isSelected());
		System.out.println("Trạng thái của radio female là: " + radioFemale.isSelected());
		
		//Kiểm tra radio chưa được check thì click vào
		if(radioMale.isEnabled()== true && radioMale.isSelected()== false);
		{
			radioMale.click();
		}
		
	}
}
