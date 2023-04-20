package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	//given will take from cucumber library.. add in pom.xml
	
	@Given ("User navigates to login page")
	
		public void User_navigates_to_login_page() {
			
		}
@When("User enters valid email address {string} into email field")
public void user_enters_valid_email_address_into_email_field(String string) {
  
}

@And("User enters valid password {string} into password field")
public void user_enters_valid_password_into_password_field(String string) {
    
}

@And("User clicks on Login button")
public void user_clicks_on_login_button() {
   
}

@Then("User should get successfully logged in")
public void user_should_get_successfully_logged_in() {
   
}
//********************************************************


@When("User enters invalid emailaddress {string} into email field")
public void user_enters_invalid_emailaddress_into_email_field(String invalidEmailText) {

}

@And("User enters invalid password {string} into password field")
public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {
  
}

@And("User click on Submit button")
public void user_click_on_submit_button() {
  
}

@Then("User should get proper warning message about credential mismatch")
public void user_should_get_proper_warning_message_about_credential_mismatch() {
    
}
//***************************************************
@When("User enters the valid email address {string} into email field")
public void user_enters_the_valid_email_address_into_email_field(String validEmailText) {
   
}

@And("User enters the invalid email address {string} into email field")
public void user_enters_the_invalid_email_address_into_email_field(String invalidPasswordText) {
    
}
//************************************************
@When("User do not enter any email address into email field")
	public void user_do_not_enter_any_email_address_into_email_field() {
	    
	}
@And("User do not enter any password into password field")
	public void user_do_not_enter_any_password_into_password_field() {
	}
}
