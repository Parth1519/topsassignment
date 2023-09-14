import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class Radio_Button {				
    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();					

        driver.get("https://demo.guru99.com/test/radio.html");					
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");
        Thread.sleep(3000);
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");
        Thread.sleep(3000);
        		
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        Thread.sleep(3000);

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }
        Thread.sleep(3000);
         
        		
        		
        //Selecting Checkbox and using isSelected Method		
        driver.get("https://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }	
        Thread.sleep(3000);
		driver.close();		       		
    }		
}