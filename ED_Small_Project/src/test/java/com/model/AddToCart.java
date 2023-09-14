package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart 
{
	public void addtocartlogo(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
		Thread.sleep(2000);
	}
}
