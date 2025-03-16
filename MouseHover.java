package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover
{
	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver;
		  
		  //Step 1- Chrome Driver Setup
		  System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			
		  //Step 2- Driver Initialization
		  driver=new ChromeDriver();

	      //Step 3- Launching URL
	      driver.get("https://www.browserstack.com/");
	      
	      //Step 4- Maximize the window  
	      driver.manage().window().maximize();
	      Thread.sleep(100);		
			
	      //Step 5- Creating object of Action Class
	      Actions ac = new Actions(driver);
	     
	      //Step 6- For Scrolling on webpage
	      ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	      
	      //Step 7- Finding WebElement using WebElement object 
	      WebElement live= driver.findElement(By.xpath("//*[@id=\"featured-tab-content\"]/div[1]/div/div/a[1]/span[1]")); 
	      ac.moveToElement(live).build().perform();

	      Thread.sleep(3000);

	      WebElement automate= driver.findElement(By.xpath("//*[@id=\"featured-tab-content\"]/div[1]/div/div/a[2]/span[1]"));
	      automate.click();

	      Thread.sleep(2000);
	      
		  //Step 8- Window Close
		  driver.close();
		
	}

}
