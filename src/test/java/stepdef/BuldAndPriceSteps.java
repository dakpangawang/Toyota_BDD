package stepdef;

import io.cucumber.java.en.Then;
import toyota.bdd.base.BaseClass;

public class BuldAndPriceSteps extends BaseClass {
	
	

	@Then("click camry hybrid2023")
	public void click_camry_hybrid2023() {
		buildYourToyotaPage.clickCamryHybrid2023();
	}

	@Then("validate camryLEhybrid page title")
	public void validate_camry_l_ehybrid_page_title() {
		camryLEHybridPage.validateCamryLEHybridPageTitle("2023 Camry LE Hybrid");	}

	@Then("click next step button")
	public void click_next_step_button() {
		camryLEHybridPage.clickNextStepBtn();
		camryLEHybridPage.clickNextStepBtn();
		camryLEHybridPage.clickNextStepBtn();
		camryLEHybridPage.clickNextStepBtn();
		camryLEHybridPage.clickNextStepBtn();
	}

	@Then("click request a quote button")
	public void click_request_a_quote_button() {
		camryLEHybridPage.clickRequestAQuoteBtn();
	}


}
