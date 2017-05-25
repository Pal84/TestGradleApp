package login;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefineStepDefs {

	@Given("^valid \"(.*?)\", \"(.*?)\", \"(.*?)\" are given$")
	public void valid_are_given(String firstName, String lastName, String emailId) throws Throwable {
		
		System.out.println("First Name : " + firstName + "; Last Name : " 
				+ lastName + "; email address : " + emailId + ";");
		
		Assert.assertNotNull(firstName);
		Assert.assertNotNull(lastName);
		Assert.assertNotNull(emailId);
	}

	@When("^\"(.*?)\" is clicking confirm button$")
	public void is_clicking_confirm_button(String arg1) throws Throwable {

	}

	@Then("^New user is successfully registered$")
	public void new_user_is_successfully_registered() throws Throwable {

	}	
	
}
