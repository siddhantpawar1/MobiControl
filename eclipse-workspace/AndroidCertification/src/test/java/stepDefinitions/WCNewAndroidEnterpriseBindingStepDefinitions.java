package stepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WCAndroidEnterpriseBinding;
import pages.WCGlobalSettingsHomePage;
import pages.WCLoginPage;
import pages.WCNewAndroidEnterpriseBinding;
import utility.base;

public class WCNewAndroidEnterpriseBindingStepDefinitions extends base {

	@Test(priority = 1)
	@Given("User is logged into the home page")
	public void user_is_logged_into_the_home_page() throws Throwable {
		WCLoginPage login = new WCLoginPage(driver);
		login.basePageNavigation();
	}

	@Test(priority = 2)
	@When("User Navigates to Global Settings to bind Google Account")
	public void user_navigates_to_global_settings_to_bind_google_account() throws Throwable {
		WCGlobalSettingsHomePage gsHome = new WCGlobalSettingsHomePage(driver);
		gsHome.navigatetoGlobalSettings();

	}

	@Test(priority = 3)
	@Then("Android Enterprise binding should be completed")
	public void android_enterprise_binding_should_be_completed() throws Throwable {
		WCNewAndroidEnterpriseBinding CreateNewAEBinding = new WCNewAndroidEnterpriseBinding(driver);
		CreateNewAEBinding.CreateNewEnterpriseBindings();
	}

}