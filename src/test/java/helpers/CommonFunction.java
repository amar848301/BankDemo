package helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Base;

public class CommonFunction {
	
	public static WebDriverWait wait;
	private static final Logger logger = LoggerFactory.getLogger(CommonFunction.class);


	public static void sendTextToElement(WebElement element, String text)
	{
		try {
		element.clear();
		element.sendKeys(text);
		logger.info("SENDING TEXT "+text+" TO ELEMENT "+element.toString());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void clickElement(WebElement element)
	{
		waitForElementToBeClickable(element);
		element.click();
		logger.info("CLICKING ON ELEMENT "+element);
	}
	
	public String getTextFromElement(WebElement element)
	{
		logger.info("TEXT "+element.getText()+" EXTRACTED FROM ELEMENT "+element.toString());
		return element.getText();
	}
	
	public static void waitForElementToBeClickable(WebElement element)
	{
		logger.info("WAITING FOR ELEMENT "+element+" TO BE CLICKABLE");
		wait = new WebDriverWait(Base.driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
