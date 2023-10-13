package com.AppiumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Seek_Bar extends BaseTest
{
	@Test
	public void Seek_bar() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Seek Bar\"));")).click();
		Thread.sleep(2000);
		
		WebElement slider=driver.findElement(By.id("io.appium.android.apis:id/seek"));
		int xAxisStartPoint=slider.getLocation().getX();
		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
		int yAxisStartPoint=slider.getLocation().getY();
		
		TouchAction action=new TouchAction(driver);
		
		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
		.moveTo(PointOption.point(xAxisEndPoint-1,yAxisStartPoint))
		.release().perform();
	}
}