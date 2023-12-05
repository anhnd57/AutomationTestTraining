package automation.page;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
    private final WebDriver driver;
    @FindBy(xpath = "//a[@href='https://rise.fairsketch.com/clients']")
    WebElement clientLinks;
    @FindBy(xpath = "//a[@data-title='Add client']")
    WebElement clientButton;
    @FindBy(id="type_person")
    WebElement radioPerson;
    @FindBy(id="company_name")
    WebElement CompanyName;
    @FindBy(xpath = "//ul[@id='select2-results-3']//div[text()='Sara Ann']")
    WebElement ownerItems;
    @FindBy(id="address")
    WebElement txtAddress;
    @FindBy(id="city")
    WebElement txtCity;
    @FindBy(id="state")
    WebElement txtState;
    @FindBy(id="zip")
    WebElement txtZip;
    @FindBy(id="country")
    WebElement txtCountry;
    @FindBy(id="phone")
    WebElement txtPhone;
    @FindBy(id="website")
    WebElement txtWebsite;
    @FindBy(id="vat_number")
    WebElement txtVatNumber;
    @FindBy(id="gst_number")
    WebElement txtGstNumber;
    @FindBy(id="s2id_created_by")
    WebElement ClientGroupDropdownList;
    @FindBy(xpath = "//ul[@class='select2-results']//div[text()='Silver']")
    WebElement ClientGroup;
    @FindBy(id="currency_symbol")
    WebElement txtCurrencySym;
    @FindBy(xpath = "//ul[@class='select2-results']//div[text()='AFD']")
    WebElement txtCurrency;
    @FindBy(id="s2id_client_labels")
    WebElement LabelDropdownList;
    @FindBy(xpath = "//ul[@class='select2-results']//div[text()='Inactive']")
    WebElement txtLabel;
    @FindBy(id="s2id_created_by")
    WebElement ownerDropdownlist;
    @FindBy(id="s2id_currency")
    WebElement CurrencyDropdownlist;

    @FindBy(xpath = "//button[@type='submit' and normalize-space()='Save']")
    WebElement btnSave;
    @FindBy(xpath = "//a[text()='Clients']")
    WebElement ClientTab;
    @FindBy(xpath = "//input[@type='search' and @placeholder='Search']")
    WebElement textboxSearch;
    public ClientPage(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(_driver, this);
    }
    public void AddClient(String companyName, String Owwner) throws InterruptedException {
        clientLinks.click();
        clientButton.click();
        Thread.sleep(2000);
        radioPerson.click();
        CompanyName.sendKeys(companyName);
        ownerDropdownlist.click();
        Thread.sleep(2000);
        ownerItems.click();
        txtAddress.clear();
        txtAddress.sendKeys("Hà Nam");
        Thread.sleep(2000);
        txtCity.clear();
        txtCity.sendKeys("Hà Nam");
        Thread.sleep(2000);
        txtState.clear();
        txtState.sendKeys("hnu");
        txtZip.clear();
        txtZip.sendKeys("123456");
        Thread.sleep(2000);
        txtCountry.clear();
        txtCountry.sendKeys("HN");
        txtPhone.clear();
        txtPhone.sendKeys("0987654321");
        Thread.sleep(2000);
        txtWebsite.clear();
        txtWebsite.sendKeys("ahtyiij.jnu");
        txtVatNumber.clear();
        txtVatNumber.sendKeys("3521232353452");
        txtGstNumber.clear();
        txtGstNumber.sendKeys("2542423542344");
//        ClientGroupDropdownList.sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        ClientGroup.click();
//        Thread.sleep(2000);
//        CurrencyDropdownlist.click();
//        Thread.sleep(3000);
//        txtCurrency.click();
//        Thread.sleep(2000);
//        txtCurrencySym.sendKeys("234234");
//        LabelDropdownList.click();
//        Thread.sleep(3000);
//        txtLabel.click();
//        textboxOwner.sendKeys(Owwner);
//        textboxOwner.sendKeys(Keys.TAB);
        btnSave.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ClientTab);
        Thread.sleep(2000);
        textboxSearch.sendKeys(companyName);
    }
}
