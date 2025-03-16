package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelect
{

public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
		{
		
		  //Step 1- Chrome Driver Setup
		  System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			
		  //Step 2- Driver Initialization
		  driver=new ChromeDriver();

	      //Step 3- Launching URL
	      driver.get("https://gmail.com");
	      
	      //Step 4- Maximize the window  
	      driver.manage().window().maximize();
	      Thread.sleep(100);
	      
	      //Step 5- Passing value as "RK Automation Shorts" in the email field
	      driver.findElement(By.id("identifierId")).sendKeys("rkautomation111@mail.com");
	      
	      //Step 6- To click on next button
	      driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	      
	      //Step 7- isSelected() method returns boolean value either True or False
	      Boolean Select = driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected();
	      System.out.println("Element selected is :"+Select);
	      
	      //Step 8- Quit the driver
	      driver.quit();
	      
		}

}