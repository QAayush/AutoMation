package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import page.SiginPage;
import page.VuseSearchPage;

public class Signinstep {

	SiginPage sign= new SiginPage();
	VuseSearchPage vse= new VuseSearchPage();
	
	
	
	@And ("Click on Accout icon")
	
	public void Click_on_Accout_icon () {
		sign.account_icon();
	}
	
	@When ("user enter correct details")
	public void user_enter_correct_details() {
		sign.enter_signindetails();
	}
	
	@And ("click  button")
	public void click_on_login_button1() {
		sign.clickbtn();
	}


}
