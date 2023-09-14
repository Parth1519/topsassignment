package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class OpenCart {
	
public void float_cart_open(WebDriver driver) throws InterruptedException {
		
		
		Actions actions=new Actions(driver);
		WebElement cart=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/span[1]"));
		Action a1=actions.moveToElement(cart).build();
		a1.perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		Thread.sleep(2000);
		
	}
public void AddChangeProductButton(WebDriver driver) throws InterruptedException {
	
	
	Actions actions=new Actions(driver);
	WebElement change=driver.findElement(By.className("change-product-button"));
	Action a3=actions.moveToElement(change).build();
	a3.perform();
	Thread.sleep(2000);
	driver.findElement(By.className("change-product-button")).click();
    Thread.sleep(2000);
    
	
//increment		
	for (int i = 0; i <5; i++) {

	    driver.findElement(By.xpath("//button[normalize-space()='+']")).click();
	    Thread.sleep(2000);
			
	}
	
	//decrement		
	driver.findElement(By.xpath("//button[normalize-space()='-']")).click();
    Thread.sleep(2000);
	
	
}	
public void checkout(WebDriver driver) throws InterruptedException {
	Actions actions=new Actions(driver);
	WebElement Checkout=driver.findElement(By.className("buy-btn"));
	Action a2=actions.moveToElement(Checkout).build();
	a2.perform();

	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("buy-btn")).click();
	Thread.sleep(2000);
}


}
