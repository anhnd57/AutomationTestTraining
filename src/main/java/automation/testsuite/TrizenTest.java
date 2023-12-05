package automation.testsuite;

import automation.page.ClientPage;
import automation.page.LoginPage_Factory;
import automation.page.TrizenPage;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TrizenTest extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver((CT_Account.TRIZEN_URL));
    }

    @Test
    public void AddClientSuccessful() throws InterruptedException {
        TrizenPage trizen = new TrizenPage(driver);
        trizen.HandleDateTimeAndDropdownlist();
        assertTrue(driver.findElement(By.xpath("//h2[text()='Flight Search Result']")).isDisplayed());
    }
}
