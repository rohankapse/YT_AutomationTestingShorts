package YT_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class types_xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		//Step 1- Chrome Driver Setup
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
				
		//Step 2- Driver Initialization
		WebDriver driver=(WebDriver) new ChromeDriver();
		 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		 
		//Step 3- Launching URL
		driver.get("https://demoqa.com/register");
		 
		//Step 4- Maximize the window  
		driver.manage().window().maximize();
		Thread.sleep(100);
		 
		// Xpath Syntax:		
		// Xpath = //tagname[@Attribute=’value’]
		
		//Step 5- Find Elements by Xpath
		
		//xpath for First Name tab
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("RAHUL"); 
		
		//xpath for Last name box
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("KANDE"); 
		 
		//xpath for username
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rahulk");
		
		//xpath for password 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rahul@7896"); 
				 
		 //Step 6-Scroll Down in Window
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	     int scrollValue = 250;
	        
	     //Step 7-Execute the scrolling operation
	     js.executeScript("window.scrollBy(0, " + scrollValue + ")");
	     Thread.sleep(1000);
		 
	
	     //xpath for submit button
		 driver.findElement(By.xpath("//button[@id='register']")).click();
		 // xpath for submit button
		
		 Thread.sleep(1000);
		 
		 //Step 8-Close the window
		 driver.close();
		 
	}
		
	

}

