package YT_Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts 
{
	    public static void main(String[] args) throws InterruptedException
	    {
	    	//Chrome Driver Setup
			System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
			
			//Driver Initialization
			WebDriver driver=new ChromeDriver();
			
	        // Navigate to a webpage with an alert.
	        driver.get("https://demo.automationtesting.in/Alerts.html");
	        
	        driver.manage().window().maximize();
	        Thread.sleep(200);
	        
	        // Find a button or element that triggers an alert.
	        WebElement alertButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

	        // Click the button to trigger the alert.
	        alertButton.click();
	        Thread.sleep(200);
	        
	        // Switch to the alert.
	        Alert alert = driver.switchTo().alert();

	        //Accepting the alert
	        alert.accept();
	        Thread.sleep(200);
	        	        
	        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
	        Thread.sleep(200);
	        
	        //Webelement of confirm alert
	        WebElement confirmalert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	      
	        //Accept the Alert
	        confirmalert.click();
	        Thread.sleep(200);
	        
	        //Switch to the alert.
	        Alert confm_alert = driver.switchTo().alert();
	      
	        //Click on Cancel
	        confm_alert.dismiss();
	        Thread.sleep(200);
	        
	        //Click on Prompt Option
	        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
	        Thread.sleep(200);
	        
	        
	        //Webelement of confirm alert
	        WebElement promptalert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	        
	        
	        promptalert.click();
	        Thread.sleep(200);
	       
	        //Switch to the alert.
	        Alert prompt_alert = driver.switchTo().alert();
	        
	       
	        //Store message 
	        String text=prompt_alert.getText(); 
	        
	        //Accept the Alert
	        prompt_alert.accept();
	        Thread.sleep(300);
	        
	        System.out.println("The Message is:" +text);
	        Thread.sleep(200);
	        
	        // Close the WebDriver.
	        driver.close();
	        Thread.sleep(200);
	    }
	}

