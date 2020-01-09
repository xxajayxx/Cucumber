package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Tag {
	@Given("the app is launched")
	public void the_app_is_launched() {
		System.out.println("app launched1");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("enter the url")
	public void enter_the_url() {
		System.out.println("app launched2");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Given("the username and password are know")
	public void the_username_and_password_are_know() {System.out.println("app launched3");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("enter them in fields")
	public void enter_them_in_fields() {System.out.println("app launched4");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Click login")
	public void click_login() {System.out.println("app launched5");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Given("on the product page")
	public void on_the_product_page() {System.out.println("app launched6");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("add the product")
	public void add_the_product() {System.out.println("app launched7");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Click next")
	public void click_next() {System.out.println("app launched8");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Given("on the homepage")
	public void on_the_homepage() {System.out.println("app launched9");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("click on logout")
	public void click_on_logout() {System.out.println("app launched10");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Accept")
	public void accept() {System.out.println("app launched11");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

}
