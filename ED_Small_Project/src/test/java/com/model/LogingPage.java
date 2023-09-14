package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogingPage {
	
public void enterUsername(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='demouser']")).click();
	Thread.sleep(2000);
	
}
public void enterPassword(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"password\"]/div/div[1]/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
	Thread.sleep(2000);
	
}
public void clickLoging(WebDriver driver) throws InterruptedException {
	driver.findElement(By.id("login-btn")).click();
	Thread.sleep(2000);
	
	
}
	
	
	

}
