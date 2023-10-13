package com.AppiumDemo;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class ApiDemo_Scroll extends BaseTest
{
	@Test
	public void ScrollableDemo()throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
	
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
		//scrollToEndAction();
	}
}