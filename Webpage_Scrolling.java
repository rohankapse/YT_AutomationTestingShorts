package YT_Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_Scrolling 
{

	public static void main(String[] args) throws Exception 
	{
		// Chrome Driver Setup
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
		
		// Driver Initialization
		WebDriver driver=new ChromeDriver();
		
		
        // Navigate to a webpage with an alert.
        driver.navigate().to("https://en.wikipedia.org/wiki/Test_automation");
        
        
        // Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(200);
        
       // To perform Scroll on site 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        int scrollValue = 500;
        
        // Execute the scrolling operation
        js.executeScript("window.scrollBy(0, " + scrollValue + ")");
        Thread.sleep(1000);
        
        // Close the window 
        driver.close();
  
        
	}

}
