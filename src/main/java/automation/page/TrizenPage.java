package automation.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrizenPage {
    private final WebDriver driver;
    @FindBy (xpath="(//label[text()='Departing'])[1]/following-sibling::div/input")
    WebElement textDepartingDate;

    @FindBy (xpath="(//label[text()='Passengers'])[1]//following-sibling::div/div")
    WebElement dropboxPassenger;

    @FindBy (xpath = "(//label[text()='Adults'])[1]/following-sibling::div//i[@class='la la-plus']")
    WebElement addAdult;
    @FindBy (xpath="(//div[@class='form-group']/input[@class='form-control'])[1]")
    WebElement FlyingFrom;
    @FindBy (xpath="(//div[@class='form-group']/input[@class='form-control'])[2]")
    WebElement FlyingTo;
    @FindBy (xpath="(//button [@class='btn dropdown-toggle btn-light'])[3]")
    WebElement CoachDropdownList;
    @FindBy (xpath="//a[@class='dropdown-item active selected']")
    WebElement Coach;
    @FindBy (xpath="(//a[@href='flight-search-result.html'])[2]")
    WebElement btnSearch;
    public TrizenPage(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public void HandleDateTimeAndDropdownlist() throws InterruptedException {
        FlyingFrom.clear();
        FlyingFrom.sendKeys("Hà Nội");
        FlyingTo.clear();
        FlyingTo.sendKeys("Hồ Chí Minh");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('readonly', 'readonly')", textDepartingDate);
        textDepartingDate.clear();
        textDepartingDate.sendKeys("01042024");
        textDepartingDate.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        dropboxPassenger.click();
        Thread.sleep(2000);
        addAdult.click();
        Thread.sleep(2000);
        CoachDropdownList.click();
        Thread.sleep(2000);
        Coach.click();
        btnSearch.click();
    }
}
