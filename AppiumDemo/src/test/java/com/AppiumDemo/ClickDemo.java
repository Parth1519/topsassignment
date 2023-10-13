package com.AppiumDemo;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ClickDemo extends BaseTest
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
	}
}