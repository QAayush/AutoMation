package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginSwagspage;

public class LoginSwags {

	LoginSwagspage login = new LoginSwagspage();
	
	
	@Given("launch site")
	public void launch_site() {
		login.launchurl();
	}

	@When("^user enter correct \"([^\"]*)\" correct \"([^\"]*)\"$")
	public void user_enter_correct_username_and_password(String username, String password) {
		login.entercorrect_username_password(username, password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		login.click_loginbtn();
	}

	@Then("Swags labs logo visible")

	public void swags_labs_logo_visible() {
		login.swagLabsLogo();

	}
//	
//	@When ("user enter incoorect user name and password")
//	
//	public void user_enter_incoorect_user_name_and_password() {
//		login.enterincorrect_username_password();
//	}
//	
//	@And ("click_on_login_button")
//	public void click_button() {
//		support.clickbttn("//input[@type='submit']");;
//
//	}
//	
//	@Then ("user received error message")
//	public void user_received_error_message() {
//		login.check_alert();
//	}
//	
//	
}
