package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders 
{
	
//	Syntax for DataProvider: @DataProvider(name= “searchProvider”)
	
	@Test(dataProvider="testdata")
	public void TestFBLogin(String usrname,String pass) throws InterruptedException
	{
	
		 WebDriver driver;
		  
		  //Step 1- Chrome Driver Setup
		  System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			
		  //Step 2- Driver Initialization
		  driver=new ChromeDriver();

	      //Step 3- Launching URL
		  driver.get("https://www.facebook.com/");
			
	      //Step 4- Maximize the window  
	      driver.manage().window().maximize();
	      Thread.sleep(100);		

		  //Step 5- Enter username
		  driver.findElement(By.id("email")).sendKeys(usrname);
		
		  //Step 6- Enter password
		  driver.findElement(By.id("pass")).sendKeys(pass);
		
		  //Step 7- Add Some Wait time
		  WebDriverWait wait = new WebDriverWait(driver,20);
		
		  //Step 8- Close the Webpage
		  driver.close();
		  
}
	
//Creating a method for Dataprovider	
 @DataProvider(name="testdata")
 public Object[][] Fetch_TestData()
	{
	
		//Step 1- Create object array with 2 parameters- first is row and second is column
		Object [][] fb_data=new Object[2][2];
	
		//Step 2- Enter data to row 0 column 0
		fb_data[0][0]="username1@gmail.com";
		
		//Step 3- Enter data to row 0 column 1
		fb_data[0][1]="Password1";
		
		//Step 4- Enter data to row 1 column 0
		fb_data[1][0]="username2@gmail.com";
		
		//Step 5- Enter data to row 1 column 0
		fb_data[1][1]="Password2";
		
		//Step 6- return array of object
		return fb_data;	
	
	}
}
