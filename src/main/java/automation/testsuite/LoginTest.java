package automation.testsuite;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.LoginPage;

public class LoginTest extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	
	@Test (priority = 1) // Login thành công
	public void LoginSuccessfully() throws InterruptedException 
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com","riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());	
		
		// logout
		Thread.sleep(3000);	
		WebElement profile = driver.findElement(By.xpath("//span[@class='user-name ml10']"));
		WebElement logOut = driver.findElement(By.xpath("//a[normalize-space()='Sign Out']"));
		profile.click();
		logOut.click();
		assertTrue(driver.findElement(CT_Account.WEBSITE).isDisplayed());
			
	}
	
	@Test (priority = 2) // Login thất bại do sai email
	public void LoginFailIncorrectEmail() 
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client_incorrect@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());	
		
	}
	
	@Test (priority = 3) // Login thất bại do sai pass
	public void LoginFailIncorrectPass() 
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client@demo.com","riseDemo_incorrect");
		assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());	
	}
	
	@Test (priority = 4) // Login thất bại do sai cả email và pass
	public void LoginFailIncorrectEmailAndPass() 
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("client_incorrect@demo.com","riseDemo_incorrect");
		assertTrue(driver.findElement(CT_Account.AUTHENTICATION_ALERT).isDisplayed());	
	}
	
	
	@AfterMethod 
	public void closeChromeDriver()
	{
		driver.close(); // đóng cửa sổ
	}
}
