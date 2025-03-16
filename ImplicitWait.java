package YT_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImplicitWait 
{
		
	WebDriver driver;
	String baseUrl;
	private WebElement ele;

	@BeforeMethod
	public void setUpChrome() throws Exception 
	{
		 //Step 1- Chrome Driver Setup
		  System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			
		  //Step 2- Driver Initialization
		  driver=new ChromeDriver();
		  
		  baseUrl = "http://www.google.com";
		  
	      //Step 3- Maximize the window  
	      driver.manage().window().maximize();		

	      //Step 4- Add implicit wait 
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testGoogleUntitle() throws Exception 
	{
		
	//Step 5- Lauching the Site using URL 	
	driver.get(baseUrl);
	
	//Step 6- Find Element on Webpage
	ele = driver.findElement(By.id("APjFqb"));
	ele.sendKeys("Download eclipse for java");
	ele.sendKeys(Keys.RETURN);
	
	
	//Step 7- Creat a List to store size 
	List<WebElement> list = driver.findElements(By.className("_Rm"));
	System.out.println(list.size());

	}

	@AfterMethod
	public void tearDown() throws Exception 
	{
		//Step 8- Exit or Quit from site
		driver.quit();
	}
	  
  }

