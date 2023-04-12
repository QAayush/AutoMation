package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.VuseSearchPage;

public class VuseSearchstep {

	
	VuseSearchPage searchinput = new VuseSearchPage();
	
	@Given ("launch url")
	public void launch_the_url() {
		searchinput.launchurl();
	}
	@When ("Verify user accept all cookies and age")
	public void Verify_user_accept_all_cookies_and_age() {
		searchinput.cookies_accet();
		searchinput.age_Accept();
	}

	@When ("User able to enter search item into search file")
	public void User_able_to_enter_search_item_into_search_file() {
		searchinput.enter_searchproduct();
	}

	@Then ("visible all products")
	public void Then_visible_all_products() {
		searchinput.visible_product();
	}
}
