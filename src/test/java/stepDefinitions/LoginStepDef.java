package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import pageObjects.LoginPageObjects;

public class LoginStepDef {

	@Given("login into the application with manager id")
	public void login_into_the_application_with_manager_id() throws IOException, InterruptedException {
		LoginPageObjects login = new LoginPageObjects();
		login.getLoginDetails();
	}
}
