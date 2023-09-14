package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UpsideManu {
	
	
	public void Offers(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("offers")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver; 
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);
		
	}
	
	public void Orders(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("orders")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver; 
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);
		
		}
		
		public void Favourites(WebDriver driver) throws InterruptedException {
			driver.findElement(By.xpath("//strong[normalize-space()='Favourites']")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor js= (JavascriptExecutor) driver; 
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,3000)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-3000)");
			Thread.sleep(2000);
			
		}
		public void Orderby(WebDriver driver) throws InterruptedException {
			Actions actions=new Actions(driver);
			WebElement Select=driver.findElement(By.xpath("//div[@class='sort']//select"));
			Action a1=actions.moveToElement(Select).build();
			a1.perform();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//option[text()='Lowest to highest']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[text()='Highest to lowest']")).click();
			Thread.sleep(2000);
			
			
			
//			WebElement e1=driver.findElement(By.className("sort"));
//			Select s1=new Select(e1);
//			s1.selectByValue("lowestprice");
//			Thread.sleep(2000);
//			s1.selectByValue("highestprice");
//			Thread.sleep(2000);
			
		}
		
		
		
		public void logout(WebDriver driver) throws InterruptedException {
			driver.findElement(By.id("logout")).click();
			Thread.sleep(2000);
		}

}
