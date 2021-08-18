package stepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WCApplicationCatalogueAE;
import pages.WCHomePage;
import pages.WCLoginPage;
import utility.base;

public class WCApplicationCatalogueAEStepDefinitions extends base {

	@Test(priority = 1)
	@Given("User is logged into the home page")
	public void user_is_logged_into_the_home_page() throws Throwable {
		WCLoginPage login = new WCLoginPage(driver);
		login.basePageNavigation();
	}

	@Test(priority = 2)
	@When("User Navigates to rules tab to create Application Catalogue rule")
	public void user_navigates_to_global_settings_to_bind_google_account() throws Throwable {
		WCHomePage home_navigateToRules = new WCHomePage(driver);
		home_navigateToRules.navigatetoRules();

	}

	@Test(priority = 3)
	@Then("Application Catalogue rule is created and gets applied to respective folder")
	public void android_enterprise_binding_should_be_completed() throws Throwable {
		WCApplicationCatalogueAE appCatalogueAE = new WCApplicationCatalogueAE(driver);
		appCatalogueAE.CreateAEappCatalogue();
	}

}
