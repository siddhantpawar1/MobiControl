package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import sotiMethods.sotiActions;
import utility.base;

public class WCLoginPage {

	private static final String JSON_LOCATOR_FILE = "WCLoginPageLocators.json";

	public WebDriver driver;

	public WCLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void basePageNavigation() throws IOException {

		// LoginPage Locators
		sotiActions.sotiClickweb("detailBtn", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiClickweb("proceedBtn", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiClickweb("exactURL", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiSendkeys("userName",JSON_LOCATOR_FILE, "qatester", driver);
		sotiActions.sotiSendkeys("password",JSON_LOCATOR_FILE, "Mob!Contr@1", driver);
		sotiActions.sotiClickweb("detailBtn", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiClickweb("login", JSON_LOCATOR_FILE, driver);
		System.out.println("User is logged into the Application");

	}

}
