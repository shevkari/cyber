package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComStepDef {

	@Given("I enter UN")
	public void i_enter_un() {
		System.out.println("Enter UN");
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	@When("I enter PWD")
	public void i_enter_pwd() {
		System.out.println("Enter password");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("I get Login")
	public void i_get_login() {
		System.out.println("Login Successfull");
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}

	
	
}
