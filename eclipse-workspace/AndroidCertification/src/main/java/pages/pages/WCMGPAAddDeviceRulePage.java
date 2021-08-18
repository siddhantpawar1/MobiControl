package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sotiMethods.sotiActions;

public class WCMGPAAddDeviceRulePage {
	private static final String JSON_LOCATOR_FILE = "WCAddDevicePageLocators.json";
	public WebDriver driver;

	public WCMGPAAddDeviceRulePage(WebDriver driver) {
		this.driver = driver;
	}

	public void CreateMGPAEnroll() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Actions action = new Actions(driver);

		// Click on the WebElement before right click on Add Devices
		// Add Devices Page Locators
		Thread.sleep(5000);

		// sotiActions.sotiClickweb("addDevice", JSON_LOCATOR_FILE, driver);
		driver.findElement(By.xpath(
				"//img[@src='/MobiControl/Legacy/WebConsole/content/Images/blank.gif']/following::span[contains(text(),'Add Devices')][6]"))
				.click();

		// Right click the button to launch right click menu options Actions action2
		WebElement AddDevice = driver.findElement(By.xpath(
				"//img[@src='/MobiControl/Legacy/WebConsole/content/Images/blank.gif']/following::span[contains(text(),'Add Devices')][6]"));
		action.contextClick(AddDevice).perform();

		// Click on Create Add Device Rule
		sotiActions.sotiClickweb("createAddDevice", JSON_LOCATOR_FILE, driver);
		// driver.findElement(By.xpath("//div[@class='x-menu x-menu-floating
		// x-layer']/ul/li/a")).click();

		Thread.sleep(5000);

		// --- Click on Create Add Device Rule Name and fill details --- //
		sotiActions.sotiClickweb("entercleanName", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiSendkeys("entercleanName", JSON_LOCATOR_FILE, "Automation MGPA", driver);

		// Click on Next---1//
		sotiActions.sotiClickweb("Next1", JSON_LOCATOR_FILE, driver);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Select User Groups to add the group for MGPA Enrollment
		sotiActions.sotiClickweb("userGroup", JSON_LOCATOR_FILE, driver);

		// Click on next by selecting Based on User Group//
		sotiActions.sotiClickweb("Next2", JSON_LOCATOR_FILE, driver);

		// Enter User Group details
		/*
		 * sotiActions.sotiClickweb("usergroupText", JSON_LOCATOR_FILE, driver);
		 * sotiActions.sotiSendkeys("usergroupText", JSON_LOCATOR_FILE, "Domain Users",
		 * driver);
		 */
		// Enter User Group details
		WebElement usergroupText = driver.findElement(By.xpath(
				"//div[@class='x-form-field-wrap x-form-field-trigger-wrap x-box-item' and @style='width: 331px; left: 166px; top: 0px;']/input"));
		usergroupText.click();
		jse.executeScript("arguments[0].click()", usergroupText);
		usergroupText.sendKeys("Domain Users");

		// Click on the Add button to add the domain users
		sotiActions.sotiClickweb("usergroupAdd", JSON_LOCATOR_FILE, driver);

		// Click on the Dropdown field to open
		sotiActions.sotiClickweb("usergroupDropdown", JSON_LOCATOR_FILE, driver);

		// Wait
		Thread.sleep(5000);

		// click on the Automation to select
		sotiActions.sotiClickweb("automationFolder", JSON_LOCATOR_FILE, driver);

		// click anywhere on the page and then click next
		sotiActions.sotiClickweb("usergroupText", JSON_LOCATOR_FILE, driver);

		// Wait
		Thread.sleep(2000);

		// Click on next3
		sotiActions.sotiClickweb("mgpaNext3", JSON_LOCATOR_FILE, driver);

		// Select next option from the available options --4//
		sotiActions.sotiClickweb("Next4", JSON_LOCATOR_FILE, driver);

		// Select MGPA and add the Managed Google Play account
		sotiActions.sotiClickweb("mgparadioButton", JSON_LOCATOR_FILE, driver);

		// Hit the dropdown and select a Google account that is previously added
		sotiActions.sotiClickweb("googleAccountDropdown", JSON_LOCATOR_FILE, driver);

		// Select the Google Account that was added
		sotiActions.sotiClickweb("bindedAccount", JSON_LOCATOR_FILE, driver);

		// Click on Next6//
		sotiActions.sotiClickweb("Next6", JSON_LOCATOR_FILE, driver);

		// Click on Next 6 - Manufacturer
		sotiActions.sotiClickweb("Next7", JSON_LOCATOR_FILE, driver);

		// Click on Next 7 - Device Name
		sotiActions.sotiClickweb("Next8", JSON_LOCATOR_FILE, driver);

		// Click on Advance to select Safety Attestation on Failure
		sotiActions.sotiClickweb("Finish", JSON_LOCATOR_FILE, driver);

	}
}