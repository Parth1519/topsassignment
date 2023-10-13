package Appium_Project;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;

public class Calculator_Project_1
{

	@Test
	
	public void openCalculator()throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
	
		cap.setCapability("deviceName", "Xiaomi 22041216I");
		cap.setCapability("udid", "6DI7UOYDVKY9FQ9X");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability("appPackage", "com.dencreak.dlcalculator");
		cap.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("automationName", "UIAutomator2");
	
		URL url = new URL("http://127.0.0.1:4723");
		AppiumDriver driver = new AppiumDriver(url,cap);
		
		// Addition Of Two Number
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_b")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		System.out.println("Addition Answer Is : "+driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText());
		
		//Division Demo
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_a_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_b")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		System.out.println("Division Answer Is : "+driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText());
		Thread.sleep(2000);
		
		//Subtraction Demo
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_c_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_b")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		System.out.println("Subtraction Answer Is : "+driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText());
		Thread.sleep(2000);
		
		//Multiplication Demo
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_b_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_b")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		System.out.println("Multiplication Answer Is : "+driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText());
		Thread.sleep(2000);
		driver.quit();
	}
}