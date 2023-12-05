package automation.testsuite;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.page.LoginPage;
import automation.page.LoginPage_Factory;

public class LoginTest_Factory extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_Account.RISE_URL);
	}
	
	@Test (priority = 1) // Login thành công
	public void LoginSuccessfully()
	{
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("client@demo.com","riseDemo");
		assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());	
		
	}
}
