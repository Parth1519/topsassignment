package com.AppiumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Long_Press_Demo extends BaseTest
{
	@Test
	public void Long_Press() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(ele);
		Thread.sleep(3000);	
	}
}