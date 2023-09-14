package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ShippingAddress {
	
	
	
	public void shippingAddress12(WebDriver driver) throws InterruptedException {
		/*---Shipping Address--*/
		
		//scroll up an down the web page
		JavascriptExecutor js= (JavascriptExecutor) driver; 
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		//scroll up an down the web page
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(2000);
	}
	public void FirstName(WebDriver driver,String FirstName) throws InterruptedException {
Actions actions=new Actions(driver);
		
		
		WebElement firstNameInput=driver.findElement(By.id("firstNameInput"));
		Action a3=actions.moveToElement(firstNameInput).build();
		a3.perform();
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("firstNameInput")).sendKeys(FirstName);
		Thread.sleep(2000);
		
	}
		public void LastName(WebDriver driver,String LastName) throws InterruptedException {
			Actions actions=new Actions(driver);
			WebElement lastNameInput=driver.findElement(By.id("lastNameInput"));
			Action a4=actions.moveToElement(lastNameInput).build();
			a4.perform();
			Thread.sleep(2000);
			driver.findElement(By.id("lastNameInput")).sendKeys(LastName);
			Thread.sleep(2000);
			
		}
		
		public void Adress(WebDriver driver,String Adress) throws InterruptedException {
			Actions actions=new Actions(driver);
			WebElement addressLine1Input=driver.findElement(By.id("addressLine1Input"));
			Action a5=actions.moveToElement(addressLine1Input).build();
			a5.perform();
			Thread.sleep(2000);
			driver.findElement(By.id("addressLine1Input")).sendKeys(Adress);
			Thread.sleep(2000);
			
		}
		public void city(WebDriver driver,String city) throws InterruptedException {
			Actions actions=new Actions(driver);
			WebElement provinceInput=driver.findElement(By.id("provinceInput"));
			Action a6=actions.moveToElement(provinceInput).build();
			a6.perform();
			Thread.sleep(2000);
			driver.findElement(By.id("provinceInput")).sendKeys(city);
			Thread.sleep(2000);
			
		}
		public void postcode(WebDriver driver,String postcode) throws InterruptedException {
			Actions actions=new Actions(driver);
			WebElement postCodeInput=driver.findElement(By.id("postCodeInput"));
			Action a7=actions.moveToElement(postCodeInput).build();
			a7.perform();
			Thread.sleep(2000);
			driver.findElement(By.id("postCodeInput")).sendKeys(postcode);
			Thread.sleep(2000);
			}
		public void submitbutton(WebDriver driver) throws InterruptedException {
			driver.findElement(By.id("checkout-shipping-continue")).click();
			Thread.sleep(2000);
			
		}
		
}
