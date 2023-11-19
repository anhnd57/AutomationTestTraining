package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day8_Practice2 extends CommonBase {
	
	@BeforeMethod
	public void openChromeDriver()
	{
		driver = initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui");
	}
	@Test (priority = 2)
	public void getLocatorByText()
	{
		WebElement linkMayRuaChen =	driver.findElement(By.linkText("Máy Rửa Chén Bát"));
		System.out.println("Location của link máy rử chén là: " + linkMayRuaChen);
		
		WebElement LinkTextMayHutMui = driver.findElement(By.partialLinkText("Cổ Điển"));
		System.out.println("Location của link text máy hút mùi cổ điển là: " + LinkTextMayHutMui);
	}
	
	@Test (priority = 1)
	public void getLocatorByClassName_TagName ()
	{
		pause(3000);
		System.out.println("Checkbox xuất sứ là: " + driver.findElement(By.className("cursor-pointer")));
		//System.out.println("Số lượng checkbox có class name là: " + driver.findElements(By.className("cursor-pointer")).size());
		
		WebElement input = driver.findElement(By.tagName("input"));
		System.out.println("Thẻ có tên input là: " + input);
	}
	
	private void pause(int i) {
		// TODO Auto-generated method stub
		
	}
	@AfterMethod 
	public void closeChromeDriver()
	{
		driver.close(); // đóng cửa sổ
	}
}
