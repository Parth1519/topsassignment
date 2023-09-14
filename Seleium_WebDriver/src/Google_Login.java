import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class Google_Login
{
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     
      driver.get("https://accounts.google.com/signin");
    
      WebElement l = driver.findElement(By.name("identifier"));
      l.sendKeys("abc@gmail.com");
      WebElement b = driver
      .findElement(By.className("VfPpkd-LgbsSe"));
      b.click();
     
      WebElement p = driver
      .findElement(By.name("password"));
      p.sendKeys("123456");
      b.click();
    
      driver.close();
   }
}