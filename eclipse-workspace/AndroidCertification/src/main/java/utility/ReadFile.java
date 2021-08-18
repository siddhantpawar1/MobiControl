package utility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ReadFile {
	public static LocatorInfo getLocator(String element) {
		System.out.println("Printing element: "+element);
		/*
		 * Reads from the JSON file and creates and returns a LocatorInfo object.
		 */

		JSONParser jsonParser = new JSONParser();
		String findBy, locator = "";
		try {
			Object obj = jsonParser.parse(new FileReader(
					"C:\\Users\\spawar\\eclipse-workspace\\AndroidCertification\\src\\main\\java\\locators\\DeviceEnrollmentPageLocators.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject elementInfo = (JSONObject) jsonObject.get(element);
			findBy = (String) elementInfo.get("findBy");
			locator = (String) elementInfo.get("locator");
			return new LocatorInfo(findBy, locator);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static LocatorInfo getwebLocator(String element) {
		/*
		 * Reads from the JSON file and creates and returns a LocatorInfo object.
		 */

		JSONParser jsonParser = new JSONParser();
		String findBy, locator = "";
		try {
			Object obj = jsonParser.parse(new FileReader(
					"C:\\Users\\spawar\\eclipse-workspace\\AndroidCertification\\src\\main\\java\\locators\\WCLoginPageLocators.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject elementInfo = (JSONObject) jsonObject.get(element);
			findBy = (String) elementInfo.get("findBy");
			locator = (String) elementInfo.get("locator");
			return new LocatorInfo(findBy, locator);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static LocatorInfo getwebLoginLocator(String element) {
		/*
		 * Reads from the JSON file and creates and returns a LocatorInfo object.
		 */

		JSONParser jsonParser = new JSONParser();
		String findBy, locator = "";
		try {
			Object obj = jsonParser.parse(new FileReader(
					"C:\\Users\\spawar\\eclipse-workspace\\AndroidCertification\\src\\main\\java\\locators\\WCLoginPageLocators.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject elementInfo = (JSONObject) jsonObject.get(element);
			findBy = (String) elementInfo.get("findBy");
			locator = (String) elementInfo.get("locator");
			return new LocatorInfo(findBy, locator);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static LocatorInfo getwebHomeLocator(String element) {
		/*
		 * Reads from the JSON file and creates and returns a LocatorInfo object.
		 */

		JSONParser jsonParser = new JSONParser();
		String findBy, locator = "";
		try {
			Object obj = jsonParser.parse(new FileReader(
					"C:\\Users\\spawar\\eclipse-workspace\\AndroidCertification\\src\\main\\java\\locators\\WCHomePageLocators.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject elementInfo = (JSONObject) jsonObject.get(element);
			findBy = (String) elementInfo.get("findBy");
			locator = (String) elementInfo.get("locator");
			System.out.println("locator: "+locator);
			return new LocatorInfo(findBy, locator);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static LocatorInfo getwebPlatformSelectionLocator(String element) {
		/*
		 * Reads from the JSON file and creates and returns a LocatorInfo object.
		 */

		JSONParser jsonParser = new JSONParser();
		String findBy, locator = "";
		try {
			Object obj = jsonParser.parse(new FileReader(
					"C:\\Users\\spawar\\eclipse-workspace\\AndroidCertification\\src\\main\\java\\locators\\WCPlatformSelectionPageLocators.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject elementInfo = (JSONObject) jsonObject.get(element);
			findBy = (String) elementInfo.get("findBy");
			locator = (String) elementInfo.get("locator");
			return new LocatorInfo(findBy, locator);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static LocatorInfo getwebAddDeviceLocator(String element) {
		/*
		 * Reads from the JSON file and creates and returns a LocatorInfo object.
		 */

		JSONParser jsonParser = new JSONParser();
		String findBy, locator = "";
		try {
			Object obj = jsonParser.parse(new FileReader(
					"C:\\Users\\spawar\\eclipse-workspace\\AndroidCertification\\src\\main\\java\\locators\\WCAddDevicePageLocators.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject elementInfo = (JSONObject) jsonObject.get(element);
			findBy = (String) elementInfo.get("findBy");
			locator = (String) elementInfo.get("locator");
			System.out.println("locator: "+locator);
			return new LocatorInfo(findBy, locator);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static LocatorInfo getLocator(String element, String filename){
		/*
		 * Reads from the JSON file and creates and returns a LocatorInfo object.
		 */
		Log.info("Reading element from JSON file: " + element);
		JSONParser jsonParser = new JSONParser();
		String findBy, locator = "";
		try{
			Object obj = jsonParser.parse(new FileReader(System.getProperty("user.dir") + "/src/main/java/Locators/" + filename));
			JSONObject jsonObject = (JSONObject)obj;
	        JSONObject elementInfo = (JSONObject) jsonObject.get(element);
	        findBy = (String) elementInfo.get("findBy");
	        locator = (String) elementInfo.get("locator");
	        return new LocatorInfo(findBy, locator);
		}catch(Exception e) {
	         e.printStackTrace();
	    }
		
		return null;
	}
}
