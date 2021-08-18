package stepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WCHomePage;
import pages.WCLoginPage;
import pages.WCMGPAAddDeviceRulePage;
import utility.base;

public class WCMGPAEnrollmentStepDefinitions extends base {

	@Test(priority = 1)
	@Given("User is logged into the home page")
	public void user_is_logged_into_the_home_page() throws Throwable {
		WCLoginPage login = new WCLoginPage(driver);
		login.basePageNavigation();
	}

	@Test(priority = 2)
	@When("User Navigates to rules tab to create MGPA enrollment")
	public void user_navigates_to_rules_tab_to_create_mgpa_enrollment() throws Throwable {
		WCHomePage home_navigateToRules = new WCHomePage(driver);
		home_navigateToRules.navigatetoRules();
	}

	@Test(priority = 3)
	@Then("MGPA Enrollment rule is created with unique enrollment ID")
	public void mgpa_enrollment_rule_is_created_with_unique_enrollment_id() throws Throwable {
		WCMGPAAddDeviceRulePage Create_MGPAenroll = new WCMGPAAddDeviceRulePage(driver);
		Create_MGPAenroll.CreateMGPAEnroll();

	}

}