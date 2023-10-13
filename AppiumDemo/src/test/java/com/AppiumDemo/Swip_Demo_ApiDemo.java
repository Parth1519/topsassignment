package com.AppiumDemo;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Swip_Demo_ApiDemo extends BaseTest
{
	@Test
	public void SwipDemo()throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
		Thread.sleep(3000);
		
		for (int i = 1; i<= 5; i++)
		{
			WebElement ele=driver.findElement(By.xpath("//android.widget.ImageView["+i+"]"));
			Assert.assertEquals(ele.getAttribute("focusable"),"true");
			swipeAction(ele,"left");
			Assert.assertEquals(ele.getAttribute("focusable"), "false");
		}
	}
}