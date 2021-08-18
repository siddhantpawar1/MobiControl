package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WCApplicationCatalogueAE {
	private static final String JSON_LOCATOR_FILE = "WCApplicationCataloguePageLocator.json";
	public WebDriver driver;

	public WCApplicationCatalogueAE(WebDriver driver) {
		this.driver = driver;
	}

	public void CreateAEappCatalogue() throws InterruptedException {

		// Wait until notification appear and then close it
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Java Script Executor clicks
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Click on the web Element before right click
		driver.findElement(By.xpath(
				"//img[@src='/MobiControl/Legacy/WebConsole/content/Images/blank.gif']/following::span[contains(text(),'Application Catalog')][4]"))
				.click();

		// Right click the button to launch Application Catalogue
		Actions action = new Actions(driver);
		WebElement addDevice = driver.findElement(By.xpath(
				"//img[@src='/MobiControl/Legacy/WebConsole/content/Images/blank.gif']/following::span[contains(text(),'Application Catalog')][4]"));
		action.contextClick(addDevice).perform();

		// Click on Create Application Catalogue
		driver.findElement(By.xpath("//div[@class='x-menu x-menu-floating x-layer']/ul/li/a")).click();

		// --- Click on Create Add Device Rule Name and fill details --- // --- Way2
		WebElement textBox = driver.findElement(
				By.xpath("//input[@class='x-form-text x-form-field x-form-invalid' and @style='width: 680px;']"));
		textBox.click();
		textBox.sendKeys("Automation AE");

		// Click on Next---1//
		WebElement Next1 = driver.findElement(By.xpath(
				"//div[@class='x-window-footer x-panel-btns']/div/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button"));
		Next1.click();

		// Click on Add and try to add some applications for Enterprise Application
		System.out.println("-------------- Managed Google Play Application --------------");
		System.out.println("Adding - stage Programmer Application");

		// Click on the Add button to add application
		WebElement Add1 = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		Add1.click();

		// click on the MGPA to add a list of application
		WebElement suggestedMGPA1 = driver
				.findElement(By.xpath("//span[contains(text(), 'Managed Google Play Applications')]"));
		jse.executeScript("arguments[0].click()", suggestedMGPA1);

		// Select Bindings from the list of Bindings
		WebElement bindingsDrpdown = driver.findElement(
				By.xpath("//label[contains(text(),'Binding:')]/following::div/div/input[@style='width: 325px;']"));
		bindingsDrpdown.click();

		Thread.sleep(3000);

		WebElement hkQA = driver.findElement(By.xpath("//div[contains(text(),'HK QA')]"));
		hkQA.click();

		Thread.sleep(3000);

		// Enter application name in the search section
		WebElement searchTextBox1 = driver.findElement(By.xpath("//input[@name='search combo']"));
		searchTextBox1.click();
		searchTextBox1.sendKeys("Stage Programmer");

		Thread.sleep(3000);

		// Click on Search to add suggested application - MobiControl Stage Programmer
		WebElement suggestedSearch1 = driver
				.findElement(By.xpath("//button[contains(text(),'Search') and @type='button']"));
		jse.executeScript("arguments[0].click()", suggestedSearch1);

		// Select the application which appears in the list of applications
		WebElement suggestedApplication1 = driver
				.findElement(By.xpath("//div[contains(text(),'MobiControl Stage Programmer')]"));
		suggestedApplication1.click();

		// Click on the OKAY button to select the application
		WebElement suggestedOK1 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		jse.executeScript("arguments[0].click()", suggestedOK1);

		// Click on the OKAY button again to select the application
		WebElement outersuggestedOK1 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		outersuggestedOK1.click();

		/*
		 * ----------------- Add second suggested application
		 * ---------------------------------
		 */

		System.out.println("Adding - Evernote Application");

		// Click on the Add button to add application
		WebElement Add2 = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		Add2.click();

		// click on the MGPA to add a list of application
		WebElement suggestedMGPA2 = driver
				.findElement(By.xpath("//span[contains(text(), 'Managed Google Play Applications')]"));
		jse.executeScript("arguments[0].click()", suggestedMGPA2);

		// Enter application name in the search section
		WebElement searchTextBox2 = driver.findElement(By.xpath("//input[@name='search combo']"));
		searchTextBox2.click();
		searchTextBox2.sendKeys("Evernote");

		Thread.sleep(3000);

		// Click on Search to add suggested application - MobiControl Stage Programmer
		WebElement suggestedSearch2 = driver
				.findElement(By.xpath("//button[contains(text(),'Search') and @type='button']"));
		jse.executeScript("arguments[0].click()", suggestedSearch2);

		// Select the application which appears in the list of applications
		WebElement suggestedApplication2 = driver
				.findElement(By.xpath("//div[contains(text(),'Evernote - Notes Organizer & Daily Planner')]"));
		suggestedApplication2.click();

		// Click on the OKAY button to select the application
		WebElement suggestedOK2 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		jse.executeScript("arguments[0].click()", suggestedOK2);

		// Click on the OKAY button again to select the application
		WebElement outersuggestedOK2 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		outersuggestedOK2.click();

		/*
		 * ----------------- Add Third suggested application
		 * ---------------------------------
		 */

		System.out.println("Adding - Fake GPS Application");

		// Click on the Add button to add application
		WebElement Add3 = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		Add3.click();

		// click on the MGPA to add a list of application
		WebElement suggestedMGPA3 = driver
				.findElement(By.xpath("//span[contains(text(), 'Managed Google Play Applications')]"));
		jse.executeScript("arguments[0].click()", suggestedMGPA3);

		// Enter application name in the search section
		WebElement searchTextBox3 = driver.findElement(By.xpath("//input[@name='search combo']"));
		searchTextBox3.click();
		searchTextBox3.sendKeys("Fake GPS");

		// Select the application which appears in the list of applications
		WebElement suggestedApplication3 = driver
				.findElement(By.xpath("//div[contains(text(),'Fake GPS GO Location Spoofer Free')]"));
		suggestedApplication3.click();

		// Click on the OKAY button to select the application
		WebElement suggestedOK3 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		jse.executeScript("arguments[0].click()", suggestedOK3);

		// Click on the OKAY button again to select the application
		WebElement outersuggestedOK3 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		outersuggestedOK3.click();

		/*
		 * ----------------- Add Fourth suggested application
		 * ---------------------------------
		 */
		System.out.println("Adding Mandatory Application");
		System.out.println("Adding - Pulse Secure");

		// Click on the Add button to add application
		WebElement Add4 = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		Add4.click();

		// click on the MGPA to add a list of application
		WebElement suggestedMGPA4 = driver
				.findElement(By.xpath("//span[contains(text(), 'Managed Google Play Applications')]"));
		jse.executeScript("arguments[0].click()", suggestedMGPA4);

		// Enter application name in the search section
		WebElement searchTextBox4 = driver.findElement(By.xpath("//input[@name='search combo']"));
		searchTextBox4.click();
		searchTextBox4.sendKeys("Pulse Secure");

		// Select the application which appears in the list of applications
		WebElement suggestedApplication4 = driver.findElement(By.xpath("//div[contains(text(),'Pulse Secure')]"));
		suggestedApplication4.click();

		// Wait until you see the visibility of the element is visible over the screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@class='x-btn x-btn-noicon x-box-item' and @style='width: auto; left: 469px; top: 0px;']/tbody/tr[2]/td[2]/em/button")));

		// Click on the Advanced button
		WebElement advancedButton1 = driver.findElement(By.xpath(
				"//table[@class='x-btn x-btn-noicon x-box-item' and @style='width: auto; left: 469px; top: 0px;']/tbody/tr[2]/td[2]/em/button"));
		advancedButton1.click();

		// Click on the dropdown to select It as Mandatory Application
		WebElement applicationType1 = driver.findElement(By.xpath(
				"//input[@type='text' and @style='width: 184px;' and @class='x-form-text x-form-field x-trigger-noedit']"));
		applicationType1.click();

		Thread.sleep(3000);

		// Select Mandatory application from the dropdown list
		WebElement mandatoryApp1 = driver.findElement(By.xpath("//div[contains(text(), 'Mandatory')]"));
		mandatoryApp1.click();

		// Select OK button from the pop-up appearing over the screen
		WebElement MandatoryOK1 = driver.findElement(By.xpath(
				"//div[@class='x-window-footer x-window-footer-noborder x-panel-btns' and @style='width: 620px;']/div/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td"));
		MandatoryOK1.click();

		// Click on the OKAY button again to select the application
		WebElement outersuggestedOK4 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		outersuggestedOK4.click();

		/*
		 * ----------------- Add Fifth suggested application
		 * ---------------------------------
		 */
		System.out.println("Adding - Microsoft SwiftKey");

		// Click on the Add button to add application
		WebElement Add5 = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		Add5.click();

		// click on the MGPA to add a list of application
		WebElement suggestedMGPA5 = driver
				.findElement(By.xpath("//span[contains(text(), 'Managed Google Play Applications')]"));
		jse.executeScript("arguments[0].click()", suggestedMGPA5);

		// Enter application name in the search section
		WebElement searchTextBox5 = driver.findElement(By.xpath("//input[@name='search combo']"));
		searchTextBox5.click();
		searchTextBox5.sendKeys("Microsoft SwiftKey");

		// Select the application which appears in the list of applications
		WebElement suggestedApplication5 = driver
				.findElement(By.xpath("//div[contains(text(),'Microsoft SwiftKey Keyboard')]"));
		suggestedApplication5.click();

		// Wait until you see the visibility of the element is visible over the screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@class='x-btn x-btn-noicon x-box-item' and @style='width: auto; left: 469px; top: 0px;']/tbody/tr[2]/td[2]/em/button")));

		// Click on the Advanced button
		WebElement advancedButton2 = driver.findElement(By.xpath(
				"//table[@class='x-btn x-btn-noicon x-box-item' and @style='width: auto; left: 469px; top: 0px;']/tbody/tr[2]/td[2]/em/button"));
		advancedButton2.click();

		// Click on the dropdown to select It as Mandatory Application
		WebElement applicationType2 = driver.findElement(By.xpath(
				"//input[@type='text' and @style='width: 184px;' and @class='x-form-text x-form-field x-trigger-noedit']"));
		applicationType2.click();

		Thread.sleep(3000);

		// Select Mandatory application from the dropdown list
		WebElement mandatoryApp2 = driver.findElement(By.xpath("//div[contains(text(), 'Mandatory')]"));
		jse.executeScript("arguments[0].click()", mandatoryApp2);

		// Select OK button from the pop-up appearing over the screen
		WebElement MandatoryOK2 = driver.findElement(By.xpath(
				"//div[@class='x-window-footer x-window-footer-noborder x-panel-btns' and @style='width: 620px;']/div/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td"));
		MandatoryOK2.click();

		// Click on the OKAY button again to select the application
		WebElement outersuggestedOK5 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		outersuggestedOK5.click();

		/*
		 * ----------------- Add Sixth suggested application
		 * ---------------------------------
		 */
		System.out.println("Adding Mandatory Application");
		System.out.println("Adding - Pulse Secure");

		// Click on the Add button to add application
		WebElement Add6 = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
		Add6.click();

		// click on the MGPA to add a list of application
		WebElement suggestedMGPA6 = driver
				.findElement(By.xpath("//span[contains(text(), 'Managed Google Play Applications')]"));
		jse.executeScript("arguments[0].click()", suggestedMGPA6);

		// Enter application name in the search section
		WebElement searchTextBox6 = driver.findElement(By.xpath("//input[@name='search combo']"));
		searchTextBox6.click();
		searchTextBox6.sendKeys("NetMotion");

		// Select the application which appears in the list of applications
		WebElement suggestedApplication6 = driver
				.findElement(By.xpath("//div[contains(text(),'NetMotion Mobility®')]"));
		suggestedApplication6.click();

		// Wait until you see the visibility of the element is visible over the screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@class='x-btn x-btn-noicon x-box-item' and @style='width: auto; left: 469px; top: 0px;']/tbody/tr[2]/td[2]/em/button")));

		// Click on the Advanced button
		WebElement advancedButton3 = driver.findElement(By.xpath(
				"//table[@class='x-btn x-btn-noicon x-box-item' and @style='width: auto; left: 469px; top: 0px;']/tbody/tr[2]/td[2]/em/button"));
		advancedButton3.click();

		// Click on the dropdown to select It as Mandatory Application
		WebElement applicationType3 = driver.findElement(By.xpath(
				"//input[@type='text' and @style='width: 184px;' and @class='x-form-text x-form-field x-trigger-noedit']"));
		applicationType3.click();

		Thread.sleep(3000);

		// Select Mandatory application from the dropdown list
		WebElement mandatoryApp3 = driver.findElement(By.xpath("//div[contains(text(), 'Mandatory')]"));
		jse.executeScript("arguments[0].click()", mandatoryApp3);

		// Select OK button from the pop-up appearing over the screen
		WebElement MandatoryOK3 = driver.findElement(By.xpath(
				"//div[@class='x-window-footer x-window-footer-noborder x-panel-btns' and @style='width: 620px;']/div/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td"));
		MandatoryOK3.click();

		// Click on the OKAY button again to select the application
		WebElement outersuggestedOK6 = driver
				.findElement(By.xpath("//button[contains(text(),'OK') and @type='button' and @class=' x-btn-text']"));
		outersuggestedOK6.click();

		// Click on next by selecting Manual group--2//
		WebElement Next2 = driver.findElement(By.xpath("//button[@id='Next AppCatalogCard']"));
		jse.executeScript("arguments[0].click()", Next2);

		// Select a Folder where the Rule is going to get applied --3//
		WebElement Folder = driver.findElement(By.xpath("//img[@class='mcw-tree-checkbox-base i-checkbox-0']"));
		jse.executeScript("arguments[0].click()", Folder);

		// Click on next by selecting Automation group --3//
		WebElement Next3 = driver.findElement(By.xpath("//*[@id='Next TargetCard']"));
		jse.executeScript("arguments[0].click()", Next3);

		// Select Finish for creating the rule //
		WebElement Finish = driver.findElement(By.xpath("//button[@id='Next SummaryCard']"));
		jse.executeScript("arguments[0].click()", Finish);

		System.out.println("Execution Ends!!");

	}
}
