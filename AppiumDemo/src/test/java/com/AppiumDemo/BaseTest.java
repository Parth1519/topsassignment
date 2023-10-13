package com.AppiumDemo;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseTest
{
	//public AndroidDriver driver;
	public AppiumDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeMethod
	public void appiumConfigure()throws Exception
	{
//		Emulator Configuration
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\upadh\\AppData\\Roaming\\npm\\node_modules\\appium\\lib"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		
//		service.start();
		
		/*UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Parth");
		options.setApp("D:\\apk file\\ApiDemos-debug.apk");*/
		
		
		//Physical Device Configuration
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Xiaomi 22041216I");
		cap.setCapability("udid", "6DI7UOYDVKY9FQ9X");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		//cap.setCapability("appPackage", "com.androidsample.generalstore");
		//cap.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723");
		driver = new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		//driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//Thread.sleep(3000);
	}
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
	{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0));
		}while(canScrollMore);
	}
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75
			));		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
//		service.close();
	}
}