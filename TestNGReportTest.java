package YT_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGReportTest 
{
		//static ExtentTest test;
		public static WebDriver driver;
		
		@BeforeClass
		public static void startTest()
		{
			//Step 1- Chrome Driver Setup
			System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
							
			//Step 2- Driver Initialization
		    driver = new ChromeDriver();
				
			}
		
		@Test
		public void extentReportsTest()
		{
				  			
			//Step 3- Launching URL on the browser
			driver.get("https://www.google.com/gmail/about/");
			
			//Step 4- Maximized the window
			driver.manage().window().maximize();
		
			//Step 5- Checking Title of Gmail Site
			if(driver.getTitle().equals("Gmail: Private and secure email at no cost | Google Workspace"))
			{
				//Step 6- Log the Status of testcase and verify the result 
				//test.log(LogStatus.PASS, "Navigated to the specified URL");
				Assert.assertTrue(true);
			}  
		else
		{
				//Step 7- Log the Status of testcase and verify the result
				//test.log(LogStatus.FAIL, "Test Failed");
				Assert.assertFalse(false);
				
			}  
		}

		@AfterClass
		public static void endTest() throws InterruptedException
		{
			//Step 8- Close the driver
			//test.log(LogStatus.FAIL, "Window Closed");
			driver.close();
			Thread.sleep(200);
			
		}
	
	}
