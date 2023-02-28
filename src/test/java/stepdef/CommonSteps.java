package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import toyota.bdd.base.BaseClass;
import toyota.bdd.reporting.Logs;

public class CommonSteps extends BaseClass {
	
	@Given("this is a price test")
	public void this_is_a_price_test() {
		Logs.log("*** This is a background step ***");
	}
	
	@Given("validating landing page title")
	public void validating_landing_page_title() {
		landingPage.validateLandingPageTitle("Explore All Vehicles");
	}

	@When("click buildAndPrice")
	public void click_build_and_price() {
		landingPage.clickBuildAndPrice();
	}

	@Then("validate set your location page tile")
	public void validate_set_your_location_page_tile() {
		setYourLocation.validateSetYourLocationPageTitle("SET YOUR LOCATION");
	}

	@When("enter zipCode {string}")
	public void enter_zip_code(String zipcode) {
		setYourLocation.enterZipCode(zipcode);
	}

	@Then("click submit")
	public void click_submit() {
		setYourLocation.clickSubmit();
	}

	@When("validate build your toyota page title")
	public void validate_build_your_toyota_page_title() {
		buildYourToyotaPage.validateBuildYourToyotaPageTitle("Build Your Toyota");
	}
}
