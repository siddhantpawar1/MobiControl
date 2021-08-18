package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import sotiMethods.sotiActions;
import utility.base;

public class WCCleanAddDeviceRulePage {
	private static final String JSON_LOCATOR_FILE = "WCAddDevicePageLocators.json";
	public WebDriver driver;

	public WCCleanAddDeviceRulePage(WebDriver driver) {
		this.driver = driver;
	}

	public void CreateCleanEnroll() throws IOException, InterruptedException {

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
		//driver.findElement(By.xpath("//div[@class='x-menu x-menu-floating x-layer']/ul/li/a")).click();

		Thread.sleep(5000);

		// --- Click on Create Add Device Rule Name and fill details --- //
		sotiActions.sotiClickweb("entercleanName", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiSendkeys("entercleanName", JSON_LOCATOR_FILE, "AutomationClean1", driver);

		// Click on Next---1//
		sotiActions.sotiClickweb("Next1", JSON_LOCATOR_FILE, driver);

		// Click on next2 by selecting Manual group--2//
		sotiActions.sotiClickweb("Next2", JSON_LOCATOR_FILE, driver);

		// Select a Folder where the Rule is going to get applied --3//
		sotiActions.sotiClickweb("Folder", JSON_LOCATOR_FILE, driver);

		// Click on next3 by selecting Automation group --3//
		sotiActions.sotiClickweb("Next3", JSON_LOCATOR_FILE, driver);

		// Select next4 option from the available options --4//
		sotiActions.sotiClickweb("Next4", JSON_LOCATOR_FILE, driver);

		// Select the checkbox to enable terms and conditions --5//
		sotiActions.sotiClickweb("skipradioButton", JSON_LOCATOR_FILE, driver);

		// select Next5 to move to the next page --5//
		sotiActions.sotiClickweb("Next5", JSON_LOCATOR_FILE, driver);

		// Select Skipped Google Account Radiobutton and click on the Next button --6//
		sotiActions.sotiClickweb("Skip", JSON_LOCATOR_FILE, driver);

		// Click on Next6//
		sotiActions.sotiClickweb("Next6", JSON_LOCATOR_FILE, driver);

		// Select Next7 on default options --- page 7//
		sotiActions.sotiClickweb("Next7", JSON_LOCATOR_FILE, driver);

		// Select Next8 selecting the Macros naming convection --8//
		sotiActions.sotiClickweb("Next8", JSON_LOCATOR_FILE, driver);

		// Select Finish for creating the rule -- 9//
		sotiActions.sotiClickweb("Finish", JSON_LOCATOR_FILE, driver);

		// Pickup the clean enrollment ID and pass it to a variable
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='x-window mcw-dialog subdialog']")));

		WebElement enrollmentID = driver.findElement(By.xpath(
				"//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']/input[@class='x-form-text x-form-field']"));
		String CleanEnrollment = enrollmentID.getAttribute("value");
		System.out.println("Clean Enrollment rule created is: " + CleanEnrollment);

		System.out.println("Script Executed!!");

	}

}
