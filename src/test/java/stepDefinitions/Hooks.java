package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.Base;

public class Hooks {

	public WebDriver driver = Base.driver;

	@Before
	public void openBrowser() throws IOException {
		Base.initilizeDriver();
		Base.launchUrl();
	}

	@After
	public void tearDown() {
		driver.close();
	}
}