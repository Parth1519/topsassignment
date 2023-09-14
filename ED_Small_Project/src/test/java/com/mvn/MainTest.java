package com.mvn;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.browser.BrowserConfiguration;
import com.model.DownloadReceipt;
import com.model.LogingPage;
import com.model.OpenCart;
import com.model.ShippingAddress;
import com.model.SideManu;
import com.model.UpsideManu;


public class MainTest {

	WebDriver driver=null;
	LogingPage lp=null;
	SideManu s1=null;
	OpenCart O1=null;
	ShippingAddress sh1=null;
	DownloadReceipt Do1=null;
	UpsideManu Up1=null;
	
	@BeforeClass
	public void loadBrowser() throws InterruptedException 
	{
		driver=new BrowserConfiguration().
				ChromeBrowserSelection
				("chrome","https://bstackdemo.com/signin");
		driver.manage().window().maximize();
		Thread.sleep(3000);		
	}
	
	@BeforeTest()
	public void befrotest() {
		lp=new LogingPage(); 
		s1=new SideManu();
		O1=new OpenCart();
		sh1=new ShippingAddress();
		Do1=new DownloadReceipt();
		Up1=new UpsideManu();
		
	}
	
	
	@Test(priority = 0)
	public void longingDetils() throws InterruptedException {
		
		lp.enterUsername(driver);
		lp.enterPassword(driver);
		lp.clickLoging(driver);
		}
	@Test(priority = 1)
	public void sideMenu() throws InterruptedException {
		s1.clickapple(driver);
		s1.Samsung(driver);
		s1.Google_cart(driver);
		s1.OnePlus(driver);
		s1.AddToFavourites(driver);
		
	}
	@Test(priority = 2)
	public void OpenCart() throws InterruptedException {
        O1.float_cart_open(driver);
		O1.AddChangeProductButton(driver);
        O1.checkout(driver);

	}
	@Test(priority = 3)
	public void ShippingAddress() throws InterruptedException {
		sh1.FirstName(driver, "Parth");
		sh1.LastName(driver, "Upadhyay");
		sh1.Adress(driver, "C-19,Sahyog Society");
		sh1.city(driver,"Surat");
		sh1.postcode(driver,"394130");
		sh1.submitbutton(driver);
	}
	@Test(priority = 4)
	public void DownloadReceipt() throws InterruptedException {
	Do1.DownloadOrderReceipt(driver);
	Do1.BackToHomePage(driver);
		
	}
	
	@Test(priority = 5)
	public void UpsideManu() throws InterruptedException {
		Up1.Offers(driver);
		Up1.Orders(driver);
		Up1.Favourites(driver);
		Up1.logout(driver);
		Up1.Orderby(driver);
		
	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		System.out.println("bye bye");
		Thread.sleep(3000);
		driver.close();	
	}	
}