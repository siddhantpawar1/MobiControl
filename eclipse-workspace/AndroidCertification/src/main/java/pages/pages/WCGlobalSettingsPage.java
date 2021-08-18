package pages;

import org.openqa.selenium.WebDriver;

public class WCGlobalSettingsPage {
	private static final String JSON_LOCATOR_FILE = "WCGlobalSettingsPageLocators.json";

	public WebDriver driver;

	public WCGlobalSettingsPage(WebDriver driver) {
		this.driver = driver;
	}
}
