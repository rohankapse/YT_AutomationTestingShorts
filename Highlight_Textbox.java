package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Textbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		//Step 1- Chrome Driver Setup
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
		
		//Step 2- Driver Initialization
		WebDriver driver=new ChromeDriver();

        //Step 3- Launching URL
        driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
        
        //Step 4- Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(100);
        
        //Step 5- Inspect WebElement on site and send the value  
        WebElement usrname= driver.findElement(By.id("username"));
        usrname.sendKeys("rohan@yahoo.com");
        Thread.sleep(100);
        
        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys("rohan1234");
        Thread.sleep(100);
        	
        
        //Step 5- We Create a object of a JavascriptExecutor interface
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
      	JavascriptExecutor js1 = (JavascriptExecutor) driver;
        
      	//Step 6- Below Pass values based on css style using executeScript() method . 
    	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", usrname);
		Thread.sleep(100);
		
		js1.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid black;');", pass);
		Thread.sleep(200);
    	
		
    	//Step 7- Close the driver
    	driver.close();
	
	}
	
	
}
