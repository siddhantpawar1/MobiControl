package pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sotiMethods.sotiActions;

public class WCNewAndroidEnterpriseBinding {

	private static final String JSON_LOCATOR_FILE = "WCGlobalSettingsPageLocators.json";
	public WebDriver driver;

	public WCNewAndroidEnterpriseBinding(WebDriver driver) {
		this.driver = driver;
	}

	public void CreateNewEnterpriseBindings() throws IOException, InterruptedException {

		// Get frame count to move to second frame
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("There are two frames:" + size);

		driver.switchTo().frame(1);

		// Click on Android Enterprise Bindings
		sotiActions.sotiClickweb("androidEnterpriseBinding", JSON_LOCATOR_FILE, driver);

		// Get the main window handle
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("The main window name is: " + mainWindowHandle);

		// Click on new to add Google domain
		sotiActions.sotiClickweb("addGoogleDomain", JSON_LOCATOR_FILE, driver);

		// Select Google Domain and click on it to enter a Google Domain
		sotiActions.sotiClickweb("managedEnterprise", JSON_LOCATOR_FILE, driver);

		// click on OK button to enter the google account
		sotiActions.sotiClickweb("meOKBtn", JSON_LOCATOR_FILE, driver);

		// Get All Window Handles
		Thread.sleep(2000);
		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent windows id:" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child window id:" + childWindowId);
		Thread.sleep(2000);
		driver.switchTo().window(childWindowId);

		// Click on SignIn
		sotiActions.sotiClickweb("signIN", JSON_LOCATOR_FILE, driver);
		System.out.println("child window popup title" + driver.getTitle());
		Thread.sleep(2000);

		// Enter google SignIn and register an google account
		sotiActions.sotiClickweb("googleUName", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiSendkeys("googleUName", JSON_LOCATOR_FILE, "sotinexusautomation@gmail.com", driver);

		// Click on the Next1 button
		sotiActions.sotiClickweb("googleNext1", JSON_LOCATOR_FILE, driver);

		// Enter Password Details
		sotiActions.sotiClickweb("googlePass", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiSendkeys("googlePass", JSON_LOCATOR_FILE, "Path2Heaven#Cut", driver);

		// Click on the Next2 button
		sotiActions.sotiClickweb("googleNext2", JSON_LOCATOR_FILE, driver);

		// This account was not enrolled before therefore adding it for first time
		sotiActions.sotiClickweb("getStarted", JSON_LOCATOR_FILE, driver);

		// Enter Business name in the textbox
		sotiActions.sotiClickweb("businessName", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiSendkeys("businessName", JSON_LOCATOR_FILE, "Nexus Automation", driver);

		// click on next button
		sotiActions.sotiClickweb("googleNext", JSON_LOCATOR_FILE, driver);

		// click on the checkbox and hit confirm
		sotiActions.sotiClickweb("googleCheckBx", JSON_LOCATOR_FILE, driver);

		// confirm to add the google account
		sotiActions.sotiClickweb("googleconfirmButn", JSON_LOCATOR_FILE, driver);

		// click on confirm Registration
		sotiActions.sotiClickweb("completeRegistration", JSON_LOCATOR_FILE, driver);

	}
}
