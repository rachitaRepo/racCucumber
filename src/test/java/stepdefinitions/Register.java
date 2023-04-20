package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	   
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
	   
	}

	@And("User select privacy policy")
	public void user_select_privacy_policy1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
	   
	   
	}

	@When("User select  yes for Newsletter")
	public void user_select_yes_for_newsletter() {
	    
	}

	@When("User select Privacy Policy")
	public void user_select_privacy_policy() {
	    
	}

	@Then("User should get proper warning message about duplicate email")
	public void user_should_get_proper_warning_message_about_duplicate_email() {
	   
	}
	@When("User don't enter any details into fields")
	public void user_don_t_enter_any_details_into_fields() {
	    
	}

	@Then("User should get proper warning messages for every mandatory fields")
	public void user_should_get_proper_warning_messages_for_every_mandatory_fields() {
	   
	}
	
}
