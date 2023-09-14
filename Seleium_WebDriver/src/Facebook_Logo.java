import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class Facebook_Logo
{				
	public static void main(String[] args) throws InterruptedException
	{									
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";					
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();		
		if (driver.getTitle().equals("Facebook - log in or sign up"))
		{							
			System.out.println("We are back at Facebook's homepage");					
		}
		else
		{			
            System.out.println("We are NOT in Facebook's homepage");					
		}
		Thread.sleep(3000);
		driver.close();
    }		
}