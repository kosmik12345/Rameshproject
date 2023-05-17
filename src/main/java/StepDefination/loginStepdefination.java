	package StepDefination;

import com.cucumber.listener.Reporter;

import Pages.loginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepdefination extends loginpage {

	 @Given("^User is in login page$")
	    public void user_is_in_login_page() throws Throwable
	 {
		 launchApplication();
			//Reporter.addStepLog("login");
		//Reporter.addStepLog("Application is lanuched successfully");
		
		 
	    }

	    @When("^User enters email id \"([^\"]*)\"$")
	    public void user_enters_email_id_something(String strArg1) throws Throwable 
	    {
	    	enterEmailId(strArg1);
	    	//Reporter.addStepLog("User entered email ID successfully"+strArg1);
	    }

	    @Then("^User should be logged in successfully$")
	    public void user_should_be_logged_in_successfully() throws Throwable {
	    	//Reporter.addStepLog("login is done successfully");
	    }

	    @And("^User enters password \"([^\"]*)\"$")
	    public void user_enters_password_something(String strArg1) throws Throwable 
	    
	    {
	    	enterPassword(strArg1);
	    	//Reporter.addStepLog("User entered password successfully"+strArg1);
	    }

	    @And("^User clicks the signin button$")
	    public void user_clicks_the_signin_button() throws Throwable
	    {
	    	clickSigninButton();
	    }
	
	
	

}
