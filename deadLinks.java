package YT_Programs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deadLinks 
{
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		  //Step 1- Chrome Driver Setup
		  System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			
		  //Step 2- Driver Initialization
		  driver=new ChromeDriver();

	      //Step 3- Launching URL
	      driver.get("https://demoqa.com/login");
	      
	      //Step 4- Maximize the window  
	      driver.manage().window().maximize();
	      Thread.sleep(100);

	      //Step 5- Finding all the available links on page
	      List<WebElement> links = driver.findElements(By.tagName("a"));

	      //Step 6- Iterating each link and checking the response status
	      for (WebElement link : links) 
	      {
	    	  
	      String url = link.getAttribute("href");
	      verify_Link(url);
	      
	      }
	      
	      driver.quit();
	}

public static void verify_Link(String url)
{
	try 
	{
	//Step 7- Create Obj of URL Class
	URL link = new URL(url);
	
	HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
	httpURLConnection.setConnectTimeout(4000); 
	
	//Step 8- Set connection timeout to 4 seconds
	httpURLConnection.connect();

	//Step 9- Check Valid  resposnse of link 
	if (httpURLConnection.getResponseCode() == 200) 
	{
		
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
	} 
	
	//Step 10- Check invalid  resposnse of link
	else
	{
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
	}
	
} 

	catch (Exception e) 
	{
		System.out.println(url + " - " + "is a broken link");
	}

  }
}
	

