package api.Stepdefinitions;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import org.testng.Assert;
import api.Endpoints.CreateUser;
import api.Payload.UserLoginPojo;
import api.Tests.UserLoginTests;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions  {
	UserLoginPojo loginPayload;
    CreateUser log_Request;
    UserLoginTests log_Tests;
    int responseCode=0;

private static final Logger LOG=LogManager.getLogger(Login_StepDefinitions.class);

@Given("User creates request for the Account API from Excel sheet {string}")
public void user_creates_request_for_the_account_api_from_excel_sheet(String sheetName) {
	log_Request.setUp();
	log_Tests.CreateUser.postUser(loginPayload);
}
    
	
@When("User sends HTTPS POST request for user role")
public void user_sends_https_post_request_for_user_role() {
		log_Request.postUser(loginPayload);
	LOG.info("The user posts a request for Account API: " );	
}

@Then("User receives status code {int} with userid as response body for creating user")
public void user_receives_status_code_with_userid_as_response_body_for_creating_user(Integer int1) {
	Assert.assertEquals(responseCode, int1);
	LOG.info("The user generates UserId: " + responseCode );
}

//@Then("validate JSON Schema for login response with {string}")
//public void validate_json_schema_for_login_response_with(String string) {
//   
//}

//@Then("User receives status code {int} with token for authentication as response body for Token generation")
//public void user_receives_status_code_with_token_for_authentication_as_response_body_for_token_generation(Integer int1) {
//   
//}
//
//@When("User sends HTTPS POST request for user role with token")
//public void user_sends_https_post_request_for_user_role_with_token() {
//    
//}
//
//@Then("User receives status code {int} with response body for Authorizing user")
//public void user_receives_status_code_with_response_body_for_authorizing_user(Integer int1) {
//    
//}


}