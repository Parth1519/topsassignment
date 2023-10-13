package com.AppiumDemo;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class General_Store_Demo extends BaseTest
{
	@Test
	public void General_Store() throws InterruptedException
	{
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Bahrain\"));")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Parth Upadhyay");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Converse All Star\"));"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
	}
}