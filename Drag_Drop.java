package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

	public class Drag_Drop 
	{
		@Test
		public void dragDrop() throws InterruptedException
		{ 
			 //Step 1- Chrome Driver Setup
			 System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
					
			 //Step 2- Driver Initialization
			 ChromeDriver driver=new ChromeDriver();

			 //Step 3- Launching URL
			 driver.get("http://demo.guru99.com/test/drag_drop.html");
			        
			 //Step 4- Maximize the window  
			 driver.manage().window().maximize();
			 Thread.sleep(100);
			 
             //Step 5-Scroll Down in Window
		     JavascriptExecutor js = (JavascriptExecutor) driver;
		        
		     int scrollValue = 250;
		        
		     //Step 6-Execute the scrolling operation
		     js.executeScript("window.scrollBy(0, " + scrollValue + ")");
		     Thread.sleep(1000);
			 
			 //Step 7-Element which needs to drag.    		
			 WebElement src=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			 
			 WebElement source=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));	
			                 
			 //Step 8-Element on which need to drop.		
			 WebElement dest=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));					
			                 		
			 WebElement des=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
			
		
			 //Step 9-Using Action class for drag and drop.		
			 Actions a=new Actions(driver);					

			 //Step 10-Dragged and dropped.
			 a.dragAndDrop(source, dest).build().perform();
			 
			 a.dragAndDrop(src, des).build().perform();		
			 Thread.sleep(500);
			 
			 driver.close();
			 
		}			        

	}

	
