import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium_WebDriver_Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		
		driver.findElement(By.id("offers")).click();
		
	}
}