package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user is on login page");
	   
	}

	@When("user enters Username and Password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user enters Username and Password");
	   
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - Clicks on Login button");
	    
	}

	@Then("User is Navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - User is Navigated to Home Page");
	   
	}



}
