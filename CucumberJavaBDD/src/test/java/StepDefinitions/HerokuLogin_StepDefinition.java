package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.Pages.*;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HerokuLogin_StepDefinition {
	
	

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private BaseClass baseClass;
	
	

	@Given("Browser is Open and Application Launched")
	public void browser_is_open() throws InterruptedException {

		DriverFactory.getDriver().get("https://the-internet.herokuapp.com/");
		loginPage.clickFormAuth();
		
	}


	@And("User is on The Internet Application Login Page")
	public void user_is_on_naukri_login_page() {
		String PageTitle = loginPage.getLoginPageTitle();
		System.out.println("Inside Step - User is on" +PageTitle);
	}

	@When("User enters Naukri Username and Password")
	public void user_enters_username_and_password(String Username,String Password) {
		loginPage.doLogin(Username, Password);
		System.out.println("Inside Step - user enters Naukri Username and Password");
		
	}	
	
	@Then("User is Navigated to The Internet Application Home Page")
	public void user_is_navigated_to_naukri_home_page() {
		
		System.out.println("Inside Step - User is Navigated to Naukri Home Page");
		baseClass.quitBrowser();
	}
	
	@When("^User enters The Internet Application (.*) and (.*)$")
	public void user_enters_username_and_password_parameters(String Username , String Password) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println("Inside Step - user enters Naukri Username and Password");
		loginPage.doLogin(Username, Password);
	}

}
