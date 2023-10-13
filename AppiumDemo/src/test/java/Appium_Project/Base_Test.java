package Appium_Project;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base_Test {
	public AppiumDriver driver;
	public AppiumDriverLocalService service;
	
	@Test
	public void appiumConfigure()throws Exception
	{

		//Physical Device Configuration
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Xiaomi 22041216I");
		cap.setCapability("udid", "6DI7UOYDVKY9FQ9X");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		//cap.setCapability("appPackage", "io.appium.android.apis");
		//cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("appPackage", "com.dencreak.dlcalculator");
		cap.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723");
		driver = new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
//		service.close();
	}
}
