package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
				//Step 1- Chrome Driver Setup
				System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
				
				//Step 2- Driver Initialization
				WebDriver driver=new ChromeDriver();

		        //Step 3- Launching URL
		        driver.get("https://demoqa.com/login");
		        
		        //Step 4- Maximize the window  
		        driver.manage().window().maximize();
		        Thread.sleep(100);
		        
		        //Step 5- Inspect WebElement on site and send the value  
		        WebElement usrname= driver.findElement(By.id("userName"));
		        usrname.sendKeys("rkautomation");
		        Thread.sleep(100);
		        
		        
		        WebElement pass= driver.findElement(By.id("password"));
		        pass.sendKeys("Rkautomation@123");
		        Thread.sleep(100);
		        	
		        //Step 6- Inspect WebElement on site and click on button
		        WebElement loginbtn= driver.findElement(By.id("login"));
		        loginbtn.click();
		        Thread.sleep(1000);
		        
		        WebElement usr= driver.findElement(By.id("userName-value"));
		        
		    	JavascriptExecutor js = (JavascriptExecutor) driver;
		        
		    	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", usr);
				Thread.sleep(100);
		       // driver.quit();
		        
		        
	}

}
