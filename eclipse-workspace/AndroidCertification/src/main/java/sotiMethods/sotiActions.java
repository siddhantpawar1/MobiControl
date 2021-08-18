package sotiMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utility.LocatorInfo;
import utility.Log;
import utility.ReadFile;

public class sotiActions {

	public static void sotiClick(String locatorKey, String jsonFilename, AndroidDriver<MobileElement> driver) {
		/*
		 * The static getLocator function will read from the JSON file, and return a
		 * LocatorInfo object that just contains the method to find by (i.e. class name,
		 * id, xpath, etc) and the locator itself. Then it uses the info and clicks the
		 * element. selectorhub
		 */

		LocatorInfo locatorInfo = ReadFile.getLocator(locatorKey, jsonFilename);
		String findBy = locatorInfo.findBy.trim();
		// String test = "App Catalog";
		Log.info("Clicking element: " + locatorKey);
		try {
			if (findBy.equals("uiAutomator")) {
				driver.findElementByAndroidUIAutomator(locatorInfo.locator).click();
			} else if (findBy.equals("id")) {
				driver.findElement(By.id(locatorInfo.locator)).click();
			} else if (findBy.equals("className")) {
				driver.findElement(By.className(locatorInfo.locator)).click();
			} else if (findBy.equals("xpath")) {
				driver.findElement(By.xpath(locatorInfo.locator)).click();
			} else {

			}
		} catch (Exception e) {
			Log.error("Failed to find or click element: " + locatorKey);
		}

	}

	public static void sotiClickweb(String locatorKey, String jsonFilename, WebDriver driver) throws IOException {
		/*
		 * The static getLocator function will read from the JSON file, and return a
		 * LocatorInfo object that just contains the method to find by (i.e. class name,
		 * id, xpath, etc) and the locator itself. Then it uses the info and clicks the
		 * element. selectorhub
		 */

		LocatorInfo locatorInfo = ReadFile.getLocator(locatorKey, jsonFilename);
		String findBy = locatorInfo.findBy.trim();
		Log.info("Clicking element: " + locatorKey);
		try {
			if (findBy.equals("id")) {
				driver.findElement(By.id(locatorInfo.locator)).click();
			} else if (findBy.equals("className")) {
				driver.findElement(By.className(locatorInfo.locator)).click();
			} else if (findBy.equals("xpath")) {
				driver.findElement(By.xpath(locatorInfo.locator)).click();
			} else {

			}
		} catch (Exception e) {
			Log.error("Failed to find or click element: " + locatorKey);
		}

	}

	public static void sotiSendkeys(String locatorKey, String jsonFilename,String value , WebDriver driver) throws IOException {
		/*
		 * The static getLocator function will read from the JSON file, and return a
		 * LocatorInfo object that just contains the method to find by (i.e. class name,
		 * id, xpath, etc) and the locator itself. Then it uses the info and clicks the
		 * element. selectorhub
		 */

		LocatorInfo locatorInfo = ReadFile.getLocator(locatorKey, jsonFilename);
		String findBy = locatorInfo.findBy.trim();

		try {
			if (findBy.equals("uiAutomator")) {

			} else if (findBy.equals("id")) {

				driver.findElement(By.id(locatorInfo.locator)).sendKeys(value);
			} else if (findBy.equals("className")) {
				driver.findElement(By.className(locatorInfo.locator)).sendKeys(value);
			} else if (findBy.equals("xpath")) {
				driver.findElement(By.xpath(locatorInfo.locator)).sendKeys(value);
			} else {

			}
		} catch (Exception e) {
			Log.error("Failed to find or click element: " + locatorKey);
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String filename = UUID.randomUUID().toString();
			FileUtils.copyFile(file, new File(filename + ".png"));
			Assert.fail("Failed to find or click element:" + locatorKey);
		}

	}

	public static void sotijseClick(String locatorKey, JavascriptExecutor jse, WebDriver driver) throws IOException {
		/*
		 * The static getLocator function will read from the JSON file, and return a
		 * LocatorInfo object that just contains the method to find by (i.e. class name,
		 * id, xpath, etc) and the locator itself. Then it uses the info and clicks the
		 * element. selectorhub
		 */

		LocatorInfo locatorInfo = ReadFile.getLocator(locatorKey);
		String findBy = locatorInfo.findBy.trim();

		try {
			if (findBy.equals("uiAutomator")) {

			} else if (findBy.equals("id")) {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id(locatorInfo.locator)).click();
			} else if (findBy.equals("className")) {
				driver.findElement(By.className(locatorInfo.locator)).click();
			} else if (findBy.equals("xpath")) {
				driver.findElement(By.xpath(locatorInfo.locator)).click();
			} else {

			}
		} catch (Exception e) {
			Log.error("Failed to find or click element: " + locatorKey);
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(file, new File("/screenshot/" + sdf.format(d) + locatorKey + ".png"));
			Assert.fail("Failed to find or click element:" + locatorKey);
		}

	}

	public static void sotiDoubleclick(String locatorKey, JavascriptExecutor jse) throws IOException {

		LocatorInfo locatorInfo = ReadFile.getLocator(locatorKey);
		String findBy = locatorInfo.findBy.trim();

		try {

			jse.executeScript("arguments[0].click()", locatorInfo.locator);

		} catch (Exception e) {
			Log.error("Failed to find or click element: " + locatorKey);

		}

	}

}
