import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Dropdown_Guru
{
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	    String baseURL = "https://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(3000);

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		Thread.sleep(3000);
		driver.close();
	}
}