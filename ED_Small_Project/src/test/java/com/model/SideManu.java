package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SideManu {
public void clickapple(WebDriver driver) throws InterruptedException {
		
		/*--selecting apple--*/
	Actions actions=new Actions(driver);
	WebElement 
	Apple=driver.findElement(By.xpath("//span[normalize-space()='Apple']"));
	Action a1=actions.moveToElement(Apple).build();
	a1.perform();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//span[normalize-space()='Apple']")).click();
		Thread.sleep(2000);
		
		//AddToFavourites
		//driver.findElement(By.xpath("//div[@id='1']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
		
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/div[4]")).click();
		Thread.sleep(2000);
		
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[4]/div[4]")).click();
		Thread.sleep(2000);
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[5]/div[4]")).click();
		Thread.sleep(2000);
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[6]/div[4]")).click();
		Thread.sleep(2000);
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[7]/div[4]")).click();
		Thread.sleep(2000);
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[8]/div[4]")).click();
		Thread.sleep(2000);
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[9]/div[4]")).click();
		Thread.sleep(2000);
		//colse the cart box
		
				driver.findElement(By.className("float-cart__close-btn")).click();
				Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[10]/div[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("float-cart__close-btn")).click();
		Thread.sleep(2000);
		
		
		//scroll up the web page
		JavascriptExecutor js= (JavascriptExecutor) driver; 
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);
		
		/*--unselecting apple*/
		
				driver.findElement(By.xpath("//span[normalize-space()='Apple']")).click();
				Thread.sleep(2000);
		
				
	}

public void Samsung(WebDriver driver) throws InterruptedException {
	//Samsung
	driver.findElement(By.xpath("//span[normalize-space()='Samsung']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[4]")).click();
	Thread.sleep(2000);
	
	//colse the cart box
	
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/div[4]")).click();
	Thread.sleep(2000);
	//colse the cart box
	
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[4]/div[4]")).click();
	Thread.sleep(2000);
	//colse the cart box
	
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[5]/div[4]")).click();
	Thread.sleep(2000);
	//colse the cart box
	
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[6]/div[4]")).click();
	Thread.sleep(2000);
	//colse the cart box
	
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[7]/div[4]")).click();
	Thread.sleep(2000);
	//colse the cart box
	
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[8]/div[4]")).click();
	Thread.sleep(2000);
	
	//colse the cart box
	
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
	
	
	//scroll up the web page
	JavascriptExecutor js= (JavascriptExecutor) driver; 
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-3000)");
	Thread.sleep(2000);
	
			
	
/*--unselecting Samsung-*/	
				
			Actions actions=new Actions(driver);
			WebElement Samsung=driver.findElement(By.xpath("//span[normalize-space()='Samsung']"));
			Action a3=actions.moveToElement(Samsung).build();
			a3.perform();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[normalize-space()='Samsung']")).click();
			Thread.sleep(2000);
			

}
public void Google_cart(WebDriver driver) throws InterruptedException {
	
	
	//Google
			driver.findElement(By.xpath("//span[normalize-space()='Google']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			
			//colse the cart box
			
					driver.findElement(By.className("float-cart__close-btn")).click();
					Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/div[4]")).click();
			Thread.sleep(2000);
			
			//colse the cart box
			
					driver.findElement(By.className("float-cart__close-btn")).click();
					Thread.sleep(2000);
		
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[4]/div[4]")).click();
			Thread.sleep(2000);
			//colse the cart box
			
					driver.findElement(By.className("float-cart__close-btn")).click();
					Thread.sleep(2000);
					
					
					
					//scroll up the web page
					JavascriptExecutor js= (JavascriptExecutor) driver; 
					Thread.sleep(2000);
					js.executeScript("window.scrollBy(0,-3000)");
					Thread.sleep(2000);
					
					
					/*--unselecting Google*/
					
					Actions actions=new Actions(driver);
					WebElement Google=driver.findElement(By.xpath("//span[normalize-space()='Google']"));
					Action a1=actions.moveToElement(Google).build();
					a1.perform();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//span[normalize-space()='Google']")).click();
							Thread.sleep(2000);
}
public void OnePlus(WebDriver driver) throws InterruptedException {
	/*--selecting OnePlus--*/
	driver.findElement(By.xpath("//span[normalize-space()='OnePlus']")).click();
	Thread.sleep(2000);
	

	driver.findElement(By.xpath("//div[@id='20']//div[@class='shelf-item__buy-btn'][normalize-space()='Add to cart']")).click();
	Thread.sleep(2000);
		
	driver.findElement(By.className("float-cart__close-btn")).click();
	Thread.sleep(2000);
			
			
			
	
	driver.findElement(By.xpath("//div[@id='21']//div[@class='shelf-item__buy-btn'][normalize-space()='Add to cart']")).click();
	Thread.sleep(2000);
	
	//colse the cart box
	
			driver.findElement(By.className("float-cart__close-btn")).click();
			Thread.sleep(2000);

	driver.findElement(By.xpath("//div[@id='22']//div[@class='shelf-item__buy-btn'][normalize-space()='Add to cart']")).click();
	Thread.sleep(2000);
	//colse the cart box
	
			driver.findElement(By.className("float-cart__close-btn")).click();
			Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='23']//div[@class='shelf-item__buy-btn'][normalize-space()='Add to cart']")).click();
	Thread.sleep(2000);
	//colse the cart box
	
			driver.findElement(By.className("float-cart__close-btn")).click();
			Thread.sleep(2000);
			
	driver.findElement(By.xpath("//div[@id='24']//div[@class='shelf-item__buy-btn'][normalize-space()='Add to cart']")).click();
	Thread.sleep(2000);
	//colse the cart box
	
			driver.findElement(By.className("float-cart__close-btn")).click();
			Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='25']//div[@class='shelf-item__buy-btn'][normalize-space()='Add to cart']")).click();
	Thread.sleep(2000);
	//colse the cart box
	
			driver.findElement(By.className("float-cart__close-btn")).click();
			Thread.sleep(2000);
		

	/*--unselecting OnePlus*/
			
			//scroll up the web page
			JavascriptExecutor js= (JavascriptExecutor) driver; 
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-3000)");
			Thread.sleep(2000);
			
	/*--unselecting OnePlus*/
	
	Actions actions=new Actions(driver);
	WebElement OnePlus=driver.findElement(By.xpath("//span[normalize-space()='OnePlus']"));
	Action a12=actions.moveToElement(OnePlus).build();
	a12.perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[4]/label[1]/span[1]")).click();
	Thread.sleep(2000);
}

public void AddToFavourites(WebDriver driver) throws InterruptedException {
	
	
	driver.findElement(By.xpath("//div[@id='1']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='2']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='3']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='4']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='5']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='6']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='7']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='8']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='9']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='10']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='11']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='12']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='13']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='14']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='15']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='16']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='17']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='18']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='19']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='20']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='21']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='22']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='23']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='24']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='25']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
		
	//---un selecting
	//scroll up the web page
	JavascriptExecutor js= (JavascriptExecutor) driver; 
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-3000)");
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//div[@id='1']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='2']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
	Thread.sleep(2000);	
}
}