package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.CommonFunction;
import util.Base;

public class CustomerPageObject extends CommonFunction {

	public WebDriver driver = Base.driver;

	@FindBy(xpath = "//a[.='New Customer']")
	WebElement newCustomerMenu;
	@FindBy(xpath = "//input[@name='name']")
	WebElement customerName;
	@FindBy(xpath = "//input[@value='m']")
	WebElement Cmale;
	@FindBy(xpath = "//input[@value='f']")
	WebElement Cfemale;
	@FindBy(xpath = "//input[@name='dob']")
	WebElement customerDOB;
	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement customerAddress;
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pinCode;
	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement telephoneNo;
	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailId;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submitButton;
	@FindBy(xpath = "//*[@id='customer']/tbody/tr[4]/td[2]")
	WebElement custId;

	public CustomerPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void createUser(String Cname, String Cgender, String Cdob, String Caddress, String Ccity, String Cstate,
			String Cpin, String Cphone, String Cemail, String Cpassword) {
		clickElement(newCustomerMenu);
		sendTextToElement(customerName, Cname);
		switch (Cgender) {
		case "M":
			clickElement(Cmale);
		case "F":
			clickElement(Cfemale);
		}
		String[] extractedDob = Cdob.split("-");
		for (String s : extractedDob) {
			sendTextToElement(customerDOB, s);
		}
		sendTextToElement(customerAddress, Caddress);
		sendTextToElement(city, Ccity);
		sendTextToElement(state, Cstate);
		sendTextToElement(pinCode, Cpin);
		sendTextToElement(telephoneNo, Cphone);
		sendTextToElement(emailId, Cemail);
		sendTextToElement(passWord, Cpassword);
		clickElement(submitButton);
	}
	
	public void verifyCustomer()
	{
		String text = getTextFromElement(custId);
		System.out.println(text);
	}
}
