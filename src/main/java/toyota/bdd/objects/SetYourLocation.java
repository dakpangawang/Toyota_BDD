package toyota.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toyota.bdd.common.CommonActions;

public class SetYourLocation {

	CommonActions actions;

	public SetYourLocation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(xpath = "//h1[normalize-space(text())='Set your location']")
	WebElement setYourLocationPageTitle;

	@FindBy(xpath = "//input[@name='zipcode']")
	WebElement zipCodeInput;

	@FindBy(xpath = "//button[normalize-space(text())='Submit']")
	WebElement submitBtn;

	public void validateSetYourLocationPageTitle(String expectedTitle) {
		actions.validate(setYourLocationPageTitle, expectedTitle);
	}

	public void enterZipCode(String zip) {
		actions.insert(zipCodeInput, zip);
	}

	public void clickSubmit() {
		actions.click(submitBtn);
	}

}
