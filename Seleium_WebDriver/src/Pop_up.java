
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up {
    public static void main(String[] args) throws InterruptedException
    {
        // Setting the path of chrome driver
        System.setProperty(“webdriver.chrome.driver”, “Example Path”);

        // Creating an instance of chrome webdriver
        WebDriver driver = new ChromeDriver();

        // Navigating to the website
        driver.get(“http://eg.com/alerts”);

        // Finding the element that triggers the alert
        driver.findElement(By.id(“alertButton”)).click();

        // Switching to the alert
        Alert alert = driver.switchTo().alert();

        // Getting the text of the alert
        String alertText = alert.getText();
        System.out.println(“Alert text: ” + alertText);

        // Clicking the OK button
        alert.accept();

        // Clicking the Cancel button
        alert.dismiss();

        // Sending a text to the alert
        alert.sendKeys(“Example text to the alert”);

        // Close the browser
        driver.quit();
    }
}