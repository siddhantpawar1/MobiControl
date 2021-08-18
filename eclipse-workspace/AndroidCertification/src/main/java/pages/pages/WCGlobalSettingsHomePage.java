package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sotiMethods.sotiActions;

public class WCGlobalSettingsHomePage {
	private static final String JSON_LOCATOR_FILE = "WCHomePageLocators.json";

	public WebDriver driver;

	public WCGlobalSettingsHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigatetoGlobalSettings() throws IOException {

		// HomePage Locators
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='soti_popup ng-star-inserted origin-endBottom overlay-endTop']")));

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		WebElement Notification = driver.findElement(By.xpath("//i[@class='ngui-icon-megaphone round medium']"));
		jse1.executeScript("arguments[0].click()", Notification);

		// sotiActions.sotiClickweb("Notification", JSON_LOCATOR_FILE, driver);

		System.out.println("Notification Popup is closed");

		// Click on Hamburger option
		sotiActions.sotiClickweb("hamburgerProfile", JSON_LOCATOR_FILE, driver);

		// Click on Global Settings
		sotiActions.sotiClickweb("globalSettings", JSON_LOCATOR_FILE, driver);
	}
}