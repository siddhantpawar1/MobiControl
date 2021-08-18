package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestUtil {

	public TestUtil() throws IOException {
		AppiumConnections();
		ApiToken();
		// SeleniumConnections();

	}

	public Properties prop;
	public String oem;
	public AndroidDriver<WebElement> androidDriver;
	public URL url;
	public DesiredCapabilities dc;
	public WebDriver webDriver;
	DataFile datafile;
	public String access_token;

	public void AppiumConnections() throws IOException {

		prop = new Properties();
		FileInputStream ip = new FileInputStream(DataFile.ConfigFile.url());
		prop.load(ip);

		oem = prop.getProperty("oem");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.APP, prop.getProperty("File"));
		dc.setCapability("autoGrantPermissions", true);

		URL url = new URL(DataFile.AppiumUrl.url());
		androidDriver = new AndroidDriver<WebElement>(url, dc);

	}

	public void SeleniumConnections() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supadhyaya\\eclipse-workspace\\AndroidCertification\\src\\main\\java\\drivers\\chromedriver.exe");
		webDriver = new ChromeDriver();

	}

	public void ApiToken() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		@SuppressWarnings("deprecation")
		RequestBody body = RequestBody.create(mediaType, "grant_type=password&username=Administrator&password=1");
		Request request = new Request.Builder().url("https://cad246.corp.soti.net/MobiControl/api/token")
				.method("POST", body)
				.addHeader("Authorization", "Basic YzhmZDM0NGMwNmZiNGRlM2EzOTFhZmI5ZjBjY2VmMGQ6MTIzNDU2")
				.addHeader("Content-Type", "application/x-www-form-urlencoded").addHeader("Content-Length", "53")
				.build();
		Response response = client.newCall(request).execute();

		String jsonData = response.body().string();
		JSONObject Jobject = new JSONObject(jsonData);
		access_token = (String) Jobject.get("access_token");
		System.out.println(access_token);
	}

	public enum DataFile {

		ConfigFile(
				"C:\\Users\\supadhyaya\\eclipse-workspace\\dc.automation.android\\src\\test\\resources\\config.properties"),
		AppiumUrl("http://127.0.0.1:4723/wd/hub"),

		UNKNOWN("");

		private String url;

		DataFile(String url) {
			this.url = url;
		}

		public String url() {
			return url;
		}
	}

}
