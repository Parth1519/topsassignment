import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Event
{
	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
    
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Parth");
        Thread.sleep(3000);
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("Abc@Gmail.com");
        Thread.sleep(3000);
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("C-19,Sahyog Society");
        Thread.sleep(3000);
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("A");
        Thread.sleep(3000);
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("C");
        Thread.sleep(3000);
        currentAddress.sendKeys(Keys.TAB);
        Thread.sleep(3000);
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(Keys.CONTROL);
        permanentAddress.sendKeys("V");
        Thread.sleep(3000);
        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        Thread.sleep(3000);
        driver.close();
	}
	private static void assertEquals(String attribute, String attribute2) {
		// TODO Auto-generated method stub
	}
}