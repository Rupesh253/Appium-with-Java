package prototypes;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test1 {
	//AndroidDriver driver = null;
	//
        //
	private final static Logger log=Logger.getLogger(Test1.class);

	@BeforeMethod
	public void setUp() throws URISyntaxException, MalformedURLException {
		//System.out.println("setUp");
		log.debug("setUp");
		
		try {
			/*DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K3 Note");
			caps.setCapability(MobileCapabilityType.UDID, "DUIRNJAQKV4LCU4L");
			// caps.setJavascriptEnabled(true);

			// caps.setAcceptInsecureCerts(true);
			URL url = new URL("http://localhost:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, caps);*/
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void someTest() {
		/*System.out.println("driver " + driver.getSessionId());
		System.out.println("driver " + driver.getOrientation());*/
		log.debug("someTest");
	}

	@AfterMethod
	public void tearDown() {
		//System.out.println("tearDown");
		log.debug("tearDown");
	}

}
