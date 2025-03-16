package YT_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait 
{
	// created reference variable for WebDriver
	public WebDriver driver;

	@BeforeMethod
	public void setupDriver() throws InterruptedException 
	{
	
		
		
	//Step 1- Chrome Driver Setup
	System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			
	//Step 2- Driver Initialization
	driver=new ChromeDriver();
		  			
	//Step 3- Launching URL on the browser
	driver.get("https://demoqa.com/login");
	
	//Step 4- Maximized the window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	

	@Test
	public void testlogin() throws InterruptedException
	{
	
	//Step 5- Saving the GUI element reference into a "element" variable of WebElement type
	WebElement usrname = driver.findElement(By.id("userName"));
	
	//Step 6- Entering username
	usrname.sendKeys("RK");
	usrname.sendKeys(Keys.RETURN);
	
	//Step 7- Entering password
	driver.findElement(By.id("password")).sendKeys("Rkautomation@20");
	
	//Step 8- Clicking on loginin button
	driver.findElement(By.id("login")).click();
	Thread.sleep(4000);
	
	
	//Step 9- Explicit wait for logout button
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"submit\"]")));
	
	//Step 10- Click on the logout button as soon as the "logout" button is visible
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	Thread.sleep(4000);
	System.out.println("User Logout Successfully..");
	
	}
	
	@AfterMethod
	public void teardown() 
	{
		//Step 11- Closes all the windows		
		driver.quit();
	}

}