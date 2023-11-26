package automation.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day12_Checkbox extends CommonBase {
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html\r\n");
	}

	@Test
	public void ClickOnCheckBox()
	{
		//Kiểm tra rằng sau khi page được mở thì default checked đã đc check
		
		WebElement defaultChecked = driver.findElement(By.xpath("//input[@id='isAgeSelected']/following::input[1]"));
				boolean status = defaultChecked.isSelected();
		System.out.println("Status is: " + status);
		
		//Kiểm tra checkbox tên Click on this check box chưa đc selected thì click
		
		WebElement clickOnThisChb = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
				if(clickOnThisChb.isSelected()== false)
				{
					clickOnThisChb.click();
					System.out.println("Check box Click on this check box was checked");
				}
				
				// Lấy Xpath của Default Disable, tìm element này, element.isEnable(); element.isDisplayed()
	}
	
	@Test
	public void clickOnMultiCheckBox() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> listCheckbox;
		//Lấy tổng số checkbox
		listCheckbox = driver.findElements(By.xpath("//div[text()='Multiple Checkbox Demo']/following-sibling::div[@class='panel-body']/child::div[@class='checkbox']//input"));
		for(int i = 0; i<listCheckbox.size(); i++)
		{
			WebElement checkbox = listCheckbox.get(i);
			if(checkbox.isSelected() == false)
			{
				checkbox.click();
				System.out.println("Checkbox thứ "+(i+1)+ " đã được checked");
			}
		
		}
	}
}
