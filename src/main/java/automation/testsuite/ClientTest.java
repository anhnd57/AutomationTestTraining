package automation.testsuite;

import automation.page.ClientPage;
import automation.page.LoginPage_Factory;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Pause;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ClientTest extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver((CT_Account.RISE_URL));
    }

    @Test
    public void AddClientSuccessful() throws InterruptedException {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.LoginFunction("admin@demo.com","riseDemo");
        ClientPage client = new ClientPage(driver);
        client.AddClient("Disk2 Company","Sara Ann");

        Thread.sleep(2000);

        assertTrue(driver.findElement(By.xpath("//a[text()='Disk2 Company']")).isDisplayed());
//        isElementPresent(By.xpath(Disk1's Company));

    }
}
