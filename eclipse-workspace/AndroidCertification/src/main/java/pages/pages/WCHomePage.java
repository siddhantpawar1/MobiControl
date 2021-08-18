package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sotiMethods.sotiActions;
import utility.base;

public class WCHomePage {
	private static final String JSON_LOCATOR_FILE = "WCHomePageLocators.json";

	public WebDriver driver;

	public WCHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigatetoRules() throws IOException {

		// HomePage Locators
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='soti_popup ng-star-inserted origin-endBottom overlay-endTop']")));

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		WebElement Notification = driver.findElement(By.xpath("//i[@class='ngui-icon-megaphone round medium']"));
		jse1.executeScript("arguments[0].click()", Notification);

		// sotiActions.sotiClickweb("Notification", JSON_LOCATOR_FILE, driver);

		System.out.println("Notification Popup is closed");

		// ----- Navigate to Rules section to create the Clean Enrollment ---- //
		sotiActions.sotiClickweb("hamburgerProfile", JSON_LOCATOR_FILE, driver);
		sotiActions.sotiClickweb("rules", JSON_LOCATOR_FILE, driver);

		// --- Click on Android Platform and create Clean Enrollment --- //
		// Get frame count to move to second frame

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The number of frames appearing on the screen:" + size);

		driver.switchTo().frame(1);

		// --- Click on android Platform ---//
		// Platform Page Locators

		Actions action = new Actions(driver);
		WebElement elementLocator = driver
				.findElement(By.xpath("//div[@class='x-box-inner']/div/div/div/div/div/div/div[6]"));
		action.doubleClick(elementLocator).perform();

		// sotiActions.sotiClickweb("androidPlus", JSON_LOCATOR_FILE, driver);

	}

}
