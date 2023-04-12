package stepDefination;

import io.cucumber.java.en.And;

import page.Redirecttogooglepage;

public class Redirectsteps {

	Redirecttogooglepage redirect=new Redirecttogooglepage();
	
	@And ("Click on  IAM under18 button")
	
	public  void  Click_on_IAM_under18_button() {
		redirect.accept_Iamunder18_button();
	}
	
	
	
}
