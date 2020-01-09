package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlipkartLoginDefinitions {
	
	
	@Given("FlipKart is up and running and is launched")
	public void flipkart_is_up_and_running_and_is_launched() {
		System.out.println("In Given");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User clicks on SignIn Link")
	public void user_clicks_on_SignIn_Link() {
		System.out.println("In Then");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User provides valid credentials")
	public void user_provides_valid_credentials() {
		System.out.println("In Then");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User Clicks on Submit button")
	public void user_Clicks_on_Submit_button() {
		System.out.println("In Then");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

}
