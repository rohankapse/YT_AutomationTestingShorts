package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts_Handling 
{

public static WebDriver w;
	
public static void main(String[] args) throws InterruptedException
	{
		//SetUpchrome
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chrome-win64\\chromedriver.exe");
		
		//Driver Initialization
		w=(WebDriver) new ChromeDriver();
	
		//Navigate To Site
		w.get("https://demoqa.com/alerts");
		w.manage().window().maximize();
		Thread.sleep(100);
			
		//Click on Alert Button 
		w.findElement(By.id("alertButton")).click();
		Thread.sleep(400);
		
		//Click on Timer Alert
		w.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(200);
		
		//Click On Confirm Button
		w.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(200);
		
		//Click On Confirm Button
		w.findElement(By.id("promtButton"));
		Thread.sleep(200);
		
		//Enter Data using Action class Object
		Actions a=new Actions(w);
		a.sendKeys("RK Automation Testing");
		Thread.sleep(200);
		
		//Close the window
		w.close();

	}

}
