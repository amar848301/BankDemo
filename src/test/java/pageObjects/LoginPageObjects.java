package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helpers.CommonFunction;
import util.Base;

public class LoginPageObjects extends CommonFunction {
	
	public WebDriver driver = Base.driver;

	@FindBy(xpath = "//input[@name='uid']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@name='btnReset']")
	private WebElement resetButton;
	@FindBy(xpath = "//td[contains(text(), 'Manger Id : mngr588276')]")
	private WebElement id;

	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void getLoginDetails() throws IOException, InterruptedException {
		sendTextToElement(username, Base.getData().getProperty("username"));
		sendTextToElement(password, Base.getData().getProperty("password"));
		clickElement(loginButton);
	}
}
