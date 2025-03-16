package YT_Programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginGmail 
{
	public WebDriver driver;
	
	@BeforeTest
	public void setup_chrome()
		{
			//Setup ChromeDriver
			System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}

	@Test(enabled=true, priority=1)
	public void navigate() throws InterruptedException
		{	
		
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(200);
			
			//Navigate To Gmail Page
			driver.navigate().to("https://www.Gmail.com"); 
			Thread.sleep(200);
					
		}
		
	@Test(enabled=true,priority=3)
	public void insert_details() throws InterruptedException
	{
		//Enter USERNAME
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("rohankapse520@gmail.com");
		Thread.sleep(100);
		
		//Click on Next button
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(200);
		
		//Enter PASSWORD	
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("rohan@320");
		Thread.sleep(100);
		
		//Click on Next button
		driver.findElement(By.id("//span[normalize-space()='Next']")).click();
		Thread.sleep(100);

		
		//Click on Login profile
		driver.findElement(By.xpath("//a[contains(@class,'gb_d gb_Da gb_H')]")).click();
		Thread.sleep(100);
	}
		@AfterTest()
		public void exit()
		{
			System.out.println("Gmail Login Successfully...");
			driver.quit();
		}
		
	}


