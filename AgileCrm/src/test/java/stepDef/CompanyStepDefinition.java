package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CompanyStepDefinition {
	
	RequestSpecification specification;
	Response response;
	
	@Given("I setup a request structure to get company info")
	public void i_setup_structure(DataTable table)
	{
		specification=RestAssured.given().relaxedHTTPSValidation();
		
		specification.baseUri("https://rest.agilecrm.com/")
		.basePath("dev/api/contacts/companies/")
		.auth().basic("Rest_Api@yopmail.com", "1nu9s51u47ssmc4jdlb8qinvtm")
		.header("Accept","application/json")
		.log().all();
	}
	
	
	@When("I hit an api to get all info")
	public void i_hit_api()
	{
		response = specification.post("list");
	}
	
	@Then("I verify with company response")
	public void i_get_response()
	{
		response.prettyPrint();
	}

}
