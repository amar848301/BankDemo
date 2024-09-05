package stepDefinitions;

import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CustomerPageObject;

public class Customers {
	
	public CustomerPageObject cust;
	
	@When("create a single customer with given details")
	public void create_a_single_customer_with_given_details(DataTable dataTable) {
		Map<String, String> customerDetails = dataTable.asMaps().get(0);

        String customerName = customerDetails.get("customerName");
        String gender = customerDetails.get("gender");
        String dob = customerDetails.get("dob");
        String address = customerDetails.get("address");
        String city = customerDetails.get("city");
        String state = customerDetails.get("state");
        String pin = customerDetails.get("pin");
        String mobile = customerDetails.get("mobile");
        String email = customerDetails.get("email");
        String password = customerDetails.get("password");
		cust = new CustomerPageObject();
		cust.createUser(customerName, gender, dob, address, city, state, pin, mobile, email, password);
	}

	@Then("verify the creation message")
	public void verify_the_creation_message() {
		cust.verifyCustomer();
	}
}
