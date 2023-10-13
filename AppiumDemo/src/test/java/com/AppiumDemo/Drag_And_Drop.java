package com.AppiumDemo;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Drag_And_Drop extends BaseTest
{
	@Test
	public void dragdrop() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 619,
			    "endY", 560
			));
		
		Thread.sleep(2000);
		
		String str = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		assertEquals(str, "Dropped!");
		Thread.sleep(2000);	
	}
}