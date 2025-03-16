package YT_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class threadsleepmethod 
{
		static WebDriver driver;
		static String url = "https://www.redbus.in/";

		@BeforeClass
		public static void setUp() throws InterruptedException 
		{
			
			  //Step 1- Chrome Driver Setup
			  System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
				
			  //Step 2- Driver Initialization
			  driver=new ChromeDriver();

		      //Step 3- Launching URL
		      driver.get(url);
		      
		      //Step 4- Maximize the window  
		      driver.manage().window().maximize();
		      Thread.sleep(100);		

		}
		
		@Test(enabled=true)
		public void search () throws InterruptedException 
		{
			//Step 5- Click on Trains tab with thread sleep
			driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();
			Thread.sleep(200);
			
			//Step 6- Click on Search button with thread sleep 
			driver.findElement(By.xpath("//*[@id=\"bus_tickets_vertical\"]/img")).click();
			Thread.sleep(200);
		}

		@AfterClass
		public void tearDown() 
		{
			//Step 7- Quit from webpage
			driver.quit();
		}
	}

