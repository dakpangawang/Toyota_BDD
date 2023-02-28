package toyota.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toyota.bdd.common.CommonActions;

public class BuildYourToyotaPage {
	
	CommonActions actions;
	
	public BuildYourToyotaPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}
	
	@FindBy (css = ".ttac-headline.align-center")
	WebElement buildYourToyotaPageTitle;
	
	@FindBy (xpath = "//div[@data-aa-link-text='build 2023 camry']//following-sibling::div[@data-aa-link-text='build 2022 camryhybrid']//following-sibling::div[@data-aa-link-text='build 2023 camryhybrid']")
	WebElement camryHybrid2023Car;
	
	
	public void validateBuildYourToyotaPageTitle (String expectTile) {
		actions.validate(buildYourToyotaPageTitle, expectTile);
	}
	
	public void clickCamryHybrid2023 () {
		actions.click(camryHybrid2023Car);
	}

}
