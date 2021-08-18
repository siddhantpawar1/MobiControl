package stepDefinitions;

import java.io.IOException;

import org.testng.annotations.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WCCleanAddDeviceRulePage;
import pages.WCHomePage;
import pages.WCLoginPage;
import utility.base;

public class WCCleanEnrollmentStepDefinitions extends base {

	// Clean Enrollment class object creation to call in this class

	@Test(priority = 1)
	@Given("User is logged into the home page")
	public void user_is_logged_into_the_home_page() throws Throwable {
		WCLoginPage login = new WCLoginPage(driver);
		login.basePageNavigation();
	}

	@Test(priority = 2)
	@When("User Navigates to rules tab to create clean enrollment")
	public void user_Navigates_to_rules_tab_to_create_clean_enrollment() throws IOException {
		WCHomePage home_navigateToRules = new WCHomePage(driver);
		home_navigateToRules.navigatetoRules();
	}

	@Test(priority = 3)
	@Then("Clean Enrollment rule is created with unique enrollment ID")
	public void clean_Enrollment_rule_is_created_with_unique_enrollment_ID() throws IOException, Exception {
		WCCleanAddDeviceRulePage create_cleanEnroll = new WCCleanAddDeviceRulePage(driver);
		create_cleanEnroll.CreateCleanEnroll();
	}

}
