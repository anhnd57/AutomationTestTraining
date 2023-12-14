package automation.testsuite;

import automation.common.CommonBase_Demo;
//import javafx.scene.control.ComboBoxBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Test_Alert extends CommonBase_Demo {
    @BeforeMethod
    public void InitChromeDriver(){
        driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
    }

    @Test(priority = 1)
    public void AlertwithOK(){
        click(By.xpath("//button[@class='btn btn-danger']"));
        driver.switchTo().alert().accept();
    }

    @Test(priority = 2)
    public void AlertWithOkAndCancle(){
        click(By.xpath("(//a[@class='analystic'])[2]"));
        click(By.xpath("//button[@class='btn btn-primary']"));
        driver.switchTo().alert().accept();
    }

    @Test(priority = 3)
    public void AlertWithText() throws InterruptedException {
        click(By.xpath("(//a[@class='analystic'])[3]"));
        click(By.xpath("//button[@class='btn btn-info']"));
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Class 15.10");
        driver.switchTo().alert().accept();
        assertTrue(isElementPresent(By.xpath("//p[text()='Hello Class 15.10 How are you today']")));
    }

    @AfterMethod
    public void CloseDriver(){
        driver.close();
    }
}
