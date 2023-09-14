package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadReceipt {

	
	public void DownloadOrderReceipt(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("downloadpdf")).click();
		Thread.sleep(2000);
		}
	
	public void BackToHomePage(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/h2/a")).click();
		Thread.sleep(2000);
	}
}
