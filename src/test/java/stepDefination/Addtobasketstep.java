package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Addtobasketpage;

public class Addtobasketstep {

	Addtobasketpage addbskt= new Addtobasketpage();
	
	@And ("Click on product")
	
	public void click_on_product() {
		addbskt.clickOnProduct();
		
	}
	
	@When ("Click on add to basket button")
	
	public void click_on_add_to_basket() {
		addbskt.clickOnBasket();
	}
	
	@Then ("Product add successfully into a basket")
	public void product_add_successfully_into_abasket() {
		addbskt.chekcItemAddIntoBasket();
	}
	
}
