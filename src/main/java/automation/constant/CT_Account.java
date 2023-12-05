package automation.constant;

import org.openqa.selenium.By;

public class CT_Account {
	public static String RISE_URL = "https://rise.fairsketch.com/signin";
	public static By TEXT_EMAIL = By.id("email");
	public static By TEXT_PASSWORD = By.id("password");
	public static By BUTTON_SIGNIN = By.xpath("//button[text()='Sign in']");
	public static By DASHBOARD_TEXT = By.xpath("//span[text()='Dashboard and @class='menu-text']");		
	public static By AUTHENTICATION_ALERT = By.xpath("//div[normalize-space()='Authentication failed!']");
	public static By WEBSITE = By.xpath("//div[normalize-space()='Sign in']");
	public static By SIGNIN_TEXT = By.xpath("//div[@class='card-header text-center']/h2");
	public static String TRIZEN_URL = "https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html";
}
